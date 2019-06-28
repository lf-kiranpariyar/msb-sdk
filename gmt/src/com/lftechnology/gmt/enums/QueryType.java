package com.lftechnology.gmt.enums;

public enum QueryType {

    BANK("bankList"), TRANSACTION_PROCESS("process"), TRANSACTION_GET_STATUS("getStatus"), TRANSACTION_DETAIL("detail"), COUNTRY("country"), GET_RATE("getRate"), UPDATE_RATE("updatecustomrate"), PAY_TRANSACTION("paytransaction");

    private String value;

    QueryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
