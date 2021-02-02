package com.lftechnology.msb.sdk.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExchangeRateResponse {
    private LocalDate rateDate;
    private String currencyName;
    private String currencyCode;
    private BigDecimal buyingRate;
    private BigDecimal centralRate;
    private BigDecimal sellingRate;

    public LocalDate getRateDate() {
        return rateDate;
    }

    public void setRateDate(LocalDate rateDate) {
        this.rateDate = rateDate;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getBuyingRate() {
        return buyingRate;
    }

    public void setBuyingRate(BigDecimal buyingRate) {
        this.buyingRate = buyingRate;
    }

    public BigDecimal getCentralRate() {
        return centralRate;
    }

    public void setCentralRate(BigDecimal centralRate) {
        this.centralRate = centralRate;
    }

    public BigDecimal getSellingRate() {
        return sellingRate;
    }

    public void setSellingRate(BigDecimal sellingRate) {
        this.sellingRate = sellingRate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExchangeRateResponse{");
        sb.append("rateDate=").append(rateDate);
        sb.append(", currencyName='").append(currencyName).append('\'');
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append(", buyingRate=").append(buyingRate);
        sb.append(", centralRate=").append(centralRate);
        sb.append(", sellingRate=").append(sellingRate);
        sb.append('}');
        return sb.toString();
    }
}
