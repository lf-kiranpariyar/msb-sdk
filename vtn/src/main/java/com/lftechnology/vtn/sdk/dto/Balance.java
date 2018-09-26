package com.lftechnology.vtn.sdk.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="RemittanceBalanceResponse")

public class Balance {
    private String responseMessage;
    private String responseCode;
    private  String accountBalance;


    public String getResponseMessage() {
        return responseMessage;
    }
    @XmlElement(name = "ResponseMessage")
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }


    public String getResponseCode() {
        return responseCode;
    }
    @XmlElement(name = "ResponseCode")
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getAccountBalance() {
        return accountBalance;
    }
    @XmlElement(name = "AccountBalance")
    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }
}
