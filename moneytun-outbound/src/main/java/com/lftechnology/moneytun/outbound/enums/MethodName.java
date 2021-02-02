package com.lftechnology.moneytun.outbound.enums;

public enum MethodName {
    ALL("all"), CONFIRMATION("confirmation"), CANCEL("cancel"), PAY("PayTransaction");

    private String name;

    private MethodName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
