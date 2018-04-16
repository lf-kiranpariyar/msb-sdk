package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class State {

    @SerializedName("StateISOCode")
    String isoCode;

    @SerializedName("StateName")
    String name;

    @SerializedName("CountryISOCode")
    String countryIsoCode;

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }
}