package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PointOfContactRequest {

    @JsonProperty("CountryISOCode")
    private String countryCode;

    @JsonProperty("Payee")
    private String payeeCode;

    public PointOfContactRequest(String countryCode, String payeeCode) {
        this.countryCode = countryCode;
        this.payeeCode = payeeCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPayeeCode() {
        return payeeCode;
    }

    public void setPayeeCode(String payeeCode) {
        this.payeeCode = payeeCode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PointOfContactRequest{");
        sb.append("countryCode='").append(countryCode).append('\'');
        sb.append(", payeeCode='").append(payeeCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
