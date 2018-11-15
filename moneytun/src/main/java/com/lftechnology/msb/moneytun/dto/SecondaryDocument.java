package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lftechnology.msb.moneytun.serializer.DocumentDateSerializer;

import java.time.LocalDate;

public class SecondaryDocument {

    @JsonProperty(value = "SenderIDDocumentType2")
    private String type;

    @JsonProperty(value = "SenderIDDocumentNumber2")
    private String identificationNumber;

    @JsonProperty("SenderIDDocumentCountry2")
    private String countryName;

    @JsonProperty("SenderIDDocumentCity2")
    private String city = "";

    @JsonProperty("SenderIDDocumentState2")
    private String state = "";

    @JsonProperty("SenderIDDocumentCountryISOCode2")
    private String documentCountryISOCode;

    @JsonProperty("SenderIDDocumentStateISOCode2")
    private String stateISOCode = "";

    @JsonProperty("SenderIDIssueDate2")
    @JsonSerialize(using = DocumentDateSerializer.class)
    private LocalDate issueDate;

    @JsonProperty("SenderIDExpiryDate2")
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
