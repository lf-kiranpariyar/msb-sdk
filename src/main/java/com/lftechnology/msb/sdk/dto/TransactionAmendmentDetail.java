package com.lftechnology.msb.sdk.dto;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class TransactionAmendmentDetail {
   String msbTxnId;
   String fieldName;
   String fieldValue;

    public String getMsbTxnId() {
        return msbTxnId;
    }

    public void setMsbTxnId(String msbTxnId) {
        this.msbTxnId = msbTxnId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Override public String toString() {
        final StringBuffer sb = new StringBuffer("TransactionAmendmentDetail{");
        sb.append("msbTxnId='").append(msbTxnId).append('\'');
        sb.append(", fieldName='").append(fieldName).append('\'');
        sb.append(", fieldValue='").append(fieldValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
