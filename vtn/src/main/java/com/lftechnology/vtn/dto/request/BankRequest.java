package com.lftechnology.vtn.dto.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class BankRequest {

    @JsonProperty(value = "BankAccountNumber")
    private String bankAccountNumber;

    @JsonProperty(value = "BankAccountName")
    private String bankAccountName;

    @JsonProperty(value = "BankName")
    private String bankName;

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankRequest{");
        sb.append("bankAccountNumber='").append(bankAccountNumber).append('\'');
        sb.append(", bankAccountName='").append(bankAccountName).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

