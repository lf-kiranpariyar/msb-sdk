package com.lftechnology.vtn.sdk.dto;

import lombok.Data;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@XmlRootElement(name="ExchangeRates")
public class ExchangeRate extends Response{
    @XmlElement(name="RateDate")
    private LocalDateTime rateDate;

    private Currency currency;

    @XmlElement(name="BuyingRate")
    private BigDecimal buyingRate;

    @XmlElement(name="CentralRate")
    private BigDecimal centralRate;

    @XmlElement(name="SellingRate")
    private BigDecimal sellingRate;

}
