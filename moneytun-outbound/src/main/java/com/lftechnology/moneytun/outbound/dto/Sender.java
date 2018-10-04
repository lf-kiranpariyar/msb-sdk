package com.lftechnology.moneytun.outbound.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author shankar ghimire
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sender {
    @JsonProperty("SenderFirstName")
    private String senderFirstName;

    @JsonProperty("SenderMiddleName")
    private String senderMiddleName;

    @JsonProperty("SenderLastName")
    private String senderLastName;

    @JsonProperty("SENDERMOTHERMAIDENNAME")
    private String senderMotherMaidenName;

    @JsonProperty("SenderAddress")
    private String senderAddress;

    @JsonProperty("SenderPhone")
    private String senderPhone;

    @JsonProperty("SenderCity")
    private String senderCity;

    @JsonProperty("SenderState")
    private String senderState;

    @JsonProperty("SenderCountry")
    private String senderCountry;

    @JsonProperty("SenderCode")
    private String senderCode;

    public String getSenderFirstName() {
        return senderFirstName;
    }

    public void setSenderFirstName(String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }

    public String getSenderMiddleName() {
        return senderMiddleName;
    }

    public void setSenderMiddleName(String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
    }

    public String getSenderLastName() {
        return senderLastName;
    }

    public void setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
    }

    public String getSenderMotherMaidenName() {
        return senderMotherMaidenName;
    }

    public void setSenderMotherMaidenName(String senderMotherMaidenName) {
        this.senderMotherMaidenName = senderMotherMaidenName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderState() {
        return senderState;
    }

    public void setSenderState(String senderState) {
        this.senderState = senderState;
    }

    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    public String getSenderCode() {
        return senderCode;
    }

    public void setSenderCode(String senderCode) {
        this.senderCode = senderCode;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sender{");
        sb.append("senderFirstName='").append(senderFirstName).append('\'');
        sb.append(", senderMiddleName='").append(senderMiddleName).append('\'');
        sb.append(", senderLastName='").append(senderLastName).append('\'');
        sb.append(", senderMotherMaidenName='").append(senderMotherMaidenName).append('\'');
        sb.append(", senderAddress='").append(senderAddress).append('\'');
        sb.append(", senderPhone='").append(senderPhone).append('\'');
        sb.append(", senderCity='").append(senderCity).append('\'');
        sb.append(", senderState='").append(senderState).append('\'');
        sb.append(", senderCountry='").append(senderCountry).append('\'');
        sb.append(", senderCode='").append(senderCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
