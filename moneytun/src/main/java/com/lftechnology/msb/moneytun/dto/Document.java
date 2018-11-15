package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lftechnology.msb.moneytun.serializer.DocumentDateSerializer;

import java.time.LocalDate;

public class Document {

    @JsonProperty(value = "SenderIDDocumentType")
    private String type;

    @JsonProperty(value = "SenderIDDocumentNumber")
    private String identificationNumber;

    @JsonProperty("SenderIDDocumentCountry")
    private String countryName;

    @JsonProperty("SenderIDDocumentCity")
    private String city = "";

    @JsonProperty("SenderIDDocumentState")
    private String state = "";

    @JsonProperty("SenderIDDocumentCountryISOCode")
    private String documentCountryISOCode;

    @JsonProperty("SenderIDDocumentStateISOCode")
    private String stateISOCode = "";

    @JsonProperty("SenderIDIssueDate")
    @JsonSerialize(using = DocumentDateSerializer.class)
    private LocalDate issueDate;

    @JsonProperty("SenderIDExpiryDate")
    @JsonSerialize(using = DocumentDateSerializer.class)
    private LocalDate expiryDate;

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

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
