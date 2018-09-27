package com.lftechnology.vtn.sdk.services;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ManualUpdateService {
    @POST
    @FormUrlEncoded
    Call<ManualUpdateResponseDTO> getStatus(@Field("AccessToken") String accessToken, @Field("AccessKey") String accessKey, @Field("TransactionId") String transactionId);

}
