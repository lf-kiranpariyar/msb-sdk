package com.lftechnology.msb.moneytun.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.lftechnology.msb.sdk.exception.ApiException;

public enum DocumentType {

    PASSPORT("Passport"), STATE_ID("Identification Card (ID)"), LICENSE("Driver License"), SENIOR_CITIZENSHIP("Senior Citizen Card"), MILITARY_ID("Military ID"), SSN("Social Security");

    String value;

    DocumentType(String value){
        this.value = value;
    }

    @JsonValue
    public String getType() {
        return value;
    }

    public DocumentType getDocumentType(com.lftechnology.msb.sdk.enums.DocumentType documentType){
        switch (documentType){
            case PASSPORT:
                return DocumentType.PASSPORT;
            case STATE_ID:
                return STATE_ID;
            case DRIVING_LICENCE:
                return  LICENSE;
            default:
                throw new ApiException("Invalid Document Type Supplied");
        }
    }
}
