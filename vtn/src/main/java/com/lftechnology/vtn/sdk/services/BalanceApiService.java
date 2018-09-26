package com.lftechnology.vtn.sdk.services;

import com.lftechnology.vtn.sdk.dto.Balance;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BalanceApiService {
    @POST("RemittanceBalanceStatus.asp")
    Call<Balance> getBalance();
}
