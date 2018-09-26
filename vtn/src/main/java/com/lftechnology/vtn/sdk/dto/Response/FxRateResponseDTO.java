package com.lftechnology.vtn.sdk.dto.Response;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FxRatesResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class FxRateResponseDTO extends ResponseDTO {

    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "FxRateResponseDTO{" +
                "exchangeRate=" + exchangeRate +
                '}';
    }

    @XmlElement
    private ExchangeRate exchangeRate;
}
