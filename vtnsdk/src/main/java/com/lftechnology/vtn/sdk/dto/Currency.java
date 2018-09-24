package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name="Currency")
public class Currency {
    @XmlElement(name="CurrencyCode")
    private String currencyCode;
    @XmlElement(name="CurrencyName")
    private String name;
    private String symbol;

}
