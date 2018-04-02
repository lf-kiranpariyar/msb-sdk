package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reciever {

    @JsonProperty("ReceiverFirstName")
    String firstName;

    @JsonProperty("ReceiverLastName")
    String lastName;

    @JsonProperty("ReceiverMiddleName")
    String middleName;

    @JsonProperty("ReceiverAddressLine1")
    String addressLine1;

    @JsonProperty("ReceiverAddressLine2")
    String addressLine2;

    @JsonProperty("ReceiverCountryISOCode")
    String countryISOCode;

    @JsonProperty("ReceiverState")
    String state;

    @JsonProperty("ReceiverStateISOCode")
    String stateISOCode = "Default State";

    @JsonProperty("ReceiverCity")
    String city="Default City";

    @JsonProperty("ReceiverPhone1")
    String phoneNumber;

    @JsonProperty("ReceiverGender")
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

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateISOCode() {
        return stateISOCode;
    }

    public void setStateISOCode(String stateISOCode) {
        this.stateISOCode = stateISOCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
