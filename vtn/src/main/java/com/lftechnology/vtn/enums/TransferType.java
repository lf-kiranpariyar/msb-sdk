package com.lftechnology.vtn.enums;

public enum TransferType {
    MOBILE_WALLET("1"), BANK_ACCOUNT("2");

    private String value;

    TransferType(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
