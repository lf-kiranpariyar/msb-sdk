package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.lftechnology.msb.moneytun.serializer.DateSerializer;

import java.time.LocalDate;

public class Document {

    @SerializedName(value = "SenderIDDocumentType")
    String type;

    @SerializedName(value = "SenderIDDocumentNumber")
    String identificationNumber;

    @SerializedName("SenderIDDocumentCountry")
    String countryName;

    @SerializedName("SenderIDDocumentCity")
    String city="";

    @SerializedName("SenderIDDocumentState")
    String state="";

    @SerializedName("SenderIDDocumentCountryISOCode")
    String documentCountryISOCode;

    @SerializedName("SenderIDDocumentStateISOCode")
    String stateISOCode="";

    @JsonAdapter(DateSerializer.class)
    @SerializedName("SenderIDIssueDate")
    LocalDate issueDate;

    @SerializedName("SenderIDExpiryDate")
    LocalDate expiryDate;

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
