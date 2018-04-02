package com.lftechnology.msb.moneytun.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMode {

    CASH_PICKUP("CASH PICKUP"), ACCOUNT_DEPOSIT("SEND TO ACCOUNT"),HOME_DELIVERY("CASH DELIVERY");

    String value;

    PaymentMode(String value) {
        this.value = value;
    }

    @JsonValue
    public String getMode() {
        return value;
    }
}
