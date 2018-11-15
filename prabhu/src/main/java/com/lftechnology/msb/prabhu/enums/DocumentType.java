package com.lftechnology.msb.prabhu.enums;

public enum DocumentType {

    PASSPORT("PASSPORT"), CUSTOMER_ID("CUSTOMER ID"), STATE_ID("Identification Card (ID)"), LICENSE("DRIVING LICENSE"), WORK_PERMIT("WORK PERMIT"), NATIONAL_ID("NATIONAL ID"), COMPANY_ID("COMPANY ID"), NRIC_NO("NRIC NO"), RESIDENT_ID("RESIDENT ID"), EMPLOYER_ID("EMPLOYER ID");

    String value;

    DocumentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
