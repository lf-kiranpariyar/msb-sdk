package com.lftechnology.msb.prabhu.enums;

public enum PaymentMode {
    CASH_PICKUP("C"), ACCOUNT_DEPOSIT("B"),ACCOUNT_DEPOSIT_ANOTHER_BANK("D"), CASH_PAYMENT_BDP("E"),HOME_DELIVERY("H"), NEFT("N");

    String value;

    PaymentMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
