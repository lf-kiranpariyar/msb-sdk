package com.lftechnology.msb.sdk.dto;

public class City {

    private String name;

    private String countryISOCode;

    private String stateISOCode;

    private String state;

    public City(String name, String countryISOCode, String stateISOCode, String state) {
        this.name = name;
        this.countryISOCode = countryISOCode;
        this.stateISOCode = stateISOCode;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public String getStateISOCode() {
        return stateISOCode;
    }

    public void setStateISOCode(String stateISOCode) {
        this.stateISOCode = stateISOCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
