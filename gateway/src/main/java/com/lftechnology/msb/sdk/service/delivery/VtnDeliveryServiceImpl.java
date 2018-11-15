package com.lftechnology.msb.sdk.service.delivery;

import com.lftechnology.msb.sdk.annotation.DeliveryPartner;
import com.lftechnology.msb.sdk.dto.Bank;
import com.lftechnology.msb.sdk.dto.ExchangeRateRequest;
import com.lftechnology.msb.sdk.dto.ExchangeRateResponse;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.mapper.VtnObjectMapper;
import com.lftechnology.vtn.api.BalanceApi;
import com.lftechnology.vtn.api.BankApi;
import com.lftechnology.vtn.api.FxRateApi;
import com.lftechnology.vtn.api.TransactionApi;
import com.lftechnology.vtn.dto.request.BankRequest;
import com.lftechnology.vtn.dto.request.TransactionRequest;
import com.lftechnology.vtn.dto.response.BalanceResponse;
import com.lftechnology.vtn.dto.response.BankResponse;
import com.lftechnology.vtn.dto.response.FxRateResponse;
import com.lftechnology.vtn.exception.ApiException;
import com.lftechnology.vtn.exception.VtnException;

import javax.ejb.Stateless;
import java.math.BigDecimal;

@Stateless
@DeliveryPartner("VTN")
public class VtnDeliveryServiceImpl implements DeliveryService {

    @Override
    public TransactionResponse create(Transaction transaction, String credential) {
        try {
            TransactionRequest transactionRequest = VtnObjectMapper.toTransaction(transaction);
            com.lftechnology.vtn.dto.request.Credential vtnCredential = VtnObjectMapper.toCredential(credential);
            TransactionApi transactionApi = new TransactionApi(vtnCredential);
            com.lftechnology.vtn.dto.response.TransactionResponse transactionResponse = transactionApi.createTransaction(transactionRequest);

            return VtnObjectMapper.toTransactionResponse(transactionResponse);
        } catch (VtnException e) {
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        } catch (ApiException e) {
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        }
    }

    @Override
    public Bank verifyBank(Bank bank, String credential) {
        try {
            BankRequest bankRequest = VtnObjectMapper.toBank(bank);
            com.lftechnology.vtn.dto.request.Credential vtnCredential = VtnObjectMapper.toCredential(credential);
            BankApi bankApi = new BankApi(vtnCredential);
            BankResponse bankResponse = bankApi.verifyBank(bankRequest);

            return VtnObjectMapper.toBankResponse(bankResponse);
        } catch (VtnException e) {
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        } catch (ApiException e) {
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        }
    }

    @Override
    public ExchangeRateResponse rate(ExchangeRateRequest request, String credential) {
        try {
            com.lftechnology.vtn.dto.request.Credential vtnCredential = VtnObjectMapper.toCredential(credential);
            FxRateApi fxRateApi = new FxRateApi(vtnCredential);
            FxRateResponse fxRateResponse = fxRateApi.getRate(request.getDestination().getCurrencyCode());

            return VtnObjectMapper.toExchangeRateResponse(fxRateResponse);
        } catch (VtnException e) {
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        } catch (ApiException e) {
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        }
    }

    @Override
    public BigDecimal getBalance(String credential) {
        try {
            com.lftechnology.vtn.dto.request.Credential vtnCredential = VtnObjectMapper.toCredential(credential);
            BalanceApi balanceApi = new BalanceApi(vtnCredential);
            BalanceResponse bankResponse = balanceApi.getBalance();

            return bankResponse.getBalance();
        } catch (VtnException e) {
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        } catch (ApiException e) {
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        }
    }


}
