package com.lftechnology.msb.moneytun.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.moneytun.dto.*;
import moneytun.dto.*;

import java.math.BigDecimal;
import java.util.Map;

public class DtoMapperUtil {

    public static Transaction getTransaction(com.lftechnology.msb.sdk.dto.Transaction requestTransaction){
        Transaction transaction = new Transaction();
        Sender sender = new Sender();
        sender.setAddressLine1(transaction.getSender().getAddressLine1());
        sender.setAddressLine2(transaction.getSender().getAddressLine2());
        sender.setFirstName("GENRIKH");
        sender.setLastName("PETROSYAN");
        sender.setSenderCountryISOCode("USA");
        sender.setStateISOCode("US-CA");
        sender.setState("CA");
        sender.setCity("Arizona");
        sender.setZipCode("91604");
        sender.setPhone("8182700534");
        sender.setNationality("USA");
        sender.setDateOfBirth("08-05-1989");
        sender.setNationality("USA");
        sender.setGender("M");

        Document document = new Document();
        document.setType("Passport");
        document.setIdentificationNumber("0314523");
        document.setCountryName("RUS");
        document.setIssueDate("01/14/2013");
        document.setExpiryDate("01/14/2023");
        document.setDocumentCountryISOCode("RUS");


        Reciever reciever =new Reciever();
        reciever.setFirstName("GEVORG");
        reciever.setLastName("GYURJYAN");
        reciever.setCountryISOCode("VNM");
        reciever.setState("VIETNAM");
        reciever.setCity("Default City");
        reciever.setPhoneNumber("8182700534");
        reciever.setGender("M");
        reciever.setStateISOCode("Default State");

        transaction.setAgentId("machnet");
        transaction.setSender(sender);
        transaction.setReciever(reciever);
        transaction.setDocument(document);
        transaction.setAccountType("1");
        transaction.setPointOfContactId(68447);
        transaction.setExchangeRate(BigDecimal.valueOf(217544.1));
        transaction.setBankName("NHTMCP Cong Thuong Vietnam");
        transaction.setBankBranch("Test branch");
        transaction.setBankAccount("BankAccount");
        transaction.setSourceCurrencyCode("USD");
        transaction.setPaymentMethod("Cash");
       // transaction.setEmployee(employee);
        transaction.setAmount(BigDecimal.valueOf(10));
        transaction.setReceiverCurrencyCode("VND");
        transaction.setDeliveryMethod("SEND TO ACCOUNT");
        transaction.setRecieverAmount(BigDecimal.valueOf(217544.2));
        return  transaction;
    }

    public static com.lftechnology.msb.sdk.dto.TransactionResponse getTransactionResponse(TransactionResponse transactionResponse){
        com.lftechnology.msb.sdk.dto.TransactionResponse response = new com.lftechnology.msb.sdk.dto.TransactionResponse();
        response.setReferenceNumber(transactionResponse.getReferenceNumber());
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> metadata = oMapper.convertValue(transactionResponse, Map.class);
        response.setMetadata(metadata);
        return  response;
    }
}
