package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.constants.CommonConstant;
import okhttp3.*;
import retrofit2.Retrofit;
import retrofit2.converter.jaxb.JaxbConverterFactory;

import java.io.IOException;

/**
 * @author Shankar Ghimire <shankarghimire@lftechnology.com>
 */

public class RequestApi {

    private String baseUrl;

    public RequestApi(){
        this.baseUrl = CommonConstant.baseUrl;

    }

    public Retrofit getRetrofitObject(){

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder();

                Request request = requestBuilder.addHeader("Content-Type", CommonConstant.Content_Type)
                        .build();

                return chain.proceed(request);
            }
        });



        return new Retrofit
                .Builder()
                .baseUrl(this.baseUrl)
                .client(httpClient.build())
                .addConverterFactory(JaxbConverterFactory.create())
                .build();
    }

}
