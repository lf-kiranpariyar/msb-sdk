package com.lftechnology.vtn.sdk.dto;

import lombok.Data;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Data
@XmlRootElement(name="ExchangeRates")
public class ExchangeRate extends Response{
    @XmlElement(name="RateDate")
    private DateTime rateDate;

    private Currency currency;

    @XmlElement(name="BuyingRate")
    private BigDecimal buyingRate;

    @XmlElement(name="CentralRate")
    private BigDecimal centralRate;

    @XmlElement(name="SellingRate")
    private BigDecimal sellingRate;

}
