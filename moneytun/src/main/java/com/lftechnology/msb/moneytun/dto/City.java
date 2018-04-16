package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("CountryISOCode")
    String countryISOCode;

    @SerializedName("StateISOCode")
    String stateIsoCode;

    @SerializedName("StateName")
    String stateName;

    @SerializedName("CityName")
    String name;

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public String getStateIsoCode() {
        return stateIsoCode;
    }

    public void setStateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
