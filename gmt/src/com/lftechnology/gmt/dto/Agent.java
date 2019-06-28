package com.lftechnology.gmt.dto;

import com.lftechnology.gmt.enums.PaymentMode;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class Agent {
    private String agent;
    private String code;
    private String payerName;
    private String payerCode;
    private List<PaymentMode> modes;

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerCode() {
        return payerCode;
    }

    public void setPayerCode(String payerCode) {
        this.payerCode = payerCode;
    }

    public List<PaymentMode> getModes() {
        return modes;
    }

    public void setModes(List<PaymentMode> modes) {
        this.modes = modes;
    }
}
