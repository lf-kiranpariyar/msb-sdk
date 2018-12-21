package com.lftechnology.moneytun.outbound.service.impl;

import com.lftechnology.moneytun.outbound.constant.CommonConstant;
import com.lftechnology.moneytun.outbound.dto.APIContext;
import com.lftechnology.moneytun.outbound.exception.ApiException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RequestApi {

    private APIContext apiContext;

    public RequestApi(APIContext apiContext) {
        this.apiContext = apiContext;
    }

    private Headers buildHeader(Map<String,String> headerMap){
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : headerMap.entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        return builder.build();
    }

    public Retrofit getRetrofitObject() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        httpClient.addInterceptor(interceptor);
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                Map<String,String> headers= new HashMap<>();
                headers.put("Content-Type", CommonConstant.CONTENT_TYPE);
                headers.put("Authentication", apiContext.getAuthentication());
                Request.Builder requestBuilder = original.newBuilder().headers(buildHeader(headers));
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
