package com.lftechnology.vtn.sdk.dto.Response;



import javax.xml.bind.annotation.*;


@XmlRootElement(name="FxRatesResponse")

public class FxRateResponseDTO extends ResponseDTO {

    @XmlElement(name = "ExchangeRates")
    private ExchangeRate exchangeRate;

    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    @Override
    public String toString() {
        return "FxRateResponseDTO{" +
                "exchangeRate=" + exchangeRate +
                '}';
    }

    public void setExchangeRate(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


}
