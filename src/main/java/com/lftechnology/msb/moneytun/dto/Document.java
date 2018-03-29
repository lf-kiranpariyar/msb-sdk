package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {

    @JsonProperty(value = "SenderIDDocumentType")
    String type;

    @JsonProperty(value = "SenderIDDocumentNumber")
    String identificationNumber;

    @JsonProperty("SenderIDDocumentCountry")
    String countryName;

    @JsonProperty("SenderIDDocumentCity")
    String city="";

    @JsonProperty("SenderIDDocumentState")
    String state="";

    @JsonProperty("SenderIDDocumentCountryISOCode")
    String documentCountryISOCode;

    @JsonProperty("SenderIDDocumentStateISOCode")
    String stateISOCode="";

    @JsonProperty("SenderIDIssueDate")
    String issueDate;

    @JsonProperty("SenderIDExpiryDate")
    String expiryDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDocumentCountryISOCode() {
        return documentCountryISOCode;
    }

    public void setDocumentCountryISOCode(String documentCountryISOCode) {
        this.documentCountryISOCode = documentCountryISOCode;
    }

    public String getStateISOCode() {
        return stateISOCode;
    }

    public void setStateISOCode(String stateISOCode) {
        this.stateISOCode = stateISOCode;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
