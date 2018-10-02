package com.lftechnology.moneytun.outbound.api;

import com.lftechnology.moneytun.outbound.constant.CommonConstant;
import okhttp3.*;
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

    public Retrofit getRetrofitObject(){

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {

            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
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

}
