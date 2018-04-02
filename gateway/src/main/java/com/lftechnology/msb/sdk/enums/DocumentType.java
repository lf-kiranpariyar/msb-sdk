package com.lftechnology.msb.sdk.enums;

public enum DocumentType {

    PASSPORT("Passport"),
    DRIVING_LICENCE("License"),
    STATE_ID("ID Card");

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
}
