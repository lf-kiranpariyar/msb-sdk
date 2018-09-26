package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.constants.CommonConstant;
import com.lftechnology.vtn.sdk.dto.Credential;
import okhttp3.*;
import retrofit2.Retrofit;
import retrofit2.converter.jaxb.JaxbConverterFactory;

import java.io.IOException;

/**
 * All the request are made of this class
 * @author Shankar Ghimire <shankarghimire@lftechnology.com>
 */

public class RequestApi {

    private String baseUrl;

    public RequestApi(){
        this.baseUrl =CommonConstant.BASE_URL;

    }

    /**
     * Return Retrofit object which uses oKHttpClient interceptor to add  credential on request body and
     * header on request,
     * JaxbConverterFactroy to convert xml into java Object
     *
     * @return : Retrofit objcect
     */
    public Retrofit getRetrofitObject(){

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            public Response intercept(Chain chain) throws IOException {
                Request original;
                original = chain.request();
                Request.Builder requestBuilder = original.newBuilder();

                RequestBody credential
                        = new FormBody.Builder()
                        .add("AccessToken", Credential.getAccessToken())
                        .add("AccessKey", Credential.getAccessKey())
                        .build();

                Request request = requestBuilder.addHeader("Content-Type", CommonConstant.CONTENT_TYPE)
                        .post(credential)
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
