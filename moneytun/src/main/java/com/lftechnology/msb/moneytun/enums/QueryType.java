package com.lftechnology.msb.moneytun.enums;

public enum QueryType {

    BANK("bankList"), TRANSACTION_PROCESS("process"), TRANSACTION_GET_STATUS("getStatus"), TRANSACTION_DETAIL("detail"), COUNTRY("country");

    String value;

    QueryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
