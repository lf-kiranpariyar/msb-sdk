package com.lftechnology.vtn.sdk.dto.Response;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FxRatesResponse")
@Data
public class FxRateQueryDTO extends ResponseDTO {

    @XmlElement
    private ExchangeRate exchangeRate;
}
