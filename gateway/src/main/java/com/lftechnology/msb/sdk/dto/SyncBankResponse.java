package com.lftechnology.msb.sdk.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SyncBankResponse {

    private String name;
    private Address address;
    private String referenceNumber;
    List<SyncBranchResponse> branchResponseList;
    private Map<String, Object> metadata = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public List<SyncBranchResponse> getBranchResponseList() {
        return branchResponseList;
    }

    public void setBranchResponseList(List<SyncBranchResponse> branchResponseList) {
        this.branchResponseList = branchResponseList;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
