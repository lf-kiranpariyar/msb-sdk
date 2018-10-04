package com.lftechnology.moneytun.outbound.enums;

public enum MethodName {
    ALL("all"),CONFIRMATION("confirmation");

    private String name;

    private MethodName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
