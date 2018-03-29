package com.lftechnology.msb.sdk.dto;

import com.lftechnology.msb.sdk.enums.MSBTransactionStatus;

import java.util.HashMap;
import java.util.Map;

public class TransactionStatusChangeRequest {

    private MSBTransactionStatus currentStatus;
    private MSBTransactionStatus targetStatus;
    private String note;
    private String referenceId;
    private Map<String, Object> metadata = new HashMap<>();


    public MSBTransactionStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(MSBTransactionStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public MSBTransactionStatus getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(MSBTransactionStatus targetStatus) {
        this.targetStatus = targetStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
