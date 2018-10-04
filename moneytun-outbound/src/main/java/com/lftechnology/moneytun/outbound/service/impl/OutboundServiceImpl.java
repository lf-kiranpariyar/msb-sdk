package com.lftechnology.moneytun.outbound.service.impl;

import com.lftechnology.moneytun.outbound.constant.CommonConstant;
import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.OutboundResponse;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;
import com.lftechnology.moneytun.outbound.enums.MethodName;
import com.lftechnology.moneytun.outbound.exception.OutboundException;
import com.lftechnology.moneytun.outbound.service.OutboundResource;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Retrofit;


public class OutboundServiceImpl implements OutboundService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OutboundServiceImpl.class);


    /**
     *method will get secret key using provided accesskey
     * @param accessKey : String
     * @return OutboundResponse : {code:1 , message:"<<returned secret key>>"}
     * @throws OutboundException if OutboundResponse Code is not equal to 1
     * code: 1  message : <secretKey>
     */
    @Override
    public OutboundResponse getToken(String accessKey) {
        RequestApi requestApi = new RequestApi();
        LOGGER.info("MoneyTun-Outbound get Token");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<OutboundResponse> call = service.getToken(accessKey);
         OutboundResponse outboundResponse =requestApi.executeApiCall(call);
        if(!outboundResponse.getCode().equals(CommonConstant.SUCCESS)) {
            throw new OutboundException(outboundResponse.getCode(),outboundResponse.getMessage());
        }
        return outboundResponse;
    }

    /**
     *method will get all the unpaid transaction list
     * @params Credential: credential{accesskey , secretkey} , String : transerNo , String:payeeCode
     * @return UnpaidTransactionList : transactionList
     * @throws OutboundException if OutboundResponse Code is not equal to 1
     * code: 1   message : Success
     * code: 2   message : No data found
     * code:-1   message: Wrong method called
     * code:-2   message: Invalid data entered
     */

    @Override
    public UnpaidTransactionList getUnpaidTransactionList(Credential credential, String transferNo, String payeeCode) {
        RequestApi requestApi = new RequestApi(credential);
        LOGGER.info("MoneyTun-Outbound get unpaid transaction list");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<UnpaidTransactionList> call = service.getUnpaidTRansactionList(MethodName.ALL.name(), transferNo, payeeCode);
        UnpaidTransactionList transactionList = requestApi.executeApiCall(call);
        if(!transactionList.getUnpaidTransactions().isEmpty()){
            Integer responseCode = transactionList.getUnpaidTransactions().get(0).getOutboundResponse().getCode();
            String responsemessage = transactionList.getUnpaidTransactions().get(0).getOutboundResponse().getMessage();
            if(!responseCode.equals(CommonConstant.SUCCESS)) {
                throw new OutboundException(responseCode,responsemessage);
            }
        }

        return transactionList;
    }

    /**
     *method will confirm the received unpaid transaction list so that they will not be sent in next request
     * @params Credential: credential{accesskey , secretkey} , String : transerNo , String:payeeCode
     * @return OutboundResponse : outboundResponse{code: , message:}
     * @throws OutboundException if OutboundResponse Code is not equal to 1
     */

    @Override
    public OutboundResponse confirmTransaction(Credential credential, String transferNo, String payeeCode) {
        RequestApi requestApi = new RequestApi(credential);
        LOGGER.info("MoneyTun-Outbound conform transaction ");
        Retrofit retrofit = requestApi.getRetrofitObject();
        OutboundResource service = retrofit.create(OutboundResource.class);
        Call<OutboundResponse> call = service.conformTRansaction(MethodName.CONFIRMATION.name(),transferNo, payeeCode);
        OutboundResponse outboundResponse = requestApi.executeApiCall(call);
        if(!outboundResponse.getCode().equals(CommonConstant.SUCCESS)) {
            throw new OutboundException(outboundResponse.getCode(),outboundResponse.getMessage());
        }
        return outboundResponse;
    }

}
