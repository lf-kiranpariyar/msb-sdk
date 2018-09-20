package com.lftechnology.vtn.sdk.dto;

public class Country {

    private String referenceId;
    private String name;
    private String threeCharCode;
    private String phoneCode;
    private String currency;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThreeCharCode() {
        return threeCharCode;
    }

    public void setThreeCharCode(String threeCharCode) {
        this.threeCharCode = threeCharCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString(){
        return "Country { referenceId : " + referenceId + " , " +
                "name : " + name + " , " +
                "threeCharCode : " + threeCharCode + " , " +
                "phoneCode : " + phoneCode + " , " +
                "currency : " + currency + " }";
    }

}
