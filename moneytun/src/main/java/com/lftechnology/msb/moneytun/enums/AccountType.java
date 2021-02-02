package com.lftechnology.msb.moneytun.enums;

public enum AccountType {

    CREDIT("Credit Card"), DEBIT("Debit Card"), SAVINGS("Savings"), CHECKING("Checking");

    private String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getType() {
        return value;
    }
}
