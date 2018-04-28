package com.lftechnology.msb.moneytun.dto;

public class ApiResponse<T> extends  Response{

    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
