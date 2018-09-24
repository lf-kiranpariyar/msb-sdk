package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class Response {
    @XmlElement(name="ResponseCode")
    private String code;
    @XmlElement(name="ResponseMessage")
    private String message;
}
