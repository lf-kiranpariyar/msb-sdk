package com.lftechnology.vtn.sdk.api;


import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.BalanceResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import com.lftechnology.vtn.sdk.services.BalanceApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

/**
 * Balance related Api request are handle by this class
 * @author shankar ghimire
 */

public class BalanceApi {

    private RequestApi requestApi;

    public BalanceApi() {
        this.requestApi = new RequestApi();
    }

    /**
     * This method is used to get Balance from API
     * @param credentials :Take accessToken and accessKey only
     * @return BalanceResponceDTO : return only if there responce code is R00
     */
    public BalanceResponseDTO getBalance(Credentials credentials) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BalanceApiService service = retrofit.create(BalanceApiService.class);
        Call<BalanceResponseDTO> call = service.getBalance(credentials.getAccessToken(),credentials.getAccessKey());
        BalanceResponseDTO balanceResponseDTO = executeApiCall(call);
        if(balanceResponseDTO.getCode().equals("R00"))
            return balanceResponseDTO;
        throw new VtnException(balanceResponseDTO.getMessage(),balanceResponseDTO.getCode());

    }





    /**
     * Executes Api call and Handle any Error on Api Call
     * @param call
     * @return
     */
    private BalanceResponseDTO executeApiCall(Call<BalanceResponseDTO> call) {
        try {
            Response<BalanceResponseDTO> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }
}
