package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.moneytun.service.WhiteWingResource;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class Credential {

    private String mtoName;
    private String mtoId;

    private String accessCode;
    private String secretCode;

    private String employeeId;
    private String employeePassword;

    private String payerId;

    public String getMtoName() {
        return mtoName;
    }

    public void setMtoName(String mtoName) {
        this.mtoName = mtoName;
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
}
