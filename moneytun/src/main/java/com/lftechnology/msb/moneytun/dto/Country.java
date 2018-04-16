package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("CountryISOCode")
    String isoCode;

    @SerializedName("CountName")
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
