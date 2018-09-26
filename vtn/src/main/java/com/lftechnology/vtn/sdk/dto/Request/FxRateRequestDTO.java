package com.lftechnology.vtn.sdk.dto.Request;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class FxRateRequestDTO extends Credentials{

    @XmlElement(name = "CurrencyCode")
    private String currencyCode;

}
