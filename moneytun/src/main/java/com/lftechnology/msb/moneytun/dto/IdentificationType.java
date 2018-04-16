package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class IdentificationType {

    @SerializedName("IdType")
    String type;

    @SerializedName("SourceCountryISOCode")
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
