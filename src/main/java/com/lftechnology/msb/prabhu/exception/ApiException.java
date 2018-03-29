package com.lftechnology.msb.prabhu.exception;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class ApiException extends RuntimeException {
    public ApiException() {
        super("Something went wrong");
    }

    public ApiException(String message) {
        super(message);
    }
}