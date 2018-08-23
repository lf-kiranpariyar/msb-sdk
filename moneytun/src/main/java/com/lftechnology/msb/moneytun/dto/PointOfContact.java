package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PointOfContact {

    @JsonProperty("POCID")
    Long id;

    @JsonProperty("Payee")
    String payee;

    @JsonProperty("POCName")
    String name;

    @JsonProperty("CountryISOCode")
    String countryISOCode;

    @JsonProperty("StateISoCode")
    String stateISOCode;

    @JsonProperty("StateName")
    String stateName;

    @JsonProperty("CityName")
    String cityName;

    @JsonProperty("Phone")
    String phoneNumber;

    @JsonProperty("Fax")
    String fax;

    @JsonProperty("Zip")
    String zipCode;

    @JsonProperty("Address")
    String address;

    @JsonProperty("SendCurrencyISOCode")
    String sendCurrencyISOCode;

    @JsonProperty("ReceipientCurrencyISOCode")
    String recieverCurrencyISOCode;

    @JsonProperty("DeliveryMethod")
    String deliveryMethod;

    @JsonProperty("SubPayer")
    String subPayer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public String getStateISOCode() {
        return stateISOCode;
    }

    public void setStateISOCode(String stateISOCode) {
        this.stateISOCode = stateISOCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSendCurrencyISOCode() {
        return sendCurrencyISOCode;
    }

    public void setSendCurrencyISOCode(String sendCurrencyISOCode) {
        this.sendCurrencyISOCode = sendCurrencyISOCode;
    }

    public String getRecieverCurrencyISOCode() {
        return recieverCurrencyISOCode;
    }

    public void setRecieverCurrencyISOCode(String recieverCurrencyISOCode) {
        this.recieverCurrencyISOCode = recieverCurrencyISOCode;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getSubPayer() {
        return subPayer;
    }

    public void setSubPayer(String subPayer) {
        this.subPayer = subPayer;
    }

}
