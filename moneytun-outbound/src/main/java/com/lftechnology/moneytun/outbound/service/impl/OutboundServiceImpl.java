package com.lftechnology.moneytun.outbound.service.impl;

import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.Response;
import com.lftechnology.moneytun.outbound.dto.Transaction;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;
import com.lftechnology.moneytun.outbound.enums.MethodName;
import com.lftechnology.moneytun.outbound.exception.ApiException;
import com.lftechnology.moneytun.outbound.service.OutboundResource;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;


public class OutboundServiceImpl implements OutboundService {

    @Override
    public Response getToken(String accessKey) {
        RequestApi requestApi = new RequestApi();
       // LOGGER.info("MoneyTun-Outbound get Token");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<Response> call = service.getToken(accessKey);
         Response response =requestApi.executeApiCall(call);
        if(response.getCode() == null) {
            throw new ApiException();
        }
        return response;
    }

    @Override
    public UnpaidTransactionList getUnpaidTransactionList(Credential credential, String transferNo, String payeeCode) {
        RequestApi requestApi = new RequestApi(credential);
        //LOGGER.info("MoneyTun-Outbound get unpaid transaction list");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<UnpaidTransactionList> call = service.getUnpaidTRansactionList(MethodName.ALL.name(), transferNo, payeeCode);
       UnpaidTransactionList transactionList = requestApi.executeApiCall(call);

        return transactionList;
    }

    @Override
    public Response confirmTransaction(Credential credential, String transferNo, String payeeCode) {
        RequestApi requestApi = new RequestApi(credential);
        //LOGGER.info("MoneyTun-Outbound conform transaction ");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<Response> call = service.conformTRansaction(MethodName.CONFIRMATION.name(),transferNo, payeeCode);
        Response response = requestApi.executeApiCall(call);
        if(response == null){
            throw new ApiException();

        }
        return response;
    }

}
