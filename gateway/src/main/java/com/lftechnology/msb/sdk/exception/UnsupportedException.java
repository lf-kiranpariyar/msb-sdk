package com.lftechnology.msb.sdk.exception;

public class UnsupportedException extends RuntimeException {
    public UnsupportedException() {
        super("Operation Not Supported By the Target Resource.");
    }

    public UnsupportedException(String message) {
        super(message);
    }
}
