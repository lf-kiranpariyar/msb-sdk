package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@Data
public class Sender {
    private String senderId;

    @XmlElement(name="SenderFirstName")
    private String firstName;

    @XmlElement(name="SenderLastName")
    private String lastName;

    @XmlElement(name = "SenderEmail")
    private String email;

    @XmlElement(name="SenderPhone")
    private BigDecimal phone;

    @XmlElement(name = "SenderCountry")
    private Country country;
}
