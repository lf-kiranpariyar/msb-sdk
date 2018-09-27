package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.constants.CommonConstant;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jaxb.JaxbConverterFactory;

import java.io.IOException;

/**
 * All the request are made of this class
 * @author Shankar Ghimire <shankarghimire@lftechnology.com>
 */

public class RequestApi {

    private String baseUrl;

    public RequestApi() {
        this.baseUrl = CommonConstant.BASE_URL;

    }

    /**
     * Return Retrofit object which uses oKHttpClient interceptor to add  credential on request body and
     * header on request,
     * JaxbConverterFactroy to convert xml into java Object
     *
     * @return : Retrofit objcect
     */
    public Retrofit getRetrofitObject() {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {

            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder();
                Request request = requestBuilder.addHeader("Content-Type", CommonConstant.CONTENT_TYPE)
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
