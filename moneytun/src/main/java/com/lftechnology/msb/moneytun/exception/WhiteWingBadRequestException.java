package com.lftechnology.msb.moneytun.exception;

public class WhiteWingBadRequestException extends RuntimeException {

    private String message;
    private Integer code;
    private Exception exception;

    public WhiteWingBadRequestException(String message) {
        super(message);
    }

    public WhiteWingBadRequestException(String message, Integer code) {
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


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
