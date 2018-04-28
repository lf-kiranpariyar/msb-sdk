package com.lftechnology.msb.moneytun.service;

import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.CustomExchangeRate;
import com.lftechnology.msb.moneytun.dto.ExchangeRate;
import com.lftechnology.msb.moneytun.dto.Transaction;
import com.lftechnology.msb.moneytun.dto.TransactionResponse;
import com.lftechnology.msb.moneytun.enums.TxnStatus;

import java.math.BigDecimal;
import java.util.List;

public interface WhiteWingApiService {

    TransactionResponse createTransaction(Transaction transaction, APIContext apiContext);

    TransactionResponse getTransaction(String referenceNumber,  APIContext apiContext);

    TxnStatus getStatus(String referenceNumber,  APIContext apiContext);

    List<Bank> getBankList(String countryISOCode,  APIContext apiContext);

    CustomExchangeRate getRate(ExchangeRate rate, APIContext apiContext);

    void updateRate(ExchangeRate rate, APIContext apiContext);
}
