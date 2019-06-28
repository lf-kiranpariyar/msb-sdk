package com.lftechnology.gmt.service;

import com.lftechnology.gmt.dto.Agent;
import com.lftechnology.gmt.dto.BankInfo;
import com.lftechnology.gmt.dto.CancelResponse;
import com.lftechnology.gmt.dto.CancelTransactionDetail;
import com.lftechnology.gmt.dto.Credential;
import com.lftechnology.gmt.dto.TransactionAmendmentDetail;
import com.lftechnology.gmt.dto.TransactionDetail;
import com.lftechnology.gmt.dto.TransactionResponse;

import java.math.BigDecimal;
import java.util.List;

public class GMTClientApiImpl implements  GMTClientApi {
    @Override
    public TransactionResponse createTransaction(Credential credential, TransactionDetail transactionDetail) {
        return null;
    }

    @Override
    public TransactionResponse getDetails(Credential credential, TransactionDetail transactionDetail) {
        return null;
    }

    @Override
    public Boolean amendTransaction(Credential credential, TransactionAmendmentDetail amendmentRequest) {
        return null;
    }

    @Override
    public List<Agent> getAgents(Credential credential, BankInfo bankInfo) {
        return null;
    }

    @Override
    public CancelResponse cancelTransaction(Credential credential, CancelTransactionDetail cancelTransactionDetail) {
        return null;
    }

    @Override
    public Boolean acknowledgeTransaction(Credential credential, String msbTxnId) {
        return null;
    }

    @Override
    public BigDecimal getExchangeRate(Credential credential, String destinationCountryISOCode) {
        return null;
    }
}
