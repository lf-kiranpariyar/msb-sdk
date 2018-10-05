package com.lftechnology.vtn.service;


import com.lftechnology.vtn.dto.response.BankResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.Map;


public interface BankApiService {


    @FormUrlEncoded
    @POST("RemittanceNameEnquiry.asp")
    Call<BankResponse> verifyBank(@FieldMap Map<String, String> params);

}

