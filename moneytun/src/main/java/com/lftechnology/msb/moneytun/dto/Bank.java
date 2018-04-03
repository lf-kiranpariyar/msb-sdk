package com.lftechnology.msb.moneytun.dto;

import javax.ws.rs.QueryParam;

public class Bank {

    @QueryParam("BankName")
    String name;

    @QueryParam("BankCode")
    String code;

    @QueryParam("PayeeCode")
    String payeeCode;

    @QueryParam("SubPayeeAgencyName")
    String subPayeeAgencyName;

    @QueryParam("DestinationCountryISOCode")
    String countryISOCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPayeeCode() {
        return payeeCode;
    }

    public void setPayeeCode(String payeeCode) {
        this.payeeCode = payeeCode;
    }

    public String getSubPayeeAgencyName() {
        return subPayeeAgencyName;
    }

    public void setSubPayeeAgencyName(String subPayeeAgencyName) {
        this.subPayeeAgencyName = subPayeeAgencyName;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }
}
