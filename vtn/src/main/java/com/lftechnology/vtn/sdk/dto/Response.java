package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class Response {
    @XmlElement(name="ResponseCode")
    private String code;
    @XmlElement(name="ResponseMessage")
    private String message;
}
