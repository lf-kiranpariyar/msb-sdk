package com.lftechnology.gmt.dto;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class BankInfo {

    private String paymentType;
    private String payoutCountry;
    private String payerCode;

    public String getPayerCode() {
        return payerCode;
    }

    public void setPayerCode(String payerCode) {
        this.payerCode = payerCode;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPayoutCountry() {
        return payoutCountry;
    }

    public void setPayoutCountry(String payoutCountry) {
        this.payoutCountry = payoutCountry;
    }
}
