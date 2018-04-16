package com.lftechnology.msb.sdk.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.enums.ApiMode;
import com.lftechnology.msb.moneytun.enums.TxnStatus;
import com.lftechnology.msb.moneytun.service.WhiteWingApiService;
import com.lftechnology.msb.moneytun.service.impl.WhiteWingApiServiceImpl;
import com.lftechnology.msb.sdk.annotation.TransactionOriginator;
import com.lftechnology.msb.sdk.dto.SyncBankRequest;
import com.lftechnology.msb.sdk.dto.SyncBankResponse;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeRequest;
import com.lftechnology.msb.sdk.enums.MSBTransactionStatus;
import com.lftechnology.msb.sdk.exception.UnsupportedException;
import com.lftechnology.msb.sdk.mapper.MoneyTunObjectMapper;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Implements White Wings API.
 *
 * @author adhpawal
 */
@TransactionOriginator("MTN")
@Stateless
public class WhiteWingsClientApiImpl implements MsbClientService {


    private static String apiMode="SANDBOX";

    @Override
    public TransactionResponse create(Transaction transaction, String credentials) {
        WhiteWingApiService wingApiService = new WhiteWingApiServiceImpl();
        APIContext apiContext = new APIContext(credentials, ApiMode.valueOf(apiMode));
        com.lftechnology.msb.moneytun.dto.Transaction transactionDetail =MoneyTunObjectMapper.toTransaction(transaction);
        com.lftechnology.msb.moneytun.dto.TransactionResponse response = wingApiService.createTransaction(transactionDetail, apiContext);
        return MoneyTunObjectMapper.toTransactionResponse(response);
    }

    @Override
    public TransactionResponse fetch(String referenceId, String credentials) {
        WhiteWingApiService wingApiService = new WhiteWingApiServiceImpl();
        APIContext apiContext = new APIContext(credentials, ApiMode.valueOf(apiMode));
        com.lftechnology.msb.moneytun.dto.TransactionResponse detail = wingApiService.getTransaction(referenceId, apiContext);
        return null;
    }

    @Override
    public Boolean changeTransactionStatus(TransactionStatusChangeRequest changeRequest, String credentials) {
        throw new UnsupportedException();
    }

    @Override
    public Boolean acknowledgeTransaction(String referenceId, String credential) {
        throw new UnsupportedException();
    }

    @Override
    public MSBTransactionStatus getStatus(String referenceId, String credentials) {
        WhiteWingApiService wingApiService = new WhiteWingApiServiceImpl();
        APIContext apiContext = new APIContext(credentials, ApiMode.valueOf(apiMode));
        TxnStatus status = wingApiService.getStatus(referenceId,apiContext);
        return MSBTransactionStatus.getTransactionStatus(status);
    }

    @Override
    public List<SyncBankResponse> fetchBank(SyncBankRequest request, String credentials) {
        WhiteWingApiService wingApiService = new WhiteWingApiServiceImpl();
        APIContext apiContext = new APIContext(credentials, ApiMode.valueOf(apiMode));
        List<com.lftechnology.msb.moneytun.dto.Bank> banks = wingApiService.getBankList(request.getCountry().getThreeCharISOCode(), apiContext);
        List<SyncBankResponse> responseList = new ArrayList<>();
        banks.forEach(bank ->{
                    SyncBankResponse response = new SyncBankResponse();
                    response.setName(bank.getName());
                    ObjectMapper objectMapper = new ObjectMapper();
                    response.setMetadata(objectMapper.convertValue(bank, Map.class));
                    responseList.add(response);
                }
        );
        return responseList;
    }
}
