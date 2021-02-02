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
import java.util.concurrent.TimeUnit;

/**
 * All the request are made of this class
 *
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

    private static String bodyToString(final RequestBody request) throws IOException {
        final Buffer buffer = new Buffer();
        try {
            final RequestBody copy = request;
            if (copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        } catch (final IOException e) {
            throw new IOException("Error while parsing request Body.");
        }

    }

    /**
     * Return Retrofit object which uses oKHttpClient interceptor to add  credential on request body and
     * header on request,
     * <p>
     * JaxbConverterFactroy to convert XML into java Object
     *
     * @return : Retrofit Object
     */
    public Retrofit getRetrofitObject() {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.retryOnConnectionFailure(false);
        httpClient.connectTimeout(5, TimeUnit.MINUTES).writeTimeout(5, TimeUnit.MINUTES).readTimeout(5, TimeUnit.MINUTES);
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
                        .post(RequestBody.create(MediaType.parse(CommonConstant.CONTENT_TYPE), postBodyString))
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
        postBodyString += ((postBodyString.length() > 0) ? "&" : "") + bodyToString(credentials);
        return postBodyString;
    }

    /**
     * This generic method will excute call object of generic type
     *
     * @param call
     * @param <T>
     * @return response body from api call if successful response
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
