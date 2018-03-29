package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.math.BigDecimal;

public class Transaction {

    @JsonProperty("AgentId")
    String agentId;

    @JsonProperty("DeliveryMethod")
    String deliveryMethod;

    @JsonProperty("Employee")
    Employee employee;

    @JsonProperty("SendingCurrencyCode")
    String sourceCurrencyCode;

    @JsonProperty("PaymentMethod")
    String paymentMethod;

    @JsonUnwrapped
    Sender sender;

    @JsonUnwrapped
    Document document;

    @JsonUnwrapped
    Reciever reciever;

    @JsonProperty("ConversionRate")
    BigDecimal exchangeRate;

    @JsonProperty("SendAmount")
    BigDecimal amount;

    @JsonProperty("ReceivedAmount")
    BigDecimal recieverAmount;

    @JsonProperty("PointofContact")
    Integer pointOfContactId;

    @JsonProperty("Bank")
    String bankName;

    @JsonProperty("BankBranch")
    String bankBranch;

    @JsonProperty("BankAccount")
    String bankAccount;

    @JsonProperty("BankAccountType")
    String accountType;

    @JsonProperty("ReceivingCurrencyCode")
    String receiverCurrencyCode;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    public void setSourceCurrencyCode(String sourceCurrencyCode) {
        this.sourceCurrencyCode = sourceCurrencyCode;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Reciever getReciever() {
        return reciever;
    }

    public void setReciever(Reciever reciever) {
        this.reciever = reciever;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Integer getPointOfContactId() {
        return pointOfContactId;
    }

    public void setPointOfContactId(Integer pointOfContactId) {
        this.pointOfContactId = pointOfContactId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getReceiverCurrencyCode() {
        return receiverCurrencyCode;
    }

    public void setReceiverCurrencyCode(String receiverCurrencyCode) {
        this.receiverCurrencyCode = receiverCurrencyCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRecieverAmount() {
        return recieverAmount;
    }

    public void setRecieverAmount(BigDecimal recieverAmount) {
        this.recieverAmount = recieverAmount;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}
