package com.lftechnology.vtn.sdk.api;


import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.BalanceResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
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
     * Request on this <a>https://www.VirtualTerminalNetwork.com/API/RemittanceBalanceStatus.asp</a> with Crendential
     * and map the response to Balance dto
     * @return
     */
    public BalanceResponseDTO getBalance(Credentials credentials) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BalanceApiService service = retrofit.create(BalanceApiService.class);
        Call<BalanceResponseDTO> call = service.getBalance(credentials.getAccessToken(),credentials.getAccessKey());
        BalanceResponseDTO b = executeApiCall(call);


      return  b;

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
