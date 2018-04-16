package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeRate {

    @JsonProperty("DestinationCurrencyISoCode")
    String destinationCurrencyISOCode;

    @JsonProperty("PayeeCode")
    String payeeCode = "";

    @JsonProperty("SourceCurrencyISoCode")
    String sourceCurrencyISOCode;

    @JsonProperty("SenderAgencyCode")
    String senderAgencyCode;

    @JsonProperty("SubPayer")
    String subPayer="";

    public String getDestinationCurrencyISOCode() {
        return destinationCurrencyISOCode;
    }

    public void setDestinationCurrencyISOCode(String destinationCurrencyISOCode) {
        this.destinationCurrencyISOCode = destinationCurrencyISOCode;
    }

    public String getPayeeCode() {
        return payeeCode;
    }

    public void setPayeeCode(String payeeCode) {
        this.payeeCode = payeeCode;
    }

    public String getSourceCurrencyISOCode() {
        return sourceCurrencyISOCode;
    }

    public void setSourceCurrencyISOCode(String sourceCurrencyISOCode) {
        this.sourceCurrencyISOCode = sourceCurrencyISOCode;
    }

    public String getSenderAgencyCode() {
        return senderAgencyCode;
    }

    public void setSenderAgencyCode(String senderAgencyCode) {
        this.senderAgencyCode = senderAgencyCode;
    }

    public String getSubPayer() {
        return subPayer;
    }

    public void setSubPayer(String subPayer) {
        this.subPayer = subPayer;
    }
}
