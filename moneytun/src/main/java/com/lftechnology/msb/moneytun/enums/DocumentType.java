package com.lftechnology.msb.moneytun.enums;


public enum DocumentType {

    PASSPORT("Passport"), STATE_ID("Identification Card (ID)"), LICENSE("Driver License"), SENIOR_CITIZENSHIP("Senior Citizen Card"), MILITARY_ID("Military ID"), SSN("Social Security");

    private String value;

    private DocumentType(String value) {
        this.value = value;
    }

    public String getType() {
        return value;
    }
}
