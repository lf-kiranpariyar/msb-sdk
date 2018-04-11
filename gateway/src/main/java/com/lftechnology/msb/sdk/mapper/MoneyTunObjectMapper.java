package com.lftechnology.msb.sdk.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.moneytun.dto.Reciever;
import com.lftechnology.msb.moneytun.dto.TransactionDetail;
import com.lftechnology.msb.moneytun.enums.PaymentMode;
import com.lftechnology.msb.sdk.dto.Address;
import com.lftechnology.msb.sdk.dto.Bank;
import com.lftechnology.msb.sdk.dto.Contact;
import com.lftechnology.msb.sdk.dto.Document;
import com.lftechnology.msb.sdk.dto.Recipient;
import com.lftechnology.msb.sdk.dto.Sender;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.enums.DocumentType;
import com.lftechnology.msb.sdk.enums.TransactionPaymentType;

import java.util.Map;

public class MoneyTunObjectMapper {

    public static TransactionResponse toTransactionResponse(com.lftechnology.msb.moneytun.dto.TransactionResponse response) {
        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.setReferenceNumber(response.getReferenceNumber());
        ObjectMapper objectMapper = new ObjectMapper();
        transactionResponse.setMetadata(objectMapper.convertValue(response, Map.class));
        return transactionResponse;
    }

    public static com.lftechnology.msb.moneytun.dto.Transaction toTransaction(Transaction transaction) {
        com.lftechnology.msb.moneytun.dto.Sender sender = toSender(transaction.getSender());
        Reciever reciever = toReciever(transaction.getRecipient());
        PaymentMode paymentMode = TransactionPaymentType.getMoneyTunPaymentMode(transaction.getType());
        com.lftechnology.msb.moneytun.dto.Document document = toDocument(transaction.getDocument());
        Bank bank = transaction.getBank();
        com.lftechnology.msb.moneytun.dto.Transaction transactiondetail = new com.lftechnology.msb.moneytun.dto.Transaction.Builder().
                party(sender, reciever, document).bankDetails(bank.getName(), bank.getBranch().getName(), bank.getAccountNumber(), bank.getType()).
                paymentMethod(paymentMode.getMode()).transactionAmount(transaction.getAmount(), transaction.getRate(), transaction.getRecipientAmount()).build();

        transactiondetail.setSender(toSender(transaction.getSender()));
        transactiondetail.setReciever(toReciever(transaction.getRecipient()));
        return transactiondetail;
    }

    public static com.lftechnology.msb.moneytun.dto.Sender toSender(Sender sender) {
        Address address = sender.getAddress();
        Contact contact = sender.getContact();
        com.lftechnology.msb.moneytun.dto.Sender senderDetails = new com.lftechnology.msb.moneytun.dto.Sender.Builder().
                name(sender.getFirstName(), sender.getMiddleName(), sender.getLastName()).
                addressDetails(address.getAddressLine1(), address.getAddressLine2(), address.getCountry().getThreeCharISOCode(), address.getState().getThreeCharISOCode(), address.getState().getName(), address.getCity()).
                nationality(address.getCountry().getName()).
                contactDetails(contact.getMobilePhone(), address.getPostCode()).dateOfBirth(sender.getDateOfBirth()).build();
        return senderDetails;
    }

    public static Reciever toReciever(Recipient recipient) {
        Address address = recipient.getAddress();
        Contact contact = recipient.getContact();
        Reciever reciever = new Reciever.Builder().
                name(recipient.getFirstName(), recipient.getMiddleName(), recipient.getLastName()).
                addressDetails(address.getAddressLine1(), address.getAddressLine2(), address.getCountry().getThreeCharISOCode(), address.getState().getThreeCharISOCode(), address.getState().getName(), address.getCity()).
                contactDetails(contact.getMobilePhone()).build();
        return reciever;
    }

    public static com.lftechnology.msb.moneytun.dto.Document toDocument(Document document) {
        com.lftechnology.msb.moneytun.dto.Document documentDetail = new com.lftechnology.msb.moneytun.dto.Document();
        documentDetail.setDocumentCountryISOCode(document.getCountryISOCode());
        documentDetail.setType(DocumentType.getPrabhuDocument(document.getType()).name());
        documentDetail.setExpiryDate(document.getExpiryDate());
        documentDetail.setIssueDate(document.getIssuedDate());
        return documentDetail;
    }

    public static Transaction toTransactionDetail(TransactionDetail detail){
        Transaction transaction = new Transaction();
        transaction.setAmount(detail.getAmount());
        return transaction;
    }
}
