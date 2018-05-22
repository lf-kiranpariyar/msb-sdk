package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;


/**
 * Request Format :
 *
 * <pre>
 *     {
     "SenderAgencyCode" : "machnet",
     "SourceCurrencyISoCode" : "usd",
     "DestinationCurrencyISoCode": "vnd",
     "PayeeCode": "trg",
     "SubPayer": "",
     "GroupId": "1636",
     "SellRate": 12.0000000000
 }
 *
 *
 * </pre>
 */
public class ExchangeRate {

    @JsonProperty("DestinationCurrencyISoCode")
    private String destinationCurrencyISOCode;

    @JsonProperty("PayeeCode")
    private String payeeCode;

    @JsonProperty("SourceCurrencyISoCode")
    private String sourceCurrencyISOCode;

    @JsonProperty("SenderAgencyCode")
    private String senderAgencyCode;

    @JsonProperty("SubPayer")
    private String subPayer = "";

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("SellRate")
    private BigDecimal sellRate;


    public String getDestinationCurrencyISOCode() {
        return destinationCurrencyISOCode;
    }

    public void setDestinationCurrencyISOCode(String destinationCurrencyISOCode) {
        this.destinationCurrencyISOCode = destinationCurrencyISOCode;
    }

    public String getPayeeCode() {
        return payeeCode;
    }

    public void setPayeeCode(String payeeCode) {
        this.payeeCode = payeeCode;
    }

    public String getSourceCurrencyISOCode() {
        return sourceCurrencyISOCode;
    }

    public void setSourceCurrencyISOCode(String sourceCurrencyISOCode) {
        this.sourceCurrencyISOCode = sourceCurrencyISOCode;
    }

    public String getSenderAgencyCode() {
        return senderAgencyCode;
    }

    public void setSenderAgencyCode(String senderAgencyCode) {
        this.senderAgencyCode = senderAgencyCode;
    }

    public String getSubPayer() {
        return subPayer;
    }

    public void setSubPayer(String subPayer) {
        this.subPayer = subPayer;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public BigDecimal getSellRate() {
        return sellRate;
    }

    public void setSellRate(BigDecimal sellRate) {
        this.sellRate = sellRate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ExchangeRate{");
        sb.append("destinationCurrencyISOCode='").append(destinationCurrencyISOCode).append('\'');
        sb.append(", payeeCode='").append(payeeCode).append('\'');
        sb.append(", sourceCurrencyISOCode='").append(sourceCurrencyISOCode).append('\'');
        sb.append(", senderAgencyCode='").append(senderAgencyCode).append('\'');
        sb.append(", subPayer='").append(subPayer).append('\'');
        sb.append(", groupId='").append(groupId).append('\'');
        sb.append(", sellRate=").append(sellRate);
        sb.append('}');
        return sb.toString();
    }
}
