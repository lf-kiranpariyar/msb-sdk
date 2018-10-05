package com.lftechnology.moneytun.outbound.service.impl;

import com.lftechnology.moneytun.outbound.constant.CommonConstant;
import com.lftechnology.moneytun.outbound.dto.APIContext;
import com.lftechnology.moneytun.outbound.exception.ApiException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class RequestApi {

    private APIContext apiContext;

    public RequestApi(APIContext apiContext) {
        this.apiContext = apiContext;
    }


    public Retrofit getRetrofitObject() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(logging);
        httpClient.addInterceptor(new Interceptor() {

            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder()
                        .addHeader("Content-Type", CommonConstant.CONTENT_TYPE)
                        .addHeader("Authentication", apiContext.getAuthentication());
                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        return new Retrofit
                .Builder()
                .baseUrl(apiContext.getEndPointUrl())
                .client(httpClient.build())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    /**
     * This generic method will execute call object of generic type
     *
     * @param call
     * @param <T>
     * @return response body from api call if successful response
     * @throws ApiException when the response code is not equals to 200 OK
     */
    public <T> T executeApiCall(Call<T> call) {
        try {
            retrofit2.Response<T> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException();
            }
            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }


}
