package com.lftechnology.msb.sdk.dto;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class CancelResponse {

    private String code;
    private String msbTxnId;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsbTxnId() {
        return msbTxnId;
    }

    public void setMsbTxnId(String msbTxnId) {
        this.msbTxnId = msbTxnId;
    }
}
