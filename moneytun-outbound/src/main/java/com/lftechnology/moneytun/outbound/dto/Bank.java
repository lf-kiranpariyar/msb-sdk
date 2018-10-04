package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bank {

    @JsonProperty("Bank")
    private String bankName;

    @JsonProperty("BankAccount")
    private String bankAccount;

    @JsonProperty("BankCode")
    private String bankCode;
    @JsonProperty("BankBranch")
    private String bankBranch;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bank{");
        sb.append("bankName='").append(bankName).append('\'');
        sb.append(", bankAccount='").append(bankAccount).append('\'');
        sb.append(", bankCode='").append(bankCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
