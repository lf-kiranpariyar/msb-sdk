package com.lftechnology.msb.moneytun.enums;


public enum DocumentType {

    PASSPORT("Passport"), STATE_ID("Identification Card (ID)"), LICENSE("Driver License"), SENIOR_CITIZENSHIP("Senior Citizen Card"), MILITARY_ID("Military ID"), SSN("Social Security");

    String value;

    DocumentType(String value){
        this.value = value;
    }

    public String getType() {
        return value;
    }
}
