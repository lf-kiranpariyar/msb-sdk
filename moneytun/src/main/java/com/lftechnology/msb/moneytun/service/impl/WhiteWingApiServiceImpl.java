package com.lftechnology.msb.moneytun.service.impl;

import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.Credential;
import com.lftechnology.msb.moneytun.dto.Transaction;
import com.lftechnology.msb.moneytun.dto.TransactionResponse;
import com.lftechnology.msb.moneytun.enums.TxnStatus;
import com.lftechnology.msb.moneytun.service.WhiteWingApiService;

import java.util.List;

public class WhiteWingApiServiceImpl implements WhiteWingApiService {
    @Override
    public TransactionResponse createTransaction(Transaction transaction, Credential credential) {

        return null;
    }

    @Override
    public TransactionResponse getTransaction(String referenceNumber, Credential credential) {
        return null;
    }

    @Override
    public TxnStatus getStatus(String referenceNumber, Credential credential) {
        return null;
    }

    @Override
    public List<Bank> getBankList(String countryISOCode, Credential credential) {
        return null;
    }
}
