package com.lftechnology.msb.sdk.mapper;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.lftechnology.msb.sdk.dto.*;
import com.lftechnology.vtn.dto.request.BankRequest;
import com.lftechnology.vtn.dto.request.TransactionRequest;
import com.lftechnology.vtn.dto.response.BankResponse;
import com.lftechnology.vtn.dto.response.FxRateResponse;

import java.util.Map;

public class VtnObjectMapper {

    public static TransactionRequest toTransaction(Transaction transaction) {

        Sender sender = transaction.getSender();
        Recipient recipient = transaction.getRecipient();
        Bank bank = transaction.getBank();

        TransactionRequest transactionRequest = new TransactionRequest.Builder()
                .setTransactionDetail(transaction.getTransactionId(), transaction.getTransferDate(), transaction.getTransferType())
                .setSenderDetail(sender.getFirstName(), sender.getLastName(), sender.getContact().getEmail(), sender.getContact().getMobilePhone(), sender.getAddress().getCountry().getName())
                .setReceiverDetail(recipient.getFirstName(), recipient.getLastName(), recipient.getContact().getEmail(), recipient.getContact().getMobilePhone(), recipient.getAddress().getCountry().getName())
                .setAmount(transaction.getAmount(), transaction.getRecipientAmount(), transaction.getCurrencyCode())
                .setFee(transaction.getFeeInSenderCurrency(), transaction.getFeeInRecipientCurrency())
                .setBankDetail(bank.getName(), bank.getAccountHolderName(), bank.getAccountNumber())
                .build();


        return transactionRequest;
    }

    public static com.lftechnology.vtn.dto.request.Credential toCredential(String credential) {
        System.out.println(credential);
        Gson gson = new Gson();
        com.lftechnology.vtn.dto.request.Credential vtnCredential = gson.fromJson(credential, com.lftechnology.vtn.dto.request.Credential.class);
        System.out.println(vtnCredential);
        return vtnCredential;
    }

    public static TransactionResponse toTransactionResponse(com.lftechnology.vtn.dto.response.TransactionResponse transactionResponse) {
        TransactionResponse msbTransactionResponse = new TransactionResponse();
        msbTransactionResponse.setReferenceNumber(transactionResponse.getTransactionId());
        ObjectMapper objectMapper = new ObjectMapper();
        msbTransactionResponse.setMetadata(objectMapper.convertValue(transactionResponse, Map.class));
        return msbTransactionResponse;
    }


    public static BankRequest toBank(Bank bank) {
        BankRequest bankRequest = new BankRequest();
        bankRequest.setBankAccountName(bank.getAccountHolderName());
        bankRequest.setBankAccountNumber(bank.getAccountNumber());
        bankRequest.setBankName(bank.getName());

        return bankRequest;
    }

    public static Bank toBankResponse(BankResponse bankResponse) {
        Bank bank = new Bank();
        bank.setAccountHolderName(bankResponse.getAccountName());
        bank.setAccountNumber(bankResponse.getAccountNumber().toString());
        return bank;
    }

    public static ExchangeRateResponse toExchangeRateResponse(FxRateResponse fxRateResponse) {

        ExchangeRateResponse exchangeRateResponse = new ExchangeRateResponse();
        exchangeRateResponse.setBuyingRate(fxRateResponse.getExchangeRate().getBuyingRate());
        exchangeRateResponse.setCentralRate(fxRateResponse.getExchangeRate().getCentralRate());
        exchangeRateResponse.setSellingRate(fxRateResponse.getExchangeRate().getSellingRate());
        exchangeRateResponse.setCurrencyCode(fxRateResponse.getExchangeRate().getCurrencyCode());
        exchangeRateResponse.setRateDate(fxRateResponse.getExchangeRate().getRateDate());

        return exchangeRateResponse;
    }


}
