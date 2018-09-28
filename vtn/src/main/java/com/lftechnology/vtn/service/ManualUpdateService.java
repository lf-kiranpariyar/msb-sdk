package com.lftechnology.vtn.service;


import com.lftechnology.vtn.dto.response.ManualTransactionResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.Map;

public interface ManualUpdateService {
    @POST("ManualUpdateStatus.asp")
    @FormUrlEncoded
    Call<ManualTransactionResponse> getUpdateStatus(@FieldMap Map<String, String> params);

}
