package com.lftechnology.moneytun.outbound.dto;

import com.lftechnology.moneytun.outbound.constant.CommonConstant;
import com.lftechnology.moneytun.outbound.enums.ApiMode;
import com.lftechnology.moneytun.outbound.exception.WhiteWingBadRequestException;

public class APIContext {
    private Credential credential;
    private ApiMode mode;

    public APIContext(Credential credential, ApiMode mode) {
        this.credential = credential;
        this.mode = mode;
    }


    public String getEndPointUrl() {
        switch (mode) {
            case LIVE:
                return CommonConstant.LIVE_ENDPOINT;
            case SANDBOX:
                return CommonConstant.SANDBOX_ENDPOINT;
            default:
                throw new WhiteWingBadRequestException("Invalid Mode or URL");
        }
    }

    public String getAuthentication() {
        return credential.getAccessKey() + ":" + credential.getSecretKey();
    }
}
