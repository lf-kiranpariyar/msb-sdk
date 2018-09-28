package com.lftechnology.vtn.dto.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Credential {
    @XmlElement(name = "AccessToken")
    private String accessToken;
    @XmlElement(name = "AccessKey")
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
