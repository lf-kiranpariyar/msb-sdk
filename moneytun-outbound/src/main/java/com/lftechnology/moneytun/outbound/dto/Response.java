package com.lftechnology.moneytun.outbound.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty("Code")
    private Integer code;
    @JsonProperty("Message")
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("code='").append(code).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
