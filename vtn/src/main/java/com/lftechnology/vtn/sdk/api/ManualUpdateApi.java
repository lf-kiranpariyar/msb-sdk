package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.ManualUpdateListResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.services.ManualUpdateService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class ManualUpdateApi {
    private RequestApi requestApi;

    public ManualUpdateApi(){
        this.requestApi = new RequestApi();
    }

    public ManualUpdateListResponseDTO getUpdateStatus(Credentials credentials, String transactionId){

        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ManualUpdateService manualUpdateService = retrofit.create(ManualUpdateService.class);
        Call<ManualUpdateListResponseDTO> call = manualUpdateService.getUpdateStatus(credentials.getAccessToken(),credentials.getAccessKey(),transactionId);
        ManualUpdateListResponseDTO manualUpdateListResponseDTO  = executeApiCall(call);
        return manualUpdateListResponseDTO;
    }



    private ManualUpdateListResponseDTO executeApiCall(Call<ManualUpdateListResponseDTO> call) {
        try {
            Response<ManualUpdateListResponseDTO> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }
}

