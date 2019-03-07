package com.lftechnology.vtn.service;


import com.lftechnology.vtn.dto.response.TransactionResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.Map;

public interface TransactionApiService {

    @POST("Remittance.asp")
    @FormUrlEncoded
    Call<TransactionResponse> createTransaction(@FieldMap Map<String, String> params);


    @POST("RemittanceTransactionStatus.asp")
    @FormUrlEncoded
    Call<TransactionResponse> fetchStatus(@FieldMap Map<String, String> params);

}
