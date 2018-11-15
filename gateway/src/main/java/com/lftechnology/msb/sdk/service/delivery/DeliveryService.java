package com.lftechnology.msb.sdk.service.delivery;

import com.lftechnology.msb.sdk.dto.Bank;
import com.lftechnology.msb.sdk.dto.ExchangeRateRequest;
import com.lftechnology.msb.sdk.dto.ExchangeRateResponse;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;

import java.math.BigDecimal;

public interface DeliveryService {
    TransactionResponse create(Transaction transaction, String credential);

    Bank verifyBank(Bank request, String credential);

    ExchangeRateResponse rate(ExchangeRateRequest request, String credential);

    BigDecimal getBalance(String credential);
}
