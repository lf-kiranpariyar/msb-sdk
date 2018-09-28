package com.lftechnology.vtn.api;

import com.lftechnology.vtn.constant.CommonConstant;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.exception.ApiException;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.Buffer;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jaxb.JaxbConverterFactory;

import java.io.IOException;

/**
 * All the request are made of this class
 * @author Shankar Ghimire <shankarghimire@lftechnology.com>
 */

public class RequestApi {

    private String baseUrl;
    private String accessToken;
    private String accessKey;


    public RequestApi(Credential credential) {
        this.baseUrl = CommonConstant.BASE_URL;
        this.accessToken = credential.getAccessToken();
        this.accessKey = credential.getAccessKey();
    }

    /**
     * Return Retrofit object which uses oKHttpClient interceptor to add  credential on request body and
     * header on request,
     *
     * JaxbConverterFactroy to convert XML into java Object
     *
     * @return : Retrofit Object
     */
    public Retrofit getRetrofitObject() {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(logging);
        httpClient.addInterceptor(new Interceptor() {

            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder();
                RequestBody credentials = new FormBody.Builder()
                        .add("AccessToken", accessToken)
                        .add("AccessKey", accessKey)
                        .build();
                Request request = requestBuilder.addHeader("Content-Type", CommonConstant.CONTENT_TYPE)
                        .build();
                String postBodyString = getPostBodyString(credentials, request.body());
                request = requestBuilder
                        .post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded;charset=UTF-8"), postBodyString))
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

    private String getPostBodyString(RequestBody credentials, RequestBody request) throws IOException {
        String postBodyString = bodyToString(request);
        postBodyString += ((postBodyString.length() > 0) ? "&" : "") +  bodyToString(credentials);
        return postBodyString;
    }


    private static String bodyToString(final RequestBody request) throws IOException {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if(copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        }
        catch (final IOException e) {
           throw new IOException("Error while parsing request Body.");
        }
    }

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
