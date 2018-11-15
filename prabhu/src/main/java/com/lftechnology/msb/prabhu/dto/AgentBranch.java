package com.lftechnology.msb.prabhu.dto;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class AgentBranch {

    private String locationId;
    private String branch;
    private String address;
    private String city;
    private String currency;
    private String bankId;
    private String bankBranchId;
    private String bankBranchState;
    private String agentCode;

    public AgentBranch(String locationId, String branch, String address, String city, String currency, String bankId, String bankBranchId,
                       String bankBranchState, String agentCode) {
        this.locationId = locationId;
        this.branch = branch;
        this.address = address;
        this.city = city;
        this.currency = currency;
        this.bankId = bankId;
        this.bankBranchId = bankBranchId;
        this.bankBranchState = bankBranchState;
        this.agentCode = agentCode;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankBranchId() {
        return bankBranchId;
    }

    public void setBankBranchId(String bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    public String getBankBranchState() {
        return bankBranchState;
    }

    public void setBankBranchState(String bankBranchState) {
        this.bankBranchState = bankBranchState;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }
}
