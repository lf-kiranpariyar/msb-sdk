package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transaction {

    @JsonUnwrapped
    private Token token;
    @JsonProperty("SendDate")
    private LocalDateTime sendDate;
    @JsonProperty("InoiceNumber")
    private String inoiceNumber;
    @JsonProperty("TransferNo")
    private String transferNo;
    @JsonUnwrapped
    private Sender sender;
    @JsonUnwrapped
    private Receiver receiver;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("CancelledDate")
    private LocalDate cancelledDate;
    @JsonProperty("PaidDate")
    private LocalDateTime paidDate;
    @JsonUnwrapped
    private Bank bank;
    @JsonProperty("AccountType")
    private String accountType;
    @JsonProperty("DeliverMethod")
    private String deliverMethod;
    @JsonProperty("SendAmount")
    private BigDecimal sendAmount;
    @JsonProperty("SendCurrencyName")
    private String sendCurrencyName;
    @JsonProperty("SendCurrencyCode")
    private String sendCurrencyCode;
    @JsonProperty("CustomerFee")
    private BigDecimal customerFee;
    @JsonProperty("ReceivedAmount")
    private BigDecimal receivedAmount;
    @JsonProperty("ReceivedCurrencyName")
    private  String receivedCurrencyName;
    @JsonProperty("ReceivedCurrencyCode")
    private String receivedCurrencyCode;
    @JsonUnwrapped
    private Payout payout;
    @JsonProperty("ConversionRate")
    private BigDecimal conversionRate;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public String getInoiceNumber() {
        return inoiceNumber;
    }

    public void setInoiceNumber(String inoiceNumber) {
        this.inoiceNumber = inoiceNumber;
    }

    public String getTransferNo() {
        return transferNo;
    }

    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCancelledDate() {
        return cancelledDate;
    }

    public void setCancelledDate(LocalDate cancelledDate) {
        this.cancelledDate = cancelledDate;
    }

    public LocalDateTime getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDateTime paidDate) {
        this.paidDate = paidDate;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getDeliverMethod() {
        return deliverMethod;
    }

    public void setDeliverMethod(String deliverMethod) {
        this.deliverMethod = deliverMethod;
    }

    public BigDecimal getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(BigDecimal sendAmount) {
        this.sendAmount = sendAmount;
    }

    public String getSendCurrencyName() {
        return sendCurrencyName;
    }

    public void setSendCurrencyName(String sendCurrencyName) {
        this.sendCurrencyName = sendCurrencyName;
    }

    public String getSendCurrencyCode() {
        return sendCurrencyCode;
    }

    public void setSendCurrencyCode(String sendCurrencyCode) {
        this.sendCurrencyCode = sendCurrencyCode;
    }

    public BigDecimal getCustomerFee() {
        return customerFee;
    }

    public void setCustomerFee(BigDecimal customerFee) {
        this.customerFee = customerFee;
    }

    public BigDecimal getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(BigDecimal receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public String getReceivedCurrencyName() {
        return receivedCurrencyName;
    }

    public void setReceivedCurrencyName(String receivedCurrencyName) {
        this.receivedCurrencyName = receivedCurrencyName;
    }

    public String getReceivedCurrencyCode() {
        return receivedCurrencyCode;
    }

    public void setReceivedCurrencyCode(String receivedCurrencyCode) {
        this.receivedCurrencyCode = receivedCurrencyCode;
    }

    public Payout getPayout() {
        return payout;
    }

    public void setPayout(Payout payout) {
        this.payout = payout;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("token=").append(token);
        sb.append(", sendDate=").append(sendDate);
        sb.append(", inoiceNumber='").append(inoiceNumber).append('\'');
        sb.append(", transferNo='").append(transferNo).append('\'');
        sb.append(", sender=").append(sender);
        sb.append(", receiver=").append(receiver);
        sb.append(", status='").append(status).append('\'');
        sb.append(", cancelledDate=").append(cancelledDate);
        sb.append(", paidDate=").append(paidDate);
        sb.append(", bank=").append(bank);
        sb.append(", accountType='").append(accountType).append('\'');
        sb.append(", deliverMethod='").append(deliverMethod).append('\'');
        sb.append(", sendAmount=").append(sendAmount);
        sb.append(", sendCurrencyName='").append(sendCurrencyName).append('\'');
        sb.append(", sendCurrencyCode='").append(sendCurrencyCode).append('\'');
        sb.append(", customerFee=").append(customerFee);
        sb.append(", receivedAmount=").append(receivedAmount);
        sb.append(", receivedCurrencyName='").append(receivedCurrencyName).append('\'');
        sb.append(", receivedCurrencyCode='").append(receivedCurrencyCode).append('\'');
        sb.append(", payout=").append(payout);
        sb.append(", conversionRate=").append(conversionRate);
        sb.append('}');
        return sb.toString();
    }
}
