package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sender {

    @JsonProperty("SenderFirstName")
    String firstName;

    @JsonProperty("SenderLastName")
    String lastName;

    @JsonProperty("SenderMiddleName")
    String middleName;

    @JsonProperty("SenderAddressLine1")
    String addressLine1;

    @JsonProperty("SenderAddressLine2")
    String addressLine2;

    @JsonProperty("SenderCountryISOCode")
    String senderCountryISOCode;

    @JsonProperty("SenderStateISOCode")
    String stateISOCode;

    @JsonProperty("SenderState")
    String state;

    @JsonProperty("SenderCity")
    String city;

    @JsonProperty("SenderZipCode")
    String zipCode;

    @JsonProperty("SenderPhone1")
    String phone;

    @JsonProperty("SenderNationality")
    String nationality;

    @JsonProperty("SenderDateOfBirth")
    String dateOfBirth;

    @JsonProperty("SenderGender")
    String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getSenderCountryISOCode() {
        return senderCountryISOCode;
    }

    public void setSenderCountryISOCode(String senderCountryISOCode) {
        this.senderCountryISOCode = senderCountryISOCode;
    }

    public String getStateISOCode() {
        return stateISOCode;
    }

    public void setStateISOCode(String stateISOCode) {
        this.stateISOCode = stateISOCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
