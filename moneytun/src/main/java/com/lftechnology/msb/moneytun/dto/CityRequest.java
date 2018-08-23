package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityRequest {

    @JsonProperty("CountryISOCode")
    String countryISOCode;

    @JsonProperty("StateISOCode")
    String stateISOCode;

    @JsonProperty("StateName")
    String stateName;

    public CityRequest(String countryISOCode, String stateISOCode, String stateName) {
        this.countryISOCode = countryISOCode;
        this.stateISOCode = stateISOCode;
        this.stateName = stateName;
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
}
