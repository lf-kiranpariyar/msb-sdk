package com.lftechnology.vtn.sdk.dto.Response;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class ResponseDTO {
    @XmlElement(name="ResponseCode")
    private String code;
    @XmlElement(name="ResponseMessage")
    private String message;
}
