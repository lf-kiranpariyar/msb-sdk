package com.lftechnology.msb.sdk.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.dto.CustomExchangeRate;
import com.lftechnology.msb.moneytun.dto.ExchangeRate;
import com.lftechnology.msb.moneytun.dto.PayoutPartner;
import com.lftechnology.msb.moneytun.dto.PointOfContact;
import com.lftechnology.msb.moneytun.dto.PointOfContactRequest;
import com.lftechnology.msb.moneytun.enums.ApiMode;
import com.lftechnology.msb.moneytun.enums.PaymentMode;
import com.lftechnology.msb.moneytun.enums.TxnStatus;
import com.lftechnology.msb.moneytun.service.WhiteWingApiService;
import com.lftechnology.msb.moneytun.service.impl.WhiteWingApiServiceImpl;
import com.lftechnology.msb.sdk.annotation.SystemProperty;
import com.lftechnology.msb.sdk.annotation.TransactionOriginator;
import com.lftechnology.msb.sdk.dto.ExchangeRateRequest;
import com.lftechnology.msb.sdk.dto.SyncBankRequest;
import com.lftechnology.msb.sdk.dto.SyncBankResponse;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeRequest;
import com.lftechnology.msb.sdk.enums.MSBTransactionStatus;
import com.lftechnology.msb.sdk.exception.UnsupportedException;
import com.lftechnology.msb.sdk.mapper.MoneyTunObjectMapper;

import javax.ejb.Stateless;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Implements White Wings API.
 *
 * @author adhpawal
 */
@TransactionOriginator("MTN")
@Stateless
public class WhiteWingsClientApiImpl implements MsbClientService {

    @SystemProperty(value = "MTS_ENVIRONMENT", fallback = "SANDBOX")
    private static String apiMode = "SANDBOX";

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
        TransactionResponse transactionResponse = new TransactionResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        transactionResponse.setMetadata(objectMapper.convertValue(detail, Map.class));
        transactionResponse.setReferenceNumber(detail.getReferenceNumber());
        return transactionResponse;
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
        List<SyncBankResponse> responseList = new ArrayList<>();
        List<PayoutPartner> payoutPartners =apiContext.getCredential().getPayerDetails().get(request.getCountry().getThreeCharISOCode());
        payoutPartners.forEach(partner-> {
            List<com.lftechnology.msb.moneytun.dto.Bank> banks = wingApiService.getBankList(request.getCountry().getThreeCharISOCode(), apiContext);
            List<PointOfContact> pointOfContacts = wingApiService.getPointOfContacts(new PointOfContactRequest(request.getCountry().getThreeCharISOCode(), partner.getPayeeCode()),apiContext);
            System.out.println(pointOfContacts.size());
            pointOfContacts.forEach(it-> {
                System.out.println(it.getId());
            });
            List<PointOfContact> accountDepositPointOfContacts = pointOfContacts.stream().filter(it-> PaymentMode.ACCOUNT_DEPOSIT.getMode().equals(it.getDeliveryMethod()) && it.getRecieverCurrencyISOCode().equalsIgnoreCase(request.getCountry().getThreeCharISOCode())).collect(Collectors.toList());
            banks.forEach(bank -> {
                        SyncBankResponse response = new SyncBankResponse();
                        response.setName(bank.getName());
                        ObjectMapper objectMapper = new ObjectMapper();
                        Map<String , String> map = objectMapper.convertValue(bank, Map.class);
                        map.put("payeeCode" , partner.getPayeeCode());
                        final PointOfContact pointOfContact = accountDepositPointOfContacts.stream().filter(it-> bank.getSubPayeeAgencyName().equalsIgnoreCase(it.getName())).findFirst().get();
                        map.put("pocId", String.valueOf(pointOfContact.getId()));
                        response.setMetadata(objectMapper.convertValue(bank, Map.class));
                        responseList.add(response);
                    }
            );
        });
        return responseList;
    }

    @Override
    public BigDecimal rate(ExchangeRateRequest request, String credentials) {
        WhiteWingApiService wingApiService = new WhiteWingApiServiceImpl();
        APIContext apiContext = new APIContext(credentials, ApiMode.valueOf(apiMode));
        ExchangeRate rate = new ExchangeRate();
        rate.setDestinationCurrencyISOCode(request.getDestination().getCurrencyCode());
        rate.setSourceCurrencyISOCode(request.getSource().getCurrencyCode());
        CustomExchangeRate conversionRate = wingApiService.getRate(rate, apiContext);
        return conversionRate.getSellRate();
    }

    @Override
    public void updateExchangeRate(ExchangeRateRequest request, String credentials) {
        WhiteWingApiService wingApiService = new WhiteWingApiServiceImpl();
        APIContext apiContext = new APIContext(credentials, ApiMode.valueOf(apiMode));
        List<PayoutPartner> payoutPartners =apiContext.getCredential().getPayerDetails().get(request.getDestination().getThreeCharISOCode());
        payoutPartners.forEach(payoutPartner -> {
            ExchangeRate rate = new ExchangeRate();
            rate.setSellRate(request.getAmount());
            rate.setSourceCurrencyISOCode(request.getSource().getCurrencyCode());
            rate.setDestinationCurrencyISOCode(request.getDestination().getCurrencyCode());
            rate.setSenderAgencyCode(apiContext.getEmployeeDetail().getCode());
            rate.setPayeeCode(payoutPartner.getPayeeCode());
            rate.setGroupId(payoutPartner.getGroupId());
            wingApiService.updateRate(rate,apiContext);
        });
    }

    @Override
    public BigDecimal fetchPurchaseRate(ExchangeRateRequest request, String credentials) {
        WhiteWingApiService wingApiService = new WhiteWingApiServiceImpl();
        APIContext apiContext = new APIContext(credentials, ApiMode.valueOf(apiMode));
        ExchangeRate rate = new ExchangeRate();
        rate.setDestinationCurrencyISOCode(request.getDestination().getThreeCharISOCode());
        rate.setSourceCurrencyISOCode(request.getSource().getThreeCharISOCode());
        CustomExchangeRate conversionRate = wingApiService.getRate(rate, apiContext);
        return conversionRate.getPurchaseRate();
    }
}
