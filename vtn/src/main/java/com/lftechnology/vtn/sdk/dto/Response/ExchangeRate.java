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
