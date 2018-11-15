package com.lftechnology.moneytun.outbound.dto;

import com.google.gson.annotations.SerializedName;

public class Credential {

    @SerializedName("accessKey")
    private String accessKey;

    @SerializedName("secretKey")
    private String secretKey;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
