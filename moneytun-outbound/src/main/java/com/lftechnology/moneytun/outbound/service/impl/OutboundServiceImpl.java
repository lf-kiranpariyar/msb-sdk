package com.lftechnology.moneytun.outbound.service.impl;

import com.lftechnology.moneytun.outbound.constant.CommonConstant;
import com.lftechnology.moneytun.outbound.dto.APIContext;
import com.lftechnology.moneytun.outbound.dto.OutboundResponse;
import com.lftechnology.moneytun.outbound.dto.Transaction;
import com.lftechnology.moneytun.outbound.enums.MethodName;
import com.lftechnology.moneytun.outbound.exception.OutboundException;
import com.lftechnology.moneytun.outbound.service.OutboundResource;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;


public class OutboundServiceImpl implements OutboundService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OutboundServiceImpl.class);


    /**
     * method will get all the unpaid transaction list
     *
     * @return UnpaidTransactionList : transactionList
     * @throws OutboundException if OutboundResponse Code is not equal to 1
     *                           code: 1   message : Success
     *                           code: 2   message : No data found
     *                           code:-1   message: Wrong method called
     *                           code:-2   message: Invalid data entered
     * @params Credential: credential{accesskey , secretkey} , String : transerNo , String:payeeCode
     */

    @Override
    public List<Transaction> getUnpaidTransactionList(APIContext apiContext, String transferNo, String payeeCode) {
        RequestApi requestApi = new RequestApi(apiContext);
        LOGGER.info("MoneyTun-Outbound get unpaid transaction list");
        LOGGER.info("MoneyTun-Outbound get unpaid transaction list {}" , apiContext.getAuthentication());
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<List<Transaction>> call = service.getUnpaidTransactionList(apiContext.getAuthentication(), MethodName.ALL.name(), "", payeeCode);
        return requestApi.executeApiCall(call);
    }

    /**
     * method will confirm the received unpaid transaction list so that they will not be sent in next request
     *
     * @return OutboundResponse : outboundResponse{code: , message:}
     * @throws OutboundException if OutboundResponse Code is not equal to 1
     * @params Credential: credential{accesskey , secretkey} , String : transerNo , String:payeeCode
     */

    @Override
    public OutboundResponse confirmTransaction(APIContext apiContext, String transferNo, String payeeCode) {
        RequestApi requestApi = new RequestApi(apiContext);
        LOGGER.info("MoneyTun-Outbound conform transaction ");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<OutboundResponse> call = service.confirm(apiContext.getAuthentication(), MethodName.CONFIRMATION.name(), transferNo, payeeCode);
        OutboundResponse outboundResponse = requestApi.executeApiCall(call);
        if (!outboundResponse.getCode().equals(CommonConstant.SUCCESS)) {
            throw new OutboundException(outboundResponse.getCode(), outboundResponse.getMessage());
        }
        return outboundResponse;
    }

    @Override
    public OutboundResponse cancel(APIContext apiContext, String transferNo, String payeeCode) {
        RequestApi requestApi = new RequestApi(apiContext);
        LOGGER.info("MoneyTun-Outbound cancel transaction ");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<OutboundResponse> call = service.confirm(apiContext.getAuthentication(), MethodName.CANCEL.name(), transferNo, payeeCode);
        OutboundResponse outboundResponse = requestApi.executeApiCall(call);
        if (!outboundResponse.getCode().equals(CommonConstant.SUCCESS)) {
            throw new OutboundException(outboundResponse.getCode(), outboundResponse.getMessage());
        }
        return outboundResponse;
    }

    //FIXME : Make Common method to change status of the transaction
    @Override
    public OutboundResponse pay(APIContext apiContext, String transferNo, String payeeCode) {
        RequestApi requestApi = new RequestApi(apiContext);
        LOGGER.info("MoneyTun-Outbound pay transaction ");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<OutboundResponse> call = service.confirm(apiContext.getAuthentication(), MethodName.PAY.name(), transferNo, payeeCode);
        OutboundResponse outboundResponse = requestApi.executeApiCall(call);
        if (!outboundResponse.getCode().equals(CommonConstant.SUCCESS)) {
            throw new OutboundException(outboundResponse.getCode(), outboundResponse.getMessage());
        }
        return outboundResponse;
    }

}
