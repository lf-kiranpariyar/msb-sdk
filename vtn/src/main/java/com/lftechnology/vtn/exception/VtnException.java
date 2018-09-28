package com.lftechnology.vtn.exception;

public class VtnException extends RuntimeException {
    private String message;
    private String code;


    public VtnException(String message) {
        super(message);
    }

    public VtnException(String message, String code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
