package com.lftechnology.moneytun.outbound.service;


import com.lftechnology.moneytun.outbound.dto.Response;
import com.lftechnology.moneytun.outbound.dto.Transaction;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

import java.util.List;

public interface OutboundResource {

    @GET("token")
    Call<Response> getToken(@Query("id") String id);

    @GET("transaction")
    Call<List<Transaction>> getUnpaidTRansactionList(@Query("method_name") String methodName, @Query("TransferNo") String transferNo, @Query("payeecode") String payeeCode);


    @GET("transaction")
    Call<Response> conformTRansaction(@Query("method_name") String methodName, @Query("TransferNo") String transferNo, @Query("payeecode") String payeeCode);

}
