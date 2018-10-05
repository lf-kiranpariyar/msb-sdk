package com.lftechnology.msb.sdk.service.msb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.moneytun.exception.InvalidCredentialException;
import com.lftechnology.msb.prabhu.dto.Agent;
import com.lftechnology.msb.prabhu.dto.BankInfo;
import com.lftechnology.msb.prabhu.dto.Credential;
import com.lftechnology.msb.prabhu.service.PrabhuClientApi;
import com.lftechnology.msb.sdk.annotation.TransactionOriginator;
import com.lftechnology.msb.sdk.dto.Country;
import com.lftechnology.msb.sdk.dto.ExchangeRateRequest;
import com.lftechnology.msb.sdk.dto.State;
import com.lftechnology.msb.sdk.dto.SyncBankRequest;
import com.lftechnology.msb.sdk.dto.SyncBankResponse;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeRequest;
import com.lftechnology.msb.sdk.enums.MSBTransactionStatus;
import com.lftechnology.msb.sdk.enums.TransactionPaymentType;
import com.lftechnology.msb.sdk.exception.UnsupportedException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * Implementation details for holding Prabhu MSB's functionality.
 */
@TransactionOriginator("PMT")
@Stateless
public class PrabhuMSBClientApiImpl implements MsbClientService {

    @Inject
    private PrabhuClientApi prabhuClientApi;

    @Override
    public TransactionResponse create(Transaction transaction, String credentials) {
        return null;
    }

    @Override
    public TransactionResponse fetch(String referenceId, String credentials) {
        return null;
    }

    @Override
    public Boolean changeTransactionStatus(TransactionStatusChangeRequest changeRequest, String credentials) {
        throw new UnsupportedException("Unsupported");
    }

    @Override
    public Boolean acknowledgeTransaction(String referenceId, String credential) {
        return null;
    }

    @Override
    public MSBTransactionStatus getStatus(String referenceId, String credentials) {
        return null;
    }

    @Override
    public List<SyncBankResponse> fetchBank(SyncBankRequest request, String credentials) {
        Credential credential = getCredential(credentials);
        BankInfo bankInfo = new BankInfo();
        bankInfo.setPayoutCountry(request.getCountry().getName());
        bankInfo.setPaymentType(TransactionPaymentType.getPrabhuPaymentMode(request.getType()).name());
        List<Agent> agents = prabhuClientApi.getAgents(credential,bankInfo);
        return null;
    }

    @Override
    public BigDecimal rate(ExchangeRateRequest request, String credentails) {
        return null;
    }

    @Override
    public void updateExchangeRate(ExchangeRateRequest request, String credentails) {

    }

    @Override
    public BigDecimal fetchPurchaseRate(ExchangeRateRequest request, String credentials) {
        throw new UnsupportedException("Purchase Rate Query Not Supported by Prabhu MSB");
    }

    @Override
    public List<State> getStates(Country country, String credentials) {
        throw new UnsupportedException("Fetch State Not Supported by Prabhu MSB");
    }

    @Override
    public List<com.lftechnology.msb.sdk.dto.City> getCities(Country country, String credentials) {
        throw new UnsupportedException("Purchase State Not Supported by Prabhu MSB");
    }

    private Credential getCredential(String credentialString){
        ObjectMapper objectMapper = new ObjectMapper();
        if (credentialString == null) {
            throw new InvalidCredentialException("Credentials not found");
        }
        Credential credential=null;
        try {
            credential = objectMapper.readValue(credentialString, Credential.class);
        } catch (IOException e) {
            throw new InvalidCredentialException("Invalid Credentials ");
        }
        return credential;
    }
}
