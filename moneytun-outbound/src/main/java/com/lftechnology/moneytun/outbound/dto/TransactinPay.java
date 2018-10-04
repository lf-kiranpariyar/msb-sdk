package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class TransactinPay {
    @JsonUnwrapped
    private OutboundResponse outboundResponse;
    @JsonProperty("Detail")
    private String detail;

    public OutboundResponse getOutboundResponse() {
        return outboundResponse;
    }

    public void setOutboundResponse(OutboundResponse outboundResponse) {
        this.outboundResponse = outboundResponse;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransactinPay{");
        sb.append("outboundResponse=").append(outboundResponse);
        sb.append(", detail='").append(detail).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
