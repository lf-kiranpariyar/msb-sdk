package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class ExchangeRateResponse  extends  Response{

    @SerializedName("Rate")
    BigDecimal rate;

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
