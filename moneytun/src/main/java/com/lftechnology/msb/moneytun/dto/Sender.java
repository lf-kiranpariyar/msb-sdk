package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class Sender {

    @SerializedName("SenderFirstName")
    String firstName;

    @SerializedName("SenderLastName")
    String lastName;

    @SerializedName("SenderMiddleName")
    String middleName;

    @SerializedName("SenderAddressLine1")
    String addressLine1;

    @SerializedName("SenderAddressLine2")
    String addressLine2;

    @SerializedName("SenderCountryISOCode")
    String senderCountryISOCode;

    @SerializedName("SenderStateISOCode")
    String stateISOCode;

    @SerializedName("SenderState")
    String state;

    @SerializedName("SenderCity")
    String city;

    @SerializedName("SenderZipCode")
    String zipCode;

    @SerializedName("SenderPhone1")
    String phone;

    @SerializedName("SenderNationality")
    String nationality;

    @SerializedName("SenderDateOfBirth")
    LocalDate dateOfBirth;

    @SerializedName("SenderGender")
    String gender;

    private Sender(Builder builder) {
        setFirstName(builder.firstName);
        setLastName(builder.lastName);
        setMiddleName(builder.middleName);
        setAddressLine1(builder.addressLine1);
        setAddressLine2(builder.addressLine2);
        setSenderCountryISOCode(builder.senderCountryISOCode);
        setStateISOCode(builder.stateISOCode);
        setState(builder.state);
        setCity(builder.city);
        setZipCode(builder.zipCode);
        setPhone(builder.phone);
        setNationality(builder.nationality);
        setDateOfBirth(builder.dateOfBirth);
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
        private String senderCountryISOCode;
        private String stateISOCode;
        private String state;
        private String city;
        private String zipCode;
        private String phone;
        private String nationality;
        private LocalDate dateOfBirth;
        private String gender;

        public Builder() {
        }

        public Builder name(String firstName, String middleName, String lastName){
            this.firstName = firstName;
            this.lastName=lastName;
            this.middleName = middleName;
            return  this;
        }

        public Builder addressDetails(String addressLine1, String addressLine2, String senderCountryISOCode, String stateISOCode, String state, String city){
            this.addressLine1 = addressLine1;
            this.addressLine2 =addressLine2;
            this.senderCountryISOCode = senderCountryISOCode;
            this.stateISOCode=stateISOCode;
            this.state = state;
            this.city=city;
            return  this;

        }
        public Builder contactDetails(String zipCode, String phone){
            this.zipCode = zipCode;
            this.phone=phone;
            return this;
        }

        public Builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Sender build() {
            return new Sender(this);
        }
    }
}
