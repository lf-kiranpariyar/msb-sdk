package com.lftechnology.vtn.api;

import com.lftechnology.vtn.constant.CommonConstant;
import com.lftechnology.vtn.dto.response.ManualTransactionResponse;
import com.lftechnology.vtn.exception.VtnException;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.service.ManualUpdateService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shankar ghimire
 */

public class ManualUpdateApi {
    private RequestApi requestApi;

    public ManualUpdateApi(Credential credential) {

        this.requestApi = new RequestApi(credential);

    }


    public ManualTransactionResponse getUpdateStatus(String transactionId) {


        Retrofit retrofit = this.requestApi.getRetrofitObject();


        ManualUpdateService service = retrofit.create(ManualUpdateService.class);


        Map<String, String> requestField = new HashMap<>();
        requestField.put("TransactionId", transactionId);

        Call<ManualTransactionResponse> call = service.getUpdateStatus(requestField);

        ManualTransactionResponse manualTransactionResponse = requestApi.executeApiCall(call);


        if (!manualTransactionResponse.getCode().equals(CommonConstant.SUCCESS)) {

            throw new VtnException(manualTransactionResponse.getMessage(), manualTransactionResponse.getCode());

        }

        return manualTransactionResponse;


    }

}



