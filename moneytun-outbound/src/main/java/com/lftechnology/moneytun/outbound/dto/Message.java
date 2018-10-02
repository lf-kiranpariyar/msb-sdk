package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    @JsonProperty("TransferNo")
    private String transferNo;
    @JsonProperty("BeneficiaryFullName")
    private String beneficiaryFullName;
    @JsonProperty("SenderFullName")
    private String senderFullName;
    @JsonProperty("ReceivedAmount")
    private String receivedAmount;
    @JsonProperty("TransactionStatus")
    private String transactionStatus;


    public String getTransferNo() {
        return transferNo;
    }

    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo;
    }

    public String getBeneficiaryFullName() {
        return beneficiaryFullName;
    }

    public void setBeneficiaryFullName(String beneficiaryFullName) {
        this.beneficiaryFullName = beneficiaryFullName;
    }

    public String getSenderFullName() {
        return senderFullName;
    }

    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }

    public String getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(String receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("transferNo='").append(transferNo).append('\'');
        sb.append(", beneficiaryFullName='").append(beneficiaryFullName).append('\'');
        sb.append(", senderFullName='").append(senderFullName).append('\'');
        sb.append(", receivedAmount='").append(receivedAmount).append('\'');
        sb.append(", transactionStatus='").append(transactionStatus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
