package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class Payer {

    @SerializedName("PayeeId")
    Integer id;

    @SerializedName("PayeeCode")
    String code;

    @SerializedName("PayeeName")
    String name;

    @SerializedName("CountryISOCode")
    String countryISOCode;

    @SerializedName("StateISOCode")
    String stateISOCode;

    @SerializedName("StateName")
    String stateName;

    @SerializedName("CityName")
    String cityName;

    @SerializedName("AddressLine1")
    String addressLine1;

    @SerializedName("AddressLine2")
    String getAddressLine2;

    @SerializedName("Phone1")
    String primaryPhoneNumber;

    @SerializedName("Phone2")
    String secondaryPhoneNumber;

    @SerializedName("Fax")
    String fax;

    @SerializedName("Zip")
    String zipCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getGetAddressLine2() {
        return getAddressLine2;
    }

    public void setGetAddressLine2(String getAddressLine2) {
        this.getAddressLine2 = getAddressLine2;
    }

    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
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
}
