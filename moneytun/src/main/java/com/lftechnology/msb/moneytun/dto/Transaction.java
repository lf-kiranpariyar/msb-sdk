package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.math.BigDecimal;

public class Transaction {

    @JsonProperty("AgentId")
    private String agentId;

    @JsonProperty("DeliveryMethod")
    private String deliveryMethod;

    @JsonProperty("Employee")
    private Employee employee;

    @JsonUnwrapped
    private Country country;

    @JsonProperty("SendingCurrencyCode")
    private String sourceCurrencyCode;

    @JsonProperty("PaymentMethod")
    private String paymentMethod;

    @JsonUnwrapped
    private Sender sender;

    @JsonUnwrapped
    private Document document;

    @JsonUnwrapped
    private Receiver receiver;

    @JsonProperty("ConversionRate")
    private BigDecimal exchangeRate;

    @JsonProperty("SendAmount")
    private BigDecimal amount;

    @JsonProperty("ReceivedAmount")
    private BigDecimal recieverAmount;

    @JsonProperty("PointofContact")
    private Long pointOfContactId;

    @JsonProperty("Bank")
    private String bankName;

    @JsonProperty("BankBranch")
    private String bankBranch;

    @JsonProperty("BankAccount")
    private String bankAccount;

    @JsonProperty("BankAccountType")
    private String accountType;

    @JsonProperty("ReceivingCurrencyCode")
    private String receiverCurrencyCode;

    private Transaction(Builder builder) {
        setAgentId(builder.agentId);
        setDeliveryMethod(builder.deliveryMethod);
        setEmployee(builder.employee);
        setSourceCurrencyCode(builder.sourceCurrencyCode);
        setPaymentMethod(builder.paymentMethod);
        setSender(builder.sender);
        setDocument(builder.document);
        setReceiver(builder.receiver);
        setExchangeRate(builder.exchangeRate);
        setAmount(builder.amount);
        setRecieverAmount(builder.recieverAmount);
        setPointOfContactId(builder.pointOfContactId);
        setBankName(builder.bankName);
        setBankBranch(builder.bankBranch);
        setBankAccount(builder.bankAccount);
        setAccountType(builder.accountType);
        setReceiverCurrencyCode(builder.receiverCurrencyCode);
    }

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

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Long getPointOfContactId() {
        return pointOfContactId;
    }

    public void setPointOfContactId(Long pointOfContactId) {
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

    public static final class Builder {
        private String agentId;
        private String deliveryMethod;
        private Employee employee;
        private String sourceCurrencyCode;
        private String paymentMethod;
        private Sender sender;
        private Document document;
        private Receiver receiver;
        private BigDecimal exchangeRate;
        private BigDecimal amount;
        private BigDecimal recieverAmount;
        private Long pointOfContactId;
        private String bankName;
        private String bankBranch;
        private String bankAccount;
        private String accountType;
        private String receiverCurrencyCode;

        public Builder() {
        }

        public Builder agentId(String val) {
            agentId = val;
            return this;
        }

        public Builder deliveryMethod(String val) {
            deliveryMethod = val;
            return this;
        }

        public Builder employee(Employee val) {
            employee = val;
            return this;
        }

        public Builder sourceCurrencyCode(String val) {
            sourceCurrencyCode = val;
            return this;
        }

        public Builder paymentMethod(String val) {
            paymentMethod = val;
            return this;
        }

        public Builder transactionAmount(BigDecimal amount, BigDecimal exchangeRate, BigDecimal recieverAmount) {
            this.amount = amount;
            this.exchangeRate = exchangeRate;
            this.recieverAmount = recieverAmount;
            return this;
        }

        public Builder party(Sender sender, Receiver receiver, Document document) {
            this.sender = sender;
            this.receiver = receiver;
            this.document = document;
            return this;
        }

        public Builder pointOfContactId(Long val) {
            pointOfContactId = val;
            return this;
        }

        public Builder bankDetails(String bankName, String bankBranch, String bankAccount, String accountType) {
            this.bankName = bankName;
            this.bankBranch = bankBranch;
            this.bankAccount = bankAccount;
            this.accountType = accountType;
            return this;
        }

        public Builder receiverCurrencyCode(String val) {
            receiverCurrencyCode = val;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}
