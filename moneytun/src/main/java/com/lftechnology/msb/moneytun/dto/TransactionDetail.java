package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lftechnology.msb.moneytun.enums.TxnStatus;

import java.math.BigDecimal;

public class TransactionDetail {

    @JsonProperty("TransId")
    String invoiceNumber;

    @JsonProperty("Sender")
    Long senderId;

    @JsonProperty("Receiver")
    Long recipientId;

    @JsonProperty("")
    TxnStatus status;

    @JsonProperty("ConversionRate")
    BigDecimal rate;

    @JsonProperty("SendAmount")
    BigDecimal amount;

    @JsonProperty("SendTotal")
    BigDecimal total;

    @JsonProperty("ReceivedAmount")
    BigDecimal recipientAmount;

    @JsonProperty("SenderCurrency")
    Integer sourceCurrencyId;

    @JsonProperty("ReceivedCurrency")
    Integer destinationCurrencyId;

    @JsonProperty("TransactionDate")
    String date;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public TxnStatus getStatus() {
        return status;
    }

    public void setStatus(TxnStatus status) {
        this.status = status;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getRecipientAmount() {
        return recipientAmount;
    }

    public void setRecipientAmount(BigDecimal recipientAmount) {
        this.recipientAmount = recipientAmount;
    }

    public Integer getSourceCurrencyId() {
        return sourceCurrencyId;
    }

    public void setSourceCurrencyId(Integer sourceCurrencyId) {
        this.sourceCurrencyId = sourceCurrencyId;
    }

    public Integer getDestinationCurrencyId() {
        return destinationCurrencyId;
    }

    public void setDestinationCurrencyId(Integer destinationCurrencyId) {
        this.destinationCurrencyId = destinationCurrencyId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
