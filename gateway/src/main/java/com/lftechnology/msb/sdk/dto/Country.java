package com.lftechnology.msb.sdk.dto;

public class Country {

    String name;
    String twoCharISOCode;
    String threeCharISOCode;
    String currencyCode;

    public Country(String name, String twoCharISOCode, String threeCharISOCode) {
        this.name = name;
        this.twoCharISOCode = twoCharISOCode;
        this.threeCharISOCode = threeCharISOCode;
    }

    public Country(String name, String twoCharISOCode, String threeCharISOCode, String currencyCode) {
        this.name = name;
        this.twoCharISOCode = twoCharISOCode;
        this.threeCharISOCode = threeCharISOCode;
        this.currencyCode = currencyCode;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTwoCharISOCode() {
        return twoCharISOCode;
    }

    public void setTwoCharISOCode(String twoCharISOCode) {
        this.twoCharISOCode = twoCharISOCode;
    }

    public String getThreeCharISOCode() {
        return threeCharISOCode;
    }

    public void setThreeCharISOCode(String threeCharISOCode) {
        this.threeCharISOCode = threeCharISOCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
