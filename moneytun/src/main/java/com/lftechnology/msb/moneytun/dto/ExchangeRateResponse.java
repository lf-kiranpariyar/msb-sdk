package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ExchangeRateResponse  extends  Response{

    @JsonProperty("Rate")
    BigDecimal rate;

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
