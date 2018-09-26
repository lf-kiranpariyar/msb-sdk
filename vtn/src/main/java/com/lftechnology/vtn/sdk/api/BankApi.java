package com.lftechnology.vtn.sdk.api;


import com.lftechnology.vtn.sdk.dto.Request.BankRequestDTO;
import com.lftechnology.vtn.sdk.dto.Response.BankResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.services.BankApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class BankApi {

    private RequestApi requestApi;

    public BankApi(){
        this.requestApi = new RequestApi();
    }


    public BankResponseDTO verifyBank(BankRequestDTO bankNameRequestDTO) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BankApiService service = retrofit.create(BankApiService.class);
        String accessToken = bankNameRequestDTO.getAccessToken();
        String accessKey = bankNameRequestDTO.getAccessKey();
        String bankName = bankNameRequestDTO.getBankName();
        String bankAccountName = bankNameRequestDTO.getBankAccountName();
        String bankAccountNum = bankNameRequestDTO.getBankAccountNumber();
        Call<BankResponseDTO> call = service.verifyBank(accessToken,accessKey,bankName,bankAccountName,bankAccountNum);
        return executeApiCall(call);
    }


    private BankResponseDTO executeApiCall(Call<BankResponseDTO> call) {
        try {
            Response<BankResponseDTO> response = call.execute();
            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }
            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }

}
