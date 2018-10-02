package com.lftechnology.moneytun.outbound.service;


import com.lftechnology.moneytun.outbound.dto.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface OutboundResource {

    @GET("token")
    Call<Response> getToken(@Query("id") String id);

}
