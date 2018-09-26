package com.lftechnology.vtn.sdk.services;

import com.lftechnology.vtn.sdk.dto.Account;
import com.lftechnology.vtn.sdk.dto.Balance;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AccountApiService {

    @POST("RemittanceAccountStatus.asp")
    Call<Account> getAccount(@Body Account account);
}
