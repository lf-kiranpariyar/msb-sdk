package com.lftechnology.msb.sdk.dto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stores Address Information.
 */
public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private Country country;
    private State state;

    private String street;
    private String postCode;


    public String getFullAddress() {
        return Stream.of(addressLine1, addressLine2).filter(it -> it != null).collect(Collectors.joining(" "));
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
