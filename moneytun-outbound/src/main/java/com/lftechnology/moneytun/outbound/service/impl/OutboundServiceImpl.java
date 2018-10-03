package com.lftechnology.moneytun.outbound.service.impl;

import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.Response;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;
import com.lftechnology.moneytun.outbound.exception.ApiException;
import com.lftechnology.moneytun.outbound.service.OutboundResource;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class OutboundServiceImpl implements OutboundService {

    Credential credential = new Credential();
    String accessKey = credential.getAccessKey();
    String secretKey = credential.getSecretkey();




    @Override
    public Response getToken(String accessKey) {
        RequestApi requestApi = new RequestApi();
        LOGGER.info("MoneyTun-Outbound get Token");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<Response> call = service.getToken(accessKey);
         Response response =requestApi.executeApiCall(call);
        if(response == null) {
            throw new ApiException();
        }
        return response;
    }

    @Override
    public UnpaidTransactionList getUnpaidTransactionList(String transferNo, String payeeCode) {

        Map<String,String> headerContent = new HashMap<>();
        headerContent.put("Content-Type","application/json");
        headerContent.put("Authentication",accessKey+":"+secretKey);

        RequestApi requestApi = new RequestApi(headerContent);
        LOGGER.info("MoneyTun-Outbound get unpaid transaction list");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<UnpaidTransactionList> call = service.getUnpaidTRansactionList("all" , transferNo, payeeCode);
        UnpaidTransactionList unpaidTransactionList = requestApi.executeApiCall(call);
        if(unpaidTransactionList == null){
            throw new ApiException();

        }
        return unpaidTransactionList;
    }

    @Override
    public Response confirmTransaction(String transferNo, String payeeCode) {

        Map<String,String> headerContent = new HashMap<>();
        headerContent.put("Content-Type","application/json");
        headerContent.put("Authentication",accessKey+":"+secretKey);

        RequestApi requestApi = new RequestApi(headerContent);
        LOGGER.info("MoneyTun-Outbound conform transaction ");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<Response> call = service.conformTRansaction("confirmation",transferNo, payeeCode);
        Response response = requestApi.executeApiCall(call);
        if(response == null){
            throw new ApiException();

        }
        return response;
    }
}
