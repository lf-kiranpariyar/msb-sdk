package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payout {

    @JsonProperty("PayoutLocationName")
    private String payoutLocationName;
    @JsonProperty("PayoutLocationAddress")
    private String payoutLocationAddress;
    @JsonProperty("PayoutLocationZip")
    private String payoutLocationZip;
    @JsonProperty("PayoutLocationPhone")
    private String payoutLocationPhone;
    @JsonProperty("PayoutLocationCity")
    private String payoutLocationCity;
    @JsonProperty("PayoutLocationState")
    private String payoutLocationState;
    @JsonProperty("PayoutLocationCountry")
    private String payoutLocationCountry;

    public String getPayoutLocationName() {
        return payoutLocationName;
    }

    public void setPayoutLocationName(String payoutLocationName) {
        this.payoutLocationName = payoutLocationName;
    }

    public String getPayoutLocationAddress() {
        return payoutLocationAddress;
    }

    public void setPayoutLocationAddress(String payoutLocationAddress) {
        this.payoutLocationAddress = payoutLocationAddress;
    }

    public String getPayoutLocationZip() {
        return payoutLocationZip;
    }

    public void setPayoutLocationZip(String payoutLocationZip) {
        this.payoutLocationZip = payoutLocationZip;
    }

    public String getPayoutLocationPhone() {
        return payoutLocationPhone;
    }

    public void setPayoutLocationPhone(String payoutLocationPhone) {
        this.payoutLocationPhone = payoutLocationPhone;
    }

    public String getPayoutLocationCity() {
        return payoutLocationCity;
    }

    public void setPayoutLocationCity(String payoutLocationCity) {
        this.payoutLocationCity = payoutLocationCity;
    }

    public String getPayoutLocationState() {
        return payoutLocationState;
    }

    public void setPayoutLocationState(String payoutLocationState) {
        this.payoutLocationState = payoutLocationState;
    }

    public String getPayoutLocationCountry() {
        return payoutLocationCountry;
    }

    public void setPayoutLocationCountry(String payoutLocationCountry) {
        this.payoutLocationCountry = payoutLocationCountry;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Payout{");
        sb.append("payoutLocationName='").append(payoutLocationName).append('\'');
        sb.append(", payoutLocationAddress='").append(payoutLocationAddress).append('\'');
        sb.append(", payoutLocationZip='").append(payoutLocationZip).append('\'');
        sb.append(", payoutLocationPhone='").append(payoutLocationPhone).append('\'');
        sb.append(", payoutLocationCity='").append(payoutLocationCity).append('\'');
        sb.append(", payoutLocationState='").append(payoutLocationState).append('\'');
        sb.append(", payoutLocationCountry='").append(payoutLocationCountry).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
