package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("CurrencyISOCode")
    String code;

    @SerializedName("CurrencyName")
    String name;

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
}
