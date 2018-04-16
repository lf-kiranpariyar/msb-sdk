package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class TransactionResponse extends Response{

    @SerializedName("TransferNumber")
    String referenceNumber;

    @SerializedName("InvoiceNumber")
    String invoiceNumber;

    @SerializedName("SenderId")
    String senderId;

    @SerializedName("RecipientId")
    String recipientId;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }
}
