package com.lftechnology.vtn.sdk.services;

import com.lftechnology.vtn.sdk.dto.Response.TransactionListResponseDTO;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TransactionListApiService {

    @POST("RemittanceTransactionStatus.asp")
    @FormUrlEncoded
    Call<TransactionListResponseDTO> getTransaction(@Field("AccessToken") String accessToken,
                                                         @Field("AccessKey") String accessKey,
                                                         @Field("TransactionId") String transactionId );

}
