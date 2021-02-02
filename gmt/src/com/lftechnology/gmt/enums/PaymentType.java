package com.lftechnology.gmt.enums;

public enum PaymentType {
    CASH("CASH"), CHECK("CHECK"), DEBIT("DEBIT") , CASH_CHECK("CASH&CHECK") , DIRECT_DEPOST("DIRECTDEPOSIT") , ACH("ACH");

    private String value;

    PaymentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
