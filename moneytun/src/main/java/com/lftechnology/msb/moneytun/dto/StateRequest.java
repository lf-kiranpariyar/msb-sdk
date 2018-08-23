package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateRequest {

    @JsonProperty("CountryISOCode")
    String countryISOCode;


    public StateRequest(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }
}
