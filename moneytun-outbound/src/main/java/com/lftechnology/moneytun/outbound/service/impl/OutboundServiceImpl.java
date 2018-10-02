package com.lftechnology.moneytun.outbound.service.impl;

import com.lftechnology.moneytun.outbound.dto.Response;
import com.lftechnology.moneytun.outbound.dto.TransactionResponse;
import com.lftechnology.moneytun.outbound.exception.ApiException;
import com.lftechnology.moneytun.outbound.service.OutboundResource;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class OutboundServiceImpl implements OutboundService {

    private RequestApi requestApi;

    public OutboundServiceImpl(){
        this.requestApi = new RequestApi(null);
    }


    @Override
    public Response getToken(String accessKey) {
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
}
