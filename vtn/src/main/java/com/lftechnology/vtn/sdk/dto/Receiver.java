package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@Data
public class Receiver {

    private String receiverId;

    @XmlElement(name = "ReceiverFirstName")
    private String firstName;

    @XmlElement(name = "ReceiverLastName")
    private String lastName;

    @XmlElement(name = "ReceiverEmail")
    private String email;

    @XmlElement(name = "ReceiverPhone")
    private BigDecimal phone;

    @XmlElement(name = "ReceiverCountry")
    private Country country;
}
