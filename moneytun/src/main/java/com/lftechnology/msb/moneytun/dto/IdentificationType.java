package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdentificationType {

    @JsonProperty("IdType")
    String type;

    @JsonProperty("SourceCountryISOCode")
    String sourceCountryISOCode;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSourceCountryISOCode() {
        return sourceCountryISOCode;
    }

    public void setSourceCountryISOCode(String sourceCountryISOCode) {
        this.sourceCountryISOCode = sourceCountryISOCode;
    }
}
