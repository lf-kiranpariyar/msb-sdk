package com.lftechnology.msb.sdk.dto;

import com.lftechnology.msb.sdk.enums.TransactionPaymentType;

import java.math.BigDecimal;

public class Transaction {

    private Sender sender;
    private Recipient recipient;
    private Document document;
    private Bank bank;
    private String transactionId;
    private BigDecimal amount;
    private BigDecimal rate;
    private BigDecimal recipientAmount;
    private TransactionPaymentType type;
    private String sourceOfIncome;
    private String purpose;
    private String note;

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TransactionPaymentType getType() {
        return type;
    }

    public void setType(TransactionPaymentType type) {
        this.type = type;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getRecipientAmount() {
        return recipientAmount;
    }

    public void setRecipientAmount(BigDecimal recipientAmount) {
        this.recipientAmount = recipientAmount;
    }
}
