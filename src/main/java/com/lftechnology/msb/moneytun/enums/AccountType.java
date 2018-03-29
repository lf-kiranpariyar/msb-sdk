package com.lftechnology.msb.moneytun.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountType {

    CREDIT("Credit Card"), DEBIT("Debit Card"), SAVINGS("Savings"), CHECKING("Checking");

    String value;

    AccountType(String value){
        this.value =value;
    }

    @JsonValue
    public String getType() {
        return value;
    }
}
