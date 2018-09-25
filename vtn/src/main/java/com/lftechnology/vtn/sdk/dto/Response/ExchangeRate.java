package com.lftechnology.vtn.sdk.dto.Response;

import lombok.Data;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@XmlRootElement(name = "ExchangeRates")
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
