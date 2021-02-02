package com.lftechnology.moneytun.outbound.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author shankar ghimire
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sender {

    @JsonProperty("SenderFirstName")
    private String firstName;

    @JsonProperty("MiddleName")
    private String middleName;

    @JsonProperty("SenderLastName")
    private String lastName;

    @JsonProperty("SENDERMOTHERMAIDENNAME")
    private String motherMaidenName;

    @JsonProperty("SenderAddress")
    private String address;

    @JsonProperty("SenderPhone")
    private String phone;

    @JsonProperty("SenderCity")
    private String city;

    @JsonProperty("SenderState")
    private String state;

    @JsonProperty("SenderCountry")
    private String country;

    @JsonProperty("SenderCode")
    private String senderCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    public void setMotherMaidenName(String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSenderCode() {
        return senderCode;
    }

    public void setSenderCode(String senderCode) {
        this.senderCode = senderCode;
    }
}
