package com.lftechnology.msb.moneytun.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.moneytun.dto.APIContext;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class RequestApi {

    public static Retrofit getRetrofitObject(APIContext apiContext){

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder();
                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        ObjectMapper objectMapper = new ObjectMapper();

        return new Retrofit
                .Builder()
                .baseUrl(apiContext.getEndPointUrl())
                .client(httpClient.build())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .build();
    }
}
