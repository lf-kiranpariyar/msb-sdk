package com.lftechnology.vtn.api;

import com.lftechnology.vtn.constant.CommonConstant;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.FxRateResponse;
import com.lftechnology.vtn.exception.VtnException;
import com.lftechnology.vtn.service.FxRateApiService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.HashMap;
import java.util.Map;


/**
 * Foreign Exchange Rate related api
 *
 * @author shankar ghimire
 */

public class FxRateApi {


    private RequestApi requestApi;

    public FxRateApi(Credential credential) {

        this.requestApi = new RequestApi(credential);
    }

    /**
     * @param currencyCode : string currency code (e.g USD)
     * @return
     */
    public FxRateResponse getRate(String currencyCode) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        FxRateApiService service = retrofit.create(FxRateApiService.class);
        Map<String, String> requestField = new HashMap<>();
        requestField.put("CurrencyCode", currencyCode);
        Call<FxRateResponse> call = service.getRate(requestField);
        FxRateResponse fxRateResponse =requestApi.executeApiCall(call);
        if (!fxRateResponse.getCode().equals(CommonConstant.SUCCESS)) {
            throw new VtnException(fxRateResponse.getMessage(), fxRateResponse.getCode());

        }

        return fxRateResponse;


    }


}
