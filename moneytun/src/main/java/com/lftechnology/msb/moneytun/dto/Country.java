package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

    @JsonProperty("CountryISOCode")
    String isoCode;

    @JsonProperty("CountName")
    String name;

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
}
