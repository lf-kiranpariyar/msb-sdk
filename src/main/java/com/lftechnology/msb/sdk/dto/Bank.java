package com.lftechnology.msb.sdk.dto;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private String referenceId;
    private String name;
    private String accountNumber;
    private String accountHolderName;
    private Branch branch;
    private Map<String, Object> metadata = new HashMap<>();

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
