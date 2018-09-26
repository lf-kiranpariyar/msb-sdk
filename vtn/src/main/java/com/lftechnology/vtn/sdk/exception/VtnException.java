package com.lftechnology.vtn.sdk.exception;

public class VtnException extends RuntimeException {
    private String message;
    private String code;


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


    public VtnException(String message){
        super(message);
    }
    public VtnException(String message, String code) {
        super(message);
        this.code = code;
    }





}
