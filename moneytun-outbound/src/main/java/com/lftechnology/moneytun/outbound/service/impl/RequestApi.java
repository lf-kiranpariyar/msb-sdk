package com.lftechnology.moneytun.outbound.service.impl;

import com.lftechnology.moneytun.outbound.constant.CommonConstant;
import com.lftechnology.moneytun.outbound.exception.ApiException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import java.io.IOException;
import java.util.Map;

public class RequestApi {

    private String baseURL;
    private Headers headers;

    public RequestApi(Map<String,String> headerMap){
        this.baseURL = CommonConstant.BASE_URL;
        this.headers = buildHeader(headerMap);
    }

    public RequestApi() {
    }

    public Retrofit getRetrofitObject(){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {

            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder()
                        .headers(headers);
                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        return new Retrofit
                .Builder()
                .baseUrl(this.baseURL)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static Headers buildHeader(Map<String,String> headerMap){
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : headerMap.entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        return builder.build();
    }


    /**
     * This generic method will excute call object of generic type
     * @param call
     * @param <T>
     * @return response body from api call if successful response
     */
    public <T> T executeApiCall(Call<T> call) {
        try {
            retrofit2.Response<T> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }



}