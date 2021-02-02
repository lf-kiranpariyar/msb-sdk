package com.lftechnology.gmt.enums;


public enum DocumentType {

    PASSPORT("PASSPORT"), STATE_ID("STATE-ISSUED ID"), LICENSE("DRIVERS LICENSE"), SENIOR_CITIZENSHIP("Senior Citizen Card"), MILITARY_ID("Military ID"), SSN("Social Security");

    private String value;

    private DocumentType(String value) {
        this.value = value;
    }

    public String getType() {
        return value;
    }
}
