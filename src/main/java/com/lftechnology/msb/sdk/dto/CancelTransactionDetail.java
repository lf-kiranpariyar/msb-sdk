package com.lftechnology.msb.sdk.dto;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class CancelTransactionDetail {

    private String msbTxnId;
    private String cancelComment;

    public String getMsbTxnId() {
        return msbTxnId;
    }

    public void setMsbTxnId(String msbTxnId) {
        this.msbTxnId = msbTxnId;
    }

    public String getCancelComment() {
        return cancelComment;
    }

    public void setCancelComment(String cancelComment) {
        this.cancelComment = cancelComment;
    }

    @Override public String toString() {
        final StringBuffer sb = new StringBuffer("CancelTransactionDetail{");
        sb.append("msbTxnId='").append(msbTxnId).append('\'');
        sb.append(", cancelComment='").append(cancelComment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
