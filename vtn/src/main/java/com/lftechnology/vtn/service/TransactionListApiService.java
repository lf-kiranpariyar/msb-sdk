package com.lftechnology.vtn.service;

import com.lftechnology.vtn.dto.response.TransactionListResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TransactionListApiService {

    @POST("RemittanceTransactionStatus.asp")
    @FormUrlEncoded
    Call<TransactionListResponse> getTransaction(@Field("TransactionId") String transactionId);

}
