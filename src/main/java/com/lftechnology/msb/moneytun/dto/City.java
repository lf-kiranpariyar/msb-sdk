package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

    @JsonProperty("CountryISOCode")
    String countryISOCode;

    @JsonProperty("StateISOCode")
    String stateIsoCode;

    @JsonProperty("StateName")
    String stateName;

    @JsonProperty("CityName")
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
