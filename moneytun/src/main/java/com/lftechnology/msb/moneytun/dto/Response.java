package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("Message")
    String message;

    @SerializedName("StatusCode")
    Integer statusCode;

    @SerializedName("Error")
    Boolean error;

    @SerializedName("Status")
    Integer status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return statusCode;
    }

    public void setCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
