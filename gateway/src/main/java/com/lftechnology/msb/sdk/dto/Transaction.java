package com.lftechnology.msb.sdk.dto;

import com.lftechnology.msb.sdk.enums.TransactionPaymentType;

import java.math.BigDecimal;
import java.time.LocalDate;

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
    private LocalDate transferDate;
    private Integer transferType;
    private String currencyCode;
    private BigDecimal feeInSenderCurrency;
    private BigDecimal feeInRecipientCurrency;
    private String referenceNumber;

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

    public LocalDate getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getFeeInSenderCurrency() {
        return feeInSenderCurrency;
    }

    public void setFeeInSenderCurrency(BigDecimal feeInSenderCurrency) {
        this.feeInSenderCurrency = feeInSenderCurrency;
    }

    public BigDecimal getFeeInRecipientCurrency() {
        return feeInRecipientCurrency;
    }

    public void setFeeInRecipientCurrency(BigDecimal feeInRecipientCurrency) {
        this.feeInRecipientCurrency = feeInRecipientCurrency;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("sender=").append(sender);
        sb.append(", recipient=").append(recipient);
        sb.append(", document=").append(document);
        sb.append(", bank=").append(bank);
        sb.append(", transactionId='").append(transactionId).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", rate=").append(rate);
        sb.append(", recipientAmount=").append(recipientAmount);
        sb.append(", type=").append(type);
        sb.append(", sourceOfIncome='").append(sourceOfIncome).append('\'');
        sb.append(", purpose='").append(purpose).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append(", transferDate=").append(transferDate);
        sb.append(", transferType=").append(transferType);
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append(", feeInSenderCurrency=").append(feeInSenderCurrency);
        sb.append(", feeInRecipientCurrency=").append(feeInRecipientCurrency);
        sb.append('}');
        return sb.toString();
    }
}
