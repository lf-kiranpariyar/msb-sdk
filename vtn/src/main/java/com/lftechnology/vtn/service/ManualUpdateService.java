package com.lftechnology.vtn.service;


import com.lftechnology.vtn.dto.response.ManualTransactionResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ManualUpdateService {
    @POST("ManualUpdateStatus.asp")
    @FormUrlEncoded
    Call<ManualTransactionResponse> getUpdateStatus(@Field("TransactionId") String transactionId);

}
