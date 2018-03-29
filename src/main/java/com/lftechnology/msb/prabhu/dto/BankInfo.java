package com.lftechnology.msb.prabhu.dto;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class BankInfo {

    private String paymentType;
    private String payoutCountry;
    private String bankName;
    private String branchState;

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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchState() {
        return branchState;
    }

    public void setBranchState(String branchState) {
        this.branchState = branchState;
    }
}
