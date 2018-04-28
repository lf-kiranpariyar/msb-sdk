package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CustomExchangeRate {

    @JsonProperty("SellRate")
    BigDecimal sellRate;

    @JsonProperty("PurchaseRate")
    BigDecimal purchaseRate;

    @JsonProperty("MidRate")
    BigDecimal midRate;

    @JsonProperty("GroupId")
    String groupId;

    public BigDecimal getSellRate() {
        return sellRate;
    }

    public void setSellRate(BigDecimal sellRate) {
        this.sellRate = sellRate;
    }

    public BigDecimal getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(BigDecimal purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public BigDecimal getMidRate() {
        return midRate;
    }

    public void setMidRate(BigDecimal midRate) {
        this.midRate = midRate;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CustomExchangeRate{");
        sb.append("sellRate=").append(sellRate);
        sb.append(", purchaseRate=").append(purchaseRate);
        sb.append(", midRate=").append(midRate);
        sb.append(", groupId='").append(groupId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
