package com.lftechnology.msb.sdk.dto;

import java.math.BigDecimal;
import java.util.Map;

public class ExchangeRateRequest {

    private Country source;
    private Country destination;
    private BigDecimal amount;
    private Map<String, String> metadata;

    public Country getSource() {
        return source;
    }

    public void setSource(Country source) {
        this.source = source;
    }

    public Country getDestination() {
        return destination;
    }

    public void setDestination(Country destination) {
        this.destination = destination;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ExchangeRateRequest{");
        sb.append("source=").append(source);
        sb.append(", destination=").append(destination);
        sb.append(", amount=").append(amount);
        sb.append(", metadata=").append(metadata);
        sb.append('}');
        return sb.toString();
    }
}
