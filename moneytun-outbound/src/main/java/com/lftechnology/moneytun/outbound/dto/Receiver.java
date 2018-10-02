package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Receiver {

    @JsonProperty("ReceiverFirstName")
    private String receiverFirstName;
    @JsonProperty("ReceiverMiddleName")
    private String receiverMiddleName;
    @JsonProperty("ReceiverLastName")
    private String receiverLastName;
    @JsonProperty("ReceiverMotherMaidenName")
    private String receiverMotherMaidenName;
    @JsonProperty("ReceiverAddress")
    private String receiverAddress;
    @JsonProperty("ReceiverPhone")
    private String receiverPhone;
    @JsonProperty("ReceiverCity")
    private String receiverCity;
    @JsonProperty("ReceiverState")
    private String receiverState;
    @JsonProperty("ReceiverCountry")
    private String receiverCountry;
    @JsonProperty("ReceiverCode")
    private String receiverCode;

    public String getreceiverFirstName() {
        return receiverFirstName;
    }

    public void setreceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }

    public String getreceiverMiddleName() {
        return receiverMiddleName;
    }

    public void setreceiverMiddleName(String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
    }

    public String getreceiverLastName() {
        return receiverLastName;
    }

    public void setreceiverLastName(String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }

    public String getreceiverMotherMaidenName() {
        return receiverMotherMaidenName;
    }

    public void setreceiverMotherMaidenName(String receiverMotherMaidenName) {
        this.receiverMotherMaidenName = receiverMotherMaidenName;
    }

    public String getreceiverAddress() {
        return receiverAddress;
    }

    public void setreceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getreceiverPhone() {
        return receiverPhone;
    }

    public void setreceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getreceiverCity() {
        return receiverCity;
    }

    public void setreceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getreceiverState() {
        return receiverState;
    }

    public void setreceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getreceiverCountry() {
        return receiverCountry;
    }

    public void setreceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getreceiverCode() {
        return receiverCode;
    }

    public void setreceiverCode(String receiverCode) {
        this.receiverCode = receiverCode;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("receiver{");
        sb.append("receiverFirstName='").append(receiverFirstName).append('\'');
        sb.append(", receiverMiddleName='").append(receiverMiddleName).append('\'');
        sb.append(", receiverLastName='").append(receiverLastName).append('\'');
        sb.append(", receiverMotherMaidenName='").append(receiverMotherMaidenName).append('\'');
        sb.append(", receiverAddress='").append(receiverAddress).append('\'');
        sb.append(", receiverPhone='").append(receiverPhone).append('\'');
        sb.append(", receiverCity='").append(receiverCity).append('\'');
        sb.append(", receiverState='").append(receiverState).append('\'');
        sb.append(", receiverCountry='").append(receiverCountry).append('\'');
        sb.append(", receiverCode='").append(receiverCode).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
