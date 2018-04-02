package com.lftechnology.msb.moneytun.enums;

public enum TxnStatus {
    UNPAID("Un-Paid"), HOLD("Hold"), POST("Post"), COMPLAINCE("Compliance"), CANCEL("Cancel"), PAID("Paid");

    String value;

    TxnStatus(String value) {
        this.value = value;
    }
}
