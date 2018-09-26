package com.lftechnology.vtn.sdk.dto.Request;

import com.lftechnology.vtn.sdk.constants.CommonConstant;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Credentials {
    public Credentials() {
    }

    public Credentials(String accessToken, String accessKey) {
        this.accessToken = accessToken;
        this.accessKey = accessKey;
    }

    @XmlElement(name = "AccessToken")
    private String accessToken;

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

    @XmlElement(name = "AccessKey")
    private String accessKey;
}
