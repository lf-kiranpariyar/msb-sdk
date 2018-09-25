package com.lftechnology.vtn.sdk.dto.Request;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class FxRateRequestDTO {

    @XmlElement(name = "CurrencyCode")
    private String currencyCode;

}
