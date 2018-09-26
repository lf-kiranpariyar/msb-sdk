package com.lftechnology.vtn.sdk.dto.Response;




import com.lftechnology.vtn.sdk.utils.BigDecimalAdapter;
import com.lftechnology.vtn.sdk.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;



@XmlAccessorType(XmlAccessType.FIELD)
public class ExchangeRate {

    @XmlElement(name = "RateDate")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate rateDate;

    @XmlElement(name = "CurrencyName")
    private String currencyName;

    @XmlElement(name = "CurrencyCode")
    private String currencyCode;

    @XmlElement(name = "BuyingRate")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal buyingRate;

    @XmlElement(name = "CentralRate")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal centralRate;

    @XmlElement(name = "SellingRate")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
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
        return "ExchangeRate{" +
                "rateDate=" + rateDate +
                ", currencyName='" + currencyName + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", buyingRate=" + buyingRate +
                ", centralRate=" + centralRate +
                ", sellingRate=" + sellingRate +
                '}';
    }
}
