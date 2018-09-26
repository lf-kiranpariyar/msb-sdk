package com.lftechnology.vtn.sdk.services;


import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AccountApiService {

    @POST("RemittanceAccountStatus.asp")
    @FormUrlEncoded
    Call<AccountStatusResponseDTO> getAccount(@Field("AccessToken") String accessToken,
                                              @Field("AccessKey") String accessKey,
                                              @Field("Email") String email
                             );


}
