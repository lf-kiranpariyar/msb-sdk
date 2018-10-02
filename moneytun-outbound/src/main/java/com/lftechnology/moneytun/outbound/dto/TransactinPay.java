package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class TransactinPay {
    @JsonUnwrapped
    private Response response;
    @JsonProperty("Detail")
    private String detail;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
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
        sb.append("response=").append(response);
        sb.append(", detail='").append(detail).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
