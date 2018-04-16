package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class Bank {

    @SerializedName("BankName")
    String name;

    @SerializedName("BankCode")
    String code;

    @SerializedName("PayeeCode")
    String payeeCode;

    @SerializedName("SubPayeeAgencyName")
    String subPayeeAgencyName;

    @SerializedName("DestinationCountryISOCode")
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bank{");
        sb.append("name='").append(name).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", payeeCode='").append(payeeCode).append('\'');
        sb.append(", subPayeeAgencyName='").append(subPayeeAgencyName).append('\'');
        sb.append(", countryISOCode='").append(countryISOCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
