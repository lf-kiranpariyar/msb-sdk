package com.lftechnology.msb.sdk.service.delivery;

import com.lftechnology.msb.sdk.dto.*;

import java.math.BigDecimal;

public interface DeliveryService {
    TransactionResponse create(Transaction transaction, String credential);
    Bank verifyBank(Bank request, String credential);
    ExchangeRateResponse rate(ExchangeRateRequest request, String credential);
    BigDecimal getBalance(String credential);
}
