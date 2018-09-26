package com.lftechnology.vtn.sdk.services;


import com.lftechnology.vtn.sdk.dto.Response.BankResponseDTO;
import retrofit2.Call;
import retrofit2.http.*;


public interface BankApiService {


        @FormUrlEncoded
        @POST("RemittanceNameEnquiry.asp")
        Call<BankResponseDTO> verifyBank(@Field("AccessToken") String accessToken,
                                         @Field("AccessKey") String accessKey,
                                         @Field("BankName") String bankName,
                                         @Field("BankAccountName") String bankAccountName,
                                         @Field("BankAccountNumber") String bankAccountNum);

}

