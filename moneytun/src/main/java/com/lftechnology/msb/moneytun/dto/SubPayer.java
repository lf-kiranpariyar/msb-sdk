package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubPayer {

    @JsonProperty("Payer")
    String payerName;

    @JsonProperty("SubPayer")
    String name;

    @JsonProperty("DestinationCountryISOCode")
    String destinationCurrencyISOCode;

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestinationCurrencyISOCode() {
        return destinationCurrencyISOCode;
    }

    public void setDestinationCurrencyISOCode(String destinationCurrencyISOCode) {
        this.destinationCurrencyISOCode = destinationCurrencyISOCode;
    }
}
