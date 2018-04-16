package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class Token {

    @SerializedName("Message")
    String message;

    @SerializedName("Code")
    Integer code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Token{");
        sb.append("message='").append(message).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
