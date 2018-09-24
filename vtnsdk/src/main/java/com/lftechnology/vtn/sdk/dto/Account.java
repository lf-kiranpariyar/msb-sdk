package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Data
@XmlRootElement(name="RemittanceAccountStatusResponse")
public class Account extends Response{
    @XmlElement(name="FirstName")
    private String firstName;
    @XmlElement(name="LastName")
    private String lastName;
    @XmlElement(name="Email")
    private String email;
    @XmlElement(name="Phone")
    private String phone;
    @XmlElement(name = "DateOfBirth")
    private Date dob;

}
