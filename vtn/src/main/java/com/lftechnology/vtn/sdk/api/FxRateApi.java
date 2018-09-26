package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import com.lftechnology.vtn.sdk.dto.Response.FxRateResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.services.FxRateApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class FxRateApi {


    private RequestApi requestApi;

    public FxRateApi() {

        this.requestApi = new RequestApi();
    }

    public FxRateResponseDTO getRate( Credentials credentials,String currencyCode) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        FxRateApiService service = retrofit.create(FxRateApiService.class);
        Call<FxRateResponseDTO> call =  service.getRate(credentials.getAccessToken(),credentials.getAccessKey(),currencyCode);;
        FxRateResponseDTO a = executeApiCall(call);

        return a;

    }


    private FxRateResponseDTO executeApiCall(Call<FxRateResponseDTO> call) {
        try {
            Response<FxRateResponseDTO> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }

}
