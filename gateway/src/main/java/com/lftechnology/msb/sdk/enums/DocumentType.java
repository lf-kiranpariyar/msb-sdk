package com.lftechnology.msb.sdk.enums;

import com.lftechnology.msb.sdk.exception.UnsupportedException;

public enum DocumentType {

    PASSPORT("Passport"),
    DRIVING_LICENCE("License"),
    STATE_ID("ID Card"),
    SSN("Social Security Number");

    private final String value;

    DocumentType(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    String getKey() {
        return name();
    }

    public static com.lftechnology.msb.moneytun.enums.DocumentType getMoneyTunDocument(DocumentType type){
        switch (type){
            case DRIVING_LICENCE:
                return  com.lftechnology.msb.moneytun.enums.DocumentType.LICENSE;
            case PASSPORT:
                return  com.lftechnology.msb.moneytun.enums.DocumentType.PASSPORT;
            case STATE_ID:
                return  com.lftechnology.msb.moneytun.enums.DocumentType.STATE_ID;
            case SSN:
                return com.lftechnology.msb.moneytun.enums.DocumentType.SSN;
            default:
                throw new UnsupportedException("Invalid Document Type Supplied");
        }
    }

    public static com.lftechnology.msb.prabhu.enums.DocumentType getPrabhuDocument(DocumentType type){
        switch (type){
            case DRIVING_LICENCE:
                return  com.lftechnology.msb.prabhu.enums.DocumentType.LICENSE;
            case PASSPORT:
                return  com.lftechnology.msb.prabhu.enums.DocumentType.PASSPORT;
            case STATE_ID:
                return  com.lftechnology.msb.prabhu.enums.DocumentType.STATE_ID;
            default:
                return com.lftechnology.msb.prabhu.enums.DocumentType.CUSTOMER_ID;
        }
    }
}
