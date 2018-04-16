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

    private Reciever(Builder builder) {
        setFirstName(builder.firstName);
        setLastName(builder.lastName);
        setMiddleName(builder.middleName);
        setAddressLine1(builder.addressLine1);
        setAddressLine2(builder.addressLine2);
        setCountryISOCode(builder.countryISOCode);
        setState(builder.state);
        setStateISOCode(builder.stateISOCode);
        setCity(builder.city);
        setPhoneNumber(builder.phoneNumber);
        setGender(builder.gender);
    }

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


    public static final class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String addressLine1;
        private String addressLine2;
        private String countryISOCode;
        private String state;
        private String stateISOCode;
        private String city;
        private String phoneNumber;
        private String gender;

        public Builder() {
        }

        public Reciever.Builder name(String firstName, String middleName, String lastName){
            this.firstName = firstName;
            this.lastName=lastName;
            this.middleName = middleName;
            return  this;
        }

        public Reciever.Builder addressDetails(String addressLine1, String addressLine2, String countryISOCode, String stateISOCode, String state, String city){
            this.addressLine1 = addressLine1;
            this.addressLine2 =addressLine2;
            this.countryISOCode = countryISOCode;
            this.stateISOCode=stateISOCode;
            this.state = state;
            this.city=city;
            return  this;
        }

        public Reciever.Builder contactDetails(String phone){
            this.phoneNumber=phone;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Reciever build() {
            return new Reciever(this);
        }
    }
}
