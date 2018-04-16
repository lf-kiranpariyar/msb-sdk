package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class SubPayer {

    @SerializedName("Payer")
    String payerName;

    @SerializedName("SubPayer")
    String name;

    @SerializedName("DestinationCountryISOCode")
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
