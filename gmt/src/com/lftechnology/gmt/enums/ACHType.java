package com.lftechnology.gmt.enums;

public enum ACHType {

    SAVINGS("SV"), CHECKING("CHK");

    private String value;

    ACHType(String value) {
        this.value = value;
    }

    public String getType() {
        return value;
    }
}
