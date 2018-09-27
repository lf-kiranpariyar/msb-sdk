package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.TransactionListResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import com.lftechnology.vtn.sdk.services.TransactionListApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class TransactionListApi {

    private RequestApi requestApi;

    public TransactionListApi() {
        this.requestApi = new RequestApi();
    }

    public TransactionListResponseDTO retrieveTransaction(Credentials credentials, String transactionId) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        TransactionListApiService service = retrofit.create(TransactionListApiService.class);
        Call<TransactionListResponseDTO> call = service.getTransaction(credentials.getAccessToken(), credentials.getAccessKey(), transactionId);
        TransactionListResponseDTO transactionListResponseDTO = executeApiCall(call);
        if (transactionListResponseDTO.getCode().equals("R00")) {
            return transactionListResponseDTO;
        }

        throw new VtnException(transactionListResponseDTO.getMessage(), transactionListResponseDTO.getCode());
    }


    private TransactionListResponseDTO executeApiCall(Call<TransactionListResponseDTO> call) {
        try {
            Response<TransactionListResponseDTO> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }
}
