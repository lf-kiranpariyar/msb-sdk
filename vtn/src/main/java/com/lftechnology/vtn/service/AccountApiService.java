package com.lftechnology.vtn.service;


import com.lftechnology.vtn.dto.response.AccountStatusResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.Map;

public interface AccountApiService {

    @POST("RemittanceAccountStatus.asp")
    @FormUrlEncoded
    Call<AccountStatusResponse> getAccount(@FieldMap Map<String, String> param);

}
