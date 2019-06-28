package com.lftechnology.gmt.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Hold Transaction Status for MoneyTune.
 */
public enum TxnStatus {

    UNPAID("Unpaid"), HOLD("Hold"), POST("Post"), COMPLAINCE("Compliance"), CANCEL("Cancel"), PAID("Paid");

    public static final Map<String, TxnStatus> roleIndex = new HashMap<>();

    static {
        for (TxnStatus role : TxnStatus.values()) {
            roleIndex.put(role.value, role);
        }
    }

    private String value;

    TxnStatus(String value) {
        this.value = value;
    }

    public static TxnStatus getValue(String value) {
        return roleIndex.get(value);
    }
}
