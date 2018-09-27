package com.lftechnology.vtn.sdk.services;


import com.lftechnology.vtn.sdk.dto.Response.ManualUpdateListResponseDTO;
import com.lftechnology.vtn.sdk.dto.Response.ManualUpdateResponseDTO;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ManualUpdateService {
    @POST("ManualUpdateStatus.asp")
    @FormUrlEncoded
    Call<ManualUpdateListResponseDTO> getStatus(@Field("AccessToken") String accessToken, @Field("AccessKey") String accessKey, @Field("TransactionId") String transactionId);

}
