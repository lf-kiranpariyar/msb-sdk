package com.lftechnology.vtn.service;


import com.lftechnology.vtn.dto.response.BalanceResponse;
import retrofit2.Call;
import retrofit2.http.POST;

public interface BalanceApiService {


    @POST("RemittanceBalanceStatus.asp")
    Call<BalanceResponse> getBalance();
}
