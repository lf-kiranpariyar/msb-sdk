package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Request.AccountStatusRequestDTO;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import com.lftechnology.vtn.sdk.services.AccountApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class AccountApi {

    private RequestApi requestApi;

    public AccountApi() {

        this.requestApi = new RequestApi();
    }

    public AccountStatusResponseDTO getAccount(AccountStatusRequestDTO account, Credentials credentials) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        AccountApiService service = retrofit.create(AccountApiService.class);
        Call<AccountStatusResponseDTO> call =  service.getAccount(credentials.getAccessToken(),credentials.getAccessKey(),account.getEmail());;
        AccountStatusResponseDTO accountStatusResponseDTO = executeApiCall(call);

        if(accountStatusResponseDTO.getCode().equals("R00")){
            return  accountStatusResponseDTO;
        }
        throw new VtnException(accountStatusResponseDTO.getMessage(),accountStatusResponseDTO.getCode());

    }



    private AccountStatusResponseDTO executeApiCall(Call<AccountStatusResponseDTO> call) {
        try {
            Response<AccountStatusResponseDTO> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }


}
