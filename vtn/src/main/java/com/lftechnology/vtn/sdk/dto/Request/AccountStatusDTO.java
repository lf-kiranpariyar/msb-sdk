package com.lftechnology.vtn.sdk.dto.Request;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class AccountStatusDTO {

    @XmlElement(name = "Email")
    private String email;

    @XmlElement(name = "Phone")
    private String phone;


}