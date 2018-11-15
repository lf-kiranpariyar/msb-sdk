package com.lftechnology.vtn.dto.request;

public class Credential {
    private String accessToken;
    private String accessKey;

    public Credential() {
    }

    public Credential(String accessToken, String accessKey) {
        this.accessToken = accessToken;
        this.accessKey = accessKey;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }
}
