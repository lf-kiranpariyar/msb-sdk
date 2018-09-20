package com.lftechnology.vtn.sdk.exception;


public class ApiException extends RuntimeException {
    public ApiException() {
        super("Something went wrong");
    }

    public ApiException(String message) {
        super(message);
    }
}