package com.lftechnology.msb.prabhu.enums;

import com.lftechnology.msb.sdk.exception.ApiException;

public enum DocumentType {

    PASSPORT("PASSPORT"), CUSTOMER_ID("CUSTOMER ID"),STATE_ID("Identification Card (ID)"), LICENSE("DRIVING LICENSE"), WORK_PERMIT("WORK PERMIT"), NATIONAL_ID("NATIONAL ID"), COMPANY_ID("COMPANY ID"), NRIC_NO("NRIC NO"), RESIDENT_ID("RESIDENT ID"), EMPLOYER_ID("EMPLOYER ID");

    String value;

    DocumentType(String value){
        this.value = value;
    }

    public DocumentType getDocumentType(com.lftechnology.msb.sdk.enums.DocumentType documentType){
        switch (documentType){
            case PASSPORT:
                return DocumentType.PASSPORT;
            case STATE_ID:
                return DocumentType.STATE_ID;
            case DRIVING_LICENCE:
                return  DocumentType.LICENSE;
            default:
                throw new ApiException("Invalid Document Type Supplied");
        }
    }
}
