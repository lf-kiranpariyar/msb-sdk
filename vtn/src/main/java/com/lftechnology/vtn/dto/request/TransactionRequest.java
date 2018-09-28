package com.lftechnology.vtn.dto.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionRequest extends Credential {

    @JsonProperty(value = "TransactionId")
    private String transactionId;

    @JsonProperty(value = "TransferDate")
    private LocalDate transferDate;

    @JsonProperty(value = "TransferType")
    private Integer transferType;

    @JsonProperty(value = "SenderEmail")
    private String senderEmail;

    @JsonProperty(value = "SenderPhone")
    private String senderPhone;

    @JsonProperty(value = "SenderFirstName")
    private String senderFirstName;

    @JsonProperty(value = "SenderLastName")
    private String senderLastName;

    @JsonProperty(value = "SenderCountry")
    private String senderCountry;

    @JsonProperty(value = "ReceiverEmail")
    private String receiverEmail;

    @JsonProperty(value = "ReceiverPhone")
    private String receiverPhone;

    @JsonProperty(value = "ReceiverFirstName")
    private String receiverFirstName;

    @JsonProperty(value = "ReceiverLastName")
    private String getReceiverLastName;

    @JsonProperty(value = "ReceiverCountry")
    private String receiverCountry;

    @JsonProperty(value = "CurrencyCode")
    private String currencyCode;

    @JsonProperty(value = "AmountInSenderCountry")
    private BigDecimal ammountInSenderCountry;

    @JsonProperty(value = "AmmountInNaira")
    private BigDecimal ammountInNaira;

    @JsonProperty(value = "FeeInSenderCountry")
    private BigDecimal feeInSenderCountry;

    @JsonProperty(value = "FeeInNaira")
    private BigDecimal feeInNaira;

    @JsonProperty(value = "BankAccountNumber")
    private String accountNumber;

    @JsonProperty(value = "BankAccountName")
    private String bankAccountName;

    @JsonProperty(value = "BankName")
    private String bankName;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderFirstName() {
        return senderFirstName;
    }

    public void setSenderFirstName(String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }

    public String getSenderLastName() {
        return senderLastName;
    }

    public void setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
    }

    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    public void setReceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }

    public String getGetReceiverLastName() {
        return getReceiverLastName;
    }

    public void setGetReceiverLastName(String getReceiverLastName) {
        this.getReceiverLastName = getReceiverLastName;
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getAmmountInSenderCountry() {
        return ammountInSenderCountry;
    }

    public void setAmmountInSenderCountry(BigDecimal ammountInSenderCountry) {
        this.ammountInSenderCountry = ammountInSenderCountry;
    }

    public BigDecimal getAmmountInNaira() {
        return ammountInNaira;
    }

    public void setAmmountInNaira(BigDecimal ammountInNaira) {
        this.ammountInNaira = ammountInNaira;
    }

    public BigDecimal getFeeInSenderCountry() {
        return feeInSenderCountry;
    }

    public void setFeeInSenderCountry(BigDecimal feeInSenderCountry) {
        this.feeInSenderCountry = feeInSenderCountry;
    }

    public BigDecimal getFeeInNaira() {
        return feeInNaira;
    }

    public void setFeeInNaira(BigDecimal feeInNaira) {
        this.feeInNaira = feeInNaira;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
        return "TransactionRequest{" +
                "transactionId='" + transactionId + '\'' +
                ", transferDate=" + transferDate +
                ", transferType=" + transferType +
                ", senderEmail='" + senderEmail + '\'' +
                ", senderPhone='" + senderPhone + '\'' +
                ", senderFirstName='" + senderFirstName + '\'' +
                ", senderLastName='" + senderLastName + '\'' +
                ", senderCountry='" + senderCountry + '\'' +
                ", receiverEmail='" + receiverEmail + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", receiverFirstName='" + receiverFirstName + '\'' +
                ", getReceiverLastName='" + getReceiverLastName + '\'' +
                ", receiverCountry='" + receiverCountry + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", ammountInSenderCountry=" + ammountInSenderCountry +
                ", ammountInNaira=" + ammountInNaira +
                ", feeInSenderCountry=" + feeInSenderCountry +
                ", feeInNaira=" + feeInNaira +
                ", accountNumber='" + accountNumber + '\'' +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
