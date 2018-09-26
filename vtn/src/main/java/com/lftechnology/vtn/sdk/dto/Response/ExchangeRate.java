package com.lftechnology.vtn.sdk.dto.Response;




import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@XmlRootElement(name = "ExchangeRates")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExchangeRate {

    public LocalDateTime getRateDate() {
        return rateDate;
    }

    public void setRateDate(LocalDateTime rateDate) {
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

    @XmlElement(name = "RateDate")
    private LocalDateTime rateDate;

    @XmlElement(name = "CurrencyName")
    private String currencyName;

    @XmlElement(name = "CurrencyCode")
    private String currencyCode;

    @XmlElement(name = "BuyingRate")
    private BigDecimal buyingRate;

    @XmlElement(name = "CentralRate")
    private BigDecimal centralRate;

    @XmlElement(name = "SellingRate")
    private BigDecimal sellingRate;

}
