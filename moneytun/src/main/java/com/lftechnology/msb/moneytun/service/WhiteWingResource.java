package com.lftechnology.msb.moneytun.service;

import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.Country;
import com.lftechnology.msb.moneytun.dto.DeliveryMethod;
import com.lftechnology.msb.moneytun.dto.ListResponse;
import com.lftechnology.msb.moneytun.dto.Payer;
import com.lftechnology.msb.moneytun.dto.Token;
import com.lftechnology.msb.moneytun.dto.Transaction;
import com.lftechnology.msb.moneytun.dto.TransactionDetail;
import com.lftechnology.msb.moneytun.dto.TransactionResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface WhiteWingResource {

    @GET("countrylist")
    Call<ListResponse<Country>> getCountry(@Header("Authentication") String authentication, @Path("id") String id);


    @GET("deliverymethodlist")
    Call<ListResponse<DeliveryMethod>> getDeliveryMethod(@Header("Authentication") String authentication);


    @GET("deliverymethodlist")
    Call<Token> getToken(@Query("id") String accessToken);

    @GET("payerlist")
    Call<ListResponse<Payer>> getPayer(@Header("Authentication") String authentication, @Query("isocode") String countryISOCode);

    @POST("transactions")
    Call<TransactionResponse> create(@Header("Authentication") String authentication, @Query("id") String action, @Body Transaction transaction);


    @GET("transactions")
    Call<TransactionResponse> getTransaction(@Header("Authentication") String authentication, @Header("id") String action, @Header("TransferNumber") String referenceNumber);


    @GET("transactions")
    Call<Transaction> create(@Header("Authentication") String authentication, @Header("TransferNumber") String referenceNumber, @Header("id") String action);

    @GET("transaction")
    Call<ListResponse<TransactionDetail>> getStatus(@Header("Authentication") String authentication, @Query("id") String action, @Header("TransferNumber") String referenceNumber);


    @GET("bank")
    Call<ListResponse<Bank>> getBankList(@Header("Authentication") String authentication, @Query("qry") String action, @Header("Data") String data);

}
