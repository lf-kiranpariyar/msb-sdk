package com.lftechnology.msb.sdk.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.dto.Receiver;
import com.lftechnology.msb.moneytun.enums.ApiMode;
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
import org.slf4j.LoggerFactory;

import java.util.Map;

public class MoneyTunObjectMapper {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MoneyTunObjectMapper.class);

    public static TransactionResponse toTransactionResponse(com.lftechnology.msb.moneytun.dto.TransactionResponse response) {
        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.setReferenceNumber(response.getReferenceNumber());
        ObjectMapper objectMapper = new ObjectMapper();
        transactionResponse.setMetadata(objectMapper.convertValue(response, Map.class));
        return transactionResponse;
    }

    public static com.lftechnology.msb.moneytun.dto.Transaction toTransaction(Transaction transaction, APIContext apiContext) {
        LOGGER.debug("Transaction Object Reference For MoneyTun Transaction Creation : {}", transaction);
        com.lftechnology.msb.moneytun.dto.Sender sender = toSender(transaction.getSender());
        Receiver receiver = toReciever(transaction.getRecipient());
        PaymentMode paymentMode = TransactionPaymentType.getMoneyTunPaymentMode(transaction.getType());
        com.lftechnology.msb.moneytun.dto.Document document = toDocument(transaction.getSender().getDocumentList().stream().filter(it -> it.getType() != DocumentType.SSN).findFirst().get());
        document.setDocumentCountryISOCode(transaction.getSender().getAddress().getCountry().getThreeCharISOCode());
        Bank bank = transaction.getBank();
        com.lftechnology.msb.moneytun.dto.Transaction transactiondetail = new com.lftechnology.msb.moneytun.dto.Transaction.Builder().
                party(sender, receiver, document).bankDetails(String.valueOf(bank.getMetadata().get("BankName")), transaction.getRecipient().getAddress().getCountry().getThreeCharISOCode().equalsIgnoreCase("NGA") ?String.valueOf(bank.getMetadata().get("BankCode")) :  bank.getBranch().getName(), bank.getAccountNumber(), bank.getType()).
                paymentMethod(paymentMode.getMode()).transactionAmount(transaction.getAmount(), transaction.getRate(), transaction.getRecipientAmount()).build();
        fetchPOC(apiContext, bank, transactiondetail);
        transactiondetail.setSender(toSender(transaction.getSender()));
        transactiondetail.setReceiver(toReciever(transaction.getRecipient()));
        transactiondetail.setReceiverCurrencyCode(transaction.getRecipient().getAddress().getCountry().getCurrencyCode());
        transactiondetail.setPaymentMethod("Bank Transfer");
        transactiondetail.setSourceCurrencyCode(transaction.getSender().getAddress().getCountry().getCurrencyCode());

        //FIXME : After MoneyTun Fix the Issue
        if ("SAVINGS".equalsIgnoreCase(transactiondetail.getAccountType())) {
            transactiondetail.setAccountType("7");
        } else {
            transactiondetail.setAccountType("8");
        }
        LOGGER.debug("Transaction Object For MoneyTun Transaction Creation : {}", transactiondetail);
        return transactiondetail;
    }

    private static void fetchPOC(APIContext apiContext, Bank bank, com.lftechnology.msb.moneytun.dto.Transaction transactiondetail) {
        if (apiContext.getMode() == ApiMode.LIVE) {
            transactiondetail.setPointOfContactId(Long.valueOf(bank.getMetadata().get("pocId").toString()));
            transactiondetail.setDeliveryMethod(PaymentMode.ACCOUNT_DEPOSIT.getMode());
        } else {
            transactiondetail.setPointOfContactId(87198l);
            transactiondetail.setDeliveryMethod(PaymentMode.CASH_PICKUP.getMode());
        }
    }

    public static com.lftechnology.msb.moneytun.dto.Sender toSender(Sender sender) {
        Address address = sender.getAddress();
        Contact contact = sender.getContact();
        return new com.lftechnology.msb.moneytun.dto.Sender.Builder().
                name(sender.getFirstName(), sender.getMiddleName(), sender.getLastName()).
                addressDetails(address.getAddressLine1(), address.getAddressLine2(), address.getCountry().getThreeCharISOCode(), address.getCountry().getTwoCharISOCode() + "-" + address.getState().getTwoCharISOCode(), address.getState().getTwoCharISOCode(), address.getCity()).
                nationality(address.getCountry().getThreeCharISOCode()).
                contactDetails(contact.getMobilePhone(), address.getPostCode()).dateOfBirth(sender.getDateOfBirth()).gender(sender.getGender().code()).build();
    }

    public static Receiver toReciever(Recipient recipient) {
        Address address = recipient.getAddress();
        Contact contact = recipient.getContact();
        return new Receiver.Builder().
                name(recipient.getFirstName(), recipient.getMiddleName(), recipient.getLastName()).
                addressDetails(address.getAddressLine1(), address.getAddressLine2(), address.getCountry().getThreeCharISOCode(), "", address.getState().getName(), address.getCity()).
                contactDetails(contact.getMobilePhone()).gender("").build();
    }

    public static com.lftechnology.msb.moneytun.dto.Document toDocument(Document document) {
        com.lftechnology.msb.moneytun.dto.Document documentDetail = new com.lftechnology.msb.moneytun.dto.Document();
        documentDetail.setDocumentCountryISOCode(document.getCountryISOCode());
        documentDetail.setType(DocumentType.getMoneyTunDocument(document.getType()).getType());
        documentDetail.setExpiryDate(document.getExpiryDate());
        documentDetail.setIssueDate(document.getIssuedDate());
        documentDetail.setIdentificationNumber(document.getIdNumber());
        documentDetail.setDocumentCountryISOCode(document.getCountryISOCode());
        documentDetail.setCountryName(document.getCountryISOCode());
        return documentDetail;
    }

    public static com.lftechnology.msb.moneytun.dto.SecondaryDocument toSecondaryDocument(Document document) {
        com.lftechnology.msb.moneytun.dto.SecondaryDocument documentDetail = new com.lftechnology.msb.moneytun.dto.SecondaryDocument();
        documentDetail.setDocumentCountryISOCode(document.getCountryISOCode());
        documentDetail.setType(DocumentType.getMoneyTunDocument(document.getType()).getType());
        documentDetail.setExpiryDate(document.getExpiryDate());
        documentDetail.setIssueDate(document.getIssuedDate());
        documentDetail.setIdentificationNumber(document.getIdNumber());
        documentDetail.setDocumentCountryISOCode(document.getCountryISOCode());
        return documentDetail;
    }
}
