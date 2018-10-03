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

}
