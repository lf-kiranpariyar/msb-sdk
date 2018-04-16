package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class PointOfContact {

    @SerializedName("POCID")
    Integer id;

    @SerializedName("Payee")
    String payee;

    @SerializedName("POCName")
    String name;

    @SerializedName("CountryISOCode")
    String countryISOCode;

    @SerializedName("StateISOCode")
    String stateISOCode;

    @SerializedName("StateName")
    String stateName;

    @SerializedName("CityName")
    String cityName;

    @SerializedName("Phone")
    String phoneNumber;

    @SerializedName("Fax")
    String fax;

    @SerializedName("Zip")
    String zipCode;

    @SerializedName("Address")
    String address;

    @SerializedName("SendCurrencyISOCode")
    String sendCurrencyISOCode;

    @SerializedName("ReceipientCurrencyISOCode")
    String recieverCurrencyISOCode;

    @SerializedName("DeliveryMethod")
    String deliveryMethod;

    @SerializedName("SubPayer")
    String subPayer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
