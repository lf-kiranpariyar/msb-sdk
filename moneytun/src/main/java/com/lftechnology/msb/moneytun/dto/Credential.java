package com.lftechnology.msb.moneytun.dto;

import java.util.List;
import java.util.Map;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class Credential {

    private String name;
    private String mtoId;

    private String accessCode;
    private String secretCode;

    private String employeeId;
    private String employeePassword;

    private String payerId;
    private String groupId;
    private Map<String, List<String>> payerDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMtoId() {
        return mtoId;
    }

    public void setMtoId(String mtoId) {
        this.mtoId = mtoId;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public String getAuthenticationDetail(){
        return this.accessCode.concat(":").concat(this.secretCode);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Map<String, List<String>> getPayerDetails() {
        return payerDetails;
    }

    public void setPayerDetails(Map<String, List<String>> payerDetails) {
        this.payerDetails = payerDetails;
    }
}
