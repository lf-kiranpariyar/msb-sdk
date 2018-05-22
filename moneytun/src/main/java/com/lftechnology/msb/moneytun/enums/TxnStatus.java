package com.lftechnology.msb.moneytun.enums;

/**
 * Hold Transaction Status for MoneyTune.
 */
public enum TxnStatus {

    UNPAID("Un-Paid"), HOLD("Hold"), POST("Post"), COMPLAINCE("Compliance"), CANCEL("Cancel"), PAID("Paid");

    private String value;

    TxnStatus(String value) {
        this.value = value;
    }
}
