package com.lftechnology.msb.sdk.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>, adhpawal
 */
public class TransactionResponse {

    private Boolean isSuccess;
    private String referenceNumber;
    private String txnStatus;
    private Map<String, Object> metadata = new HashMap<>();
    private Map<String, Object> errorReason = new HashMap<>();

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getTxnStatus() {
        return txnStatus;
    }

    public void setTxnStatus(String txnStatus) {
        this.txnStatus = txnStatus;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public Map<String, Object> getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(Map<String, Object> errorReason) {
        this.errorReason = errorReason;
    }
}
