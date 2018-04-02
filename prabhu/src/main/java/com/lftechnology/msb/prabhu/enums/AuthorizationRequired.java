package com.lftechnology.msb.prabhu.enums;

public enum AuthorizationRequired {
    YES("y"), NO("n");

    private String value;

    AuthorizationRequired(String value) {
        this.value = value;
    }
}
