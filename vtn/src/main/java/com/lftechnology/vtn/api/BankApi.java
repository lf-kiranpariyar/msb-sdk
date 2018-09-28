package com.lftechnology.vtn.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.vtn.constant.CommonConstant;
import com.lftechnology.vtn.dto.request.BankRequest;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.BankResponse;
import com.lftechnology.vtn.exception.VtnException;
import com.lftechnology.vtn.service.BankApiService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.HashMap;
import java.util.Map;

/**
 * Bank related Api request are handle by this class
 *
 * @author shankar ghimire
 */

public class BankApi {

    private RequestApi requestApi;

    public BankApi(Credential credential) {
        this.requestApi = new RequestApi(credential);
    }

    /**
     * verifyBank will call Api to verify Bank  and if sucess return BankResponse object
     *
     * @param bankRequest :@see BankRequest
     * @return
     */
    public BankResponse verifyBank(BankRequest bankRequest) {

        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BankApiService service = retrofit.create(BankApiService.class);
        Map<String, String> requestField = new HashMap<String, String>();
        requestField.put("BankName", bankRequest.getBankName());
        requestField.put("BankAccountName", bankRequest.getBankAccountName());
        requestField.put("BankAccountNumber", bankRequest.getBankAccountNumber());


        ObjectMapper oMapper = new ObjectMapper();
        Map<String, String> map = oMapper.convertValue(bankRequest, Map.class);


        Call<BankResponse> call = service.verifyBank(map);
        BankResponse bankResponse = requestApi.executeApiCall(call);
        if (!bankResponse.getCode().equals(CommonConstant.SUCCESS))
            throw new VtnException(bankResponse.getMessage(), bankResponse.getCode());

        return bankResponse;
    }


}
