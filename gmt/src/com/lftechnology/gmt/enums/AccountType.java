package com.lftechnology.gmt.enums;

public enum AccountType {

    CREDIT("Credit Card"), DEBIT("Debit Card"), SAVINGS("SV"), CHECKING("CHK");

    private String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getType() {
        return value;
    }
}
