package com.lftechnology.msb.moneytun.service;

import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.Credential;
import com.lftechnology.msb.moneytun.dto.Transaction;
import com.lftechnology.msb.moneytun.dto.TransactionDetail;
import com.lftechnology.msb.moneytun.dto.TransactionResponse;
import com.lftechnology.msb.moneytun.enums.TxnStatus;

import java.util.List;

public interface WhiteWingApiService {

    TransactionResponse createTransaction(Transaction transaction, APIContext apiContext);

    TransactionResponse getTransaction(String referenceNumber,  APIContext apiContext);

    TxnStatus getStatus(String referenceNumber,  APIContext apiContext);

    List<Bank> getBankList(String countryISOCode,  APIContext apiContext);

}
