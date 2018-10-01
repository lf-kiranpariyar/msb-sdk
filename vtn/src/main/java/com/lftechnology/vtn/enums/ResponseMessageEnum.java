package com.lftechnology.vtn.enums;

public enum ResponseMessageEnum {
    R00("R00", "Success"), R26("R26", "Invalid Ip");

    private final String key;
    private final String  value;

    ResponseMessageEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
