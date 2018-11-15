package com.lftechnology.msb.sdk.service.msb;

import com.lftechnology.msb.sdk.dto.*;
import com.lftechnology.msb.sdk.enums.MSBTransactionStatus;

import javax.ejb.Stateless;
import java.math.BigDecimal;
import java.util.List;

@Stateless
public interface MsbClientService {

    TransactionResponse create(Transaction transaction, String credentials);

    TransactionResponse fetch(String referenceId, String credentials);

    Boolean changeTransactionStatus(TransactionStatusChangeRequest changeRequest, String credentials);

    Boolean acknowledgeTransaction(String referenceId, String credential);

    MSBTransactionStatus getStatus(String referenceId, String credentials);

    List<SyncBankResponse> fetchBank(SyncBankRequest request, String credentials);

    BigDecimal rate(ExchangeRateRequest request, String credentails);

    void updateExchangeRate(ExchangeRateRequest request, String credentails);

    BigDecimal fetchPurchaseRate(ExchangeRateRequest request, String credentials);

    List<State> getStates(Country country, String credentials);

    List<City> getCities(Country country, String credentials);

    TransactionResponse getTxnDetails(Transaction transaction, String credentials);


}
