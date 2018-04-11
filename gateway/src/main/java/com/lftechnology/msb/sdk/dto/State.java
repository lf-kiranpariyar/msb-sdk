package com.lftechnology.msb.sdk.dto;

public class State {

    String name;
    String twoCharISOCode;
    String threeCharISOCode;
    String countryName;

    public State(String name, String twoCharISOCode, String threeCharISOCode, String countryName) {
        this.name = name;
        this.twoCharISOCode = twoCharISOCode;
        this.threeCharISOCode = threeCharISOCode;
        this.countryName = countryName;
    }

    public State() {
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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
