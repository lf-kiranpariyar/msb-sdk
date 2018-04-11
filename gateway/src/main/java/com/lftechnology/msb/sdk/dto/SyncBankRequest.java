package com.lftechnology.msb.sdk.dto;

import com.lftechnology.msb.sdk.enums.TransactionPaymentType;

public class SyncBankRequest {

    Country country;
    TransactionPaymentType type;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public TransactionPaymentType getType() {
        return type;
    }

    public void setType(TransactionPaymentType type) {
        this.type = type;
    }
}
