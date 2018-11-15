package com.lftechnology.vtn.dto.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "FxRatesResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class FxRateResponse extends Response {

    @XmlElement(name = "ExchangeRates")
    private ExchangeRate exchangeRate;

    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }


    public void setExchangeRate(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FxRateResponse{");
        sb.append("exchangeRate=").append(exchangeRate);
        sb.append('}');
        return sb.toString();
    }
}
