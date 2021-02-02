package com.lftechnology.gmt.enums;

public enum PaymentMode {

    CASH_PICKUP("CASH PICKUP"), ACCOUNT_DEPOSIT("SEND TO ACCOUNT"), HOME_DELIVERY("CASH DELIVERY");

    private String value;

    PaymentMode(String value) {
        this.value = value;
    }

    public String getMode() {
        return value;
    }


}
