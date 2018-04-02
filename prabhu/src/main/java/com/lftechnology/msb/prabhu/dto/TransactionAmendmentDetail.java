package com.lftechnology.msb.prabhu.dto;

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
}
