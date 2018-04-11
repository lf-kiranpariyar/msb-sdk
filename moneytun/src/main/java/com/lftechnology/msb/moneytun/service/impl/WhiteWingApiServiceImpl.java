package com.lftechnology.msb.moneytun.service.impl;

import com.lftechnology.msb.moneytun.constant.Constants;
import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.Credential;
import com.lftechnology.msb.moneytun.dto.ListResponse;
import com.lftechnology.msb.moneytun.dto.Transaction;
import com.lftechnology.msb.moneytun.dto.TransactionDetail;
import com.lftechnology.msb.moneytun.dto.TransactionResponse;
import com.lftechnology.msb.moneytun.enums.QueryType;
import com.lftechnology.msb.moneytun.enums.TxnStatus;
import com.lftechnology.msb.moneytun.exception.WhiteWingBadRequestException;
import com.lftechnology.msb.moneytun.service.WhiteWingApiService;
import com.lftechnology.msb.moneytun.service.WhiteWingResource;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.List;

public class WhiteWingApiServiceImpl implements WhiteWingApiService {

    @Override
    public TransactionResponse createTransaction(Transaction transaction, APIContext apiContext) {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(apiContext.getEndPointUrl());
        Response response = target.request().get();
        ResteasyWebTarget rtarget = (ResteasyWebTarget)target;
        WhiteWingResource whiteWingResource = rtarget.proxy(WhiteWingResource.class);
        TransactionResponse resultantTransaction =whiteWingResource.createTransaction(apiContext.getCredential().getAuthenticationDetail(), QueryType.TRANSACTION_PROCESS.getValue(), transaction);
        if(resultantTransaction.getCode()!=0){
            throw new WhiteWingBadRequestException(resultantTransaction.getMessage(), resultantTransaction.getCode());
        }
        return resultantTransaction;
    }

    @Override
    public TransactionResponse getTransaction(String referenceNumber, APIContext apiContext) {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(apiContext.getEndPointUrl());
        Response response = target.request().get();
        ResteasyWebTarget rtarget = (ResteasyWebTarget)target;
        WhiteWingResource whiteWingResource = rtarget.proxy(WhiteWingResource.class);
        TransactionResponse resultantTransaction =whiteWingResource.getDetail(apiContext.getCredential().getAuthenticationDetail(),referenceNumber, QueryType.TRANSACTION_DETAIL.getValue());
        if(resultantTransaction.getCode()!=0){
            throw new WhiteWingBadRequestException(resultantTransaction.getMessage(), resultantTransaction.getCode());
        }
        return resultantTransaction;
    }

    @Override
    public TxnStatus getStatus(String referenceNumber, APIContext apiContext) {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(apiContext.getEndPointUrl());
        Response response = target.request().get();
        ResteasyWebTarget rtarget = (ResteasyWebTarget)target;
        WhiteWingResource whiteWingResource = rtarget.proxy(WhiteWingResource.class);
        ListResponse<TransactionDetail> resultantTransaction =whiteWingResource.getStatus(apiContext.getCredential().getAuthenticationDetail(),referenceNumber, QueryType.TRANSACTION_GET_STATUS.getValue());
        if(resultantTransaction.getCode()!=0){
            throw new WhiteWingBadRequestException(resultantTransaction.getMessage(), resultantTransaction.getCode());
        }
        return resultantTransaction.getResults().get(0).getStatus();
    }

    @Override
    public List<Bank> getBankList(String countryISOCode, APIContext apiContext) {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(apiContext.getEndPointUrl());
        Response response = target.request().get();
        ResteasyWebTarget rtarget = (ResteasyWebTarget)target;
        WhiteWingResource whiteWingResource = rtarget.proxy(WhiteWingResource.class);
        ListResponse<Bank> results =whiteWingResource.getBankList(apiContext.getCredential().getAuthenticationDetail(),countryISOCode, QueryType.BANK.getValue());
        if(results.getCode()!=0){
            throw new WhiteWingBadRequestException(results.getMessage(), results.getCode());
        }
        return results.getResults();
    }
}
