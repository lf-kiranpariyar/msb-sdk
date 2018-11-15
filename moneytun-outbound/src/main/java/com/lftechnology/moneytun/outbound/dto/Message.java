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

}
