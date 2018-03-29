package com.lftechnology.msb.sdk.dto;

import com.lftechnology.msb.moneytun.enums.DocumentType;

import java.time.LocalDate;

public class Document {

    DocumentType type;
    String idNumber;
    LocalDate issuedDate;
    LocalDate expiryDate;
    String countryISOCode;

    public Document(DocumentType type, String idNumber, LocalDate issuedDate, LocalDate expiryDate, String countryISOCode) {
        this.type = type;
        this.idNumber = idNumber;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
        this.countryISOCode = countryISOCode;
    }

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }
}
