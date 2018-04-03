package com.lftechnology.msb.moneytun.service;

import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.Credential;
import com.lftechnology.msb.moneytun.dto.Transaction;
import com.lftechnology.msb.moneytun.dto.TransactionDetail;
import com.lftechnology.msb.moneytun.dto.TransactionResponse;
import com.lftechnology.msb.moneytun.enums.TxnStatus;

import java.util.List;

public interface WhiteWingApiService {

    TransactionResponse createTransaction(Transaction transaction, Credential credential);

    TransactionResponse getTransaction(String referenceNumber, Credential credential);

    TxnStatus getStatus(String referenceNumber, Credential credential);

    List<Bank> getBankList(String countryISOCode, Credential credential);

}
