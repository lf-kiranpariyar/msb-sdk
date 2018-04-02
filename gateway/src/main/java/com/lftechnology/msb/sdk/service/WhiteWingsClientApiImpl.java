package com.lftechnology.msb.sdk.service;

import com.lftechnology.msb.sdk.annotation.SystemProperty;
import com.lftechnology.msb.sdk.annotation.TransactionOriginator;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeRequest;
import com.lftechnology.msb.sdk.exception.UnsupportedException;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@TransactionOriginator("com/lftechnology/msb/moneytun")
public class WhiteWingsClientApiImpl implements MsbClientService {

    @Inject
    @SystemProperty(value = "moneytun.url", fallback = "http://webservices-moneytun.staging.wwcny.com/Inbound/API/")
    String url;

    @Override
    public TransactionResponse create(Transaction transaction, String credentials) {
       /* com.lftechnology.msb.moneytun.dto.Transaction transactionObject = DtoMapperUtil.getTransaction(transaction);
        Token token = getSecretToken(credentials);
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(this.url);
        ResteasyWebTarget resteasyWebTarget = (ResteasyWebTarget)target;
        WhiteWingResource transactionProxy = resteasyWebTarget.proxy(WhiteWingResource.class);
        target.request().header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
        target.request().header("Authentication", "MTS98235-CDBD-42F8-MNET-4B4F6C060API:" + token.getMessage());
        com.lftechnology.msb.moneytun.dto.TransactionResponse transactionResponse = transactionProxy.createTransaction("proccess", new com.lftechnology.msb.moneytun.dto.Transaction());
        return null;*/
       return null;
    }

    @Override
    public TransactionResponse fetch(String referenceId, String credentials) {
     /*   com.lftechnology.msb.moneytun.dto.Transaction transactionObject = DtoMapperUtil.getTransaction(null);
        Token token = getSecretToken(credentials);
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(this.url);
        ResteasyWebTarget resteasyWebTarget = (ResteasyWebTarget)target;
        WhiteWingResource transactionProxy = resteasyWebTarget.proxy(WhiteWingResource.class);
        target.request().header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
        target.request().header("Authentication", "MTS98235-CDBD-42F8-MNET-4B4F6C060API:" + token.getMessage());
        com.lftechnology.msb.moneytun.dto.TransactionResponse transactionResponse = transactionProxy.createTransaction("proccess", new com.lftechnology.msb.moneytun.dto.Transaction());*/
        return null;
    }

    @Override
    public Boolean changeTransactionStatus(TransactionStatusChangeRequest changeRequest, String credentials) {
        return null;
    }

    @Override
    public Boolean acknowledgeTransaction(String referenceId, String credential) {
        throw new UnsupportedException();
    }
}
