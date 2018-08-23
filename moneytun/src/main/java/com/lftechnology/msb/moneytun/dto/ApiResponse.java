package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ApiResponse<T> extends  Response{

    @JsonAlias({"RateDetail", "TransactionDetail"})
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
