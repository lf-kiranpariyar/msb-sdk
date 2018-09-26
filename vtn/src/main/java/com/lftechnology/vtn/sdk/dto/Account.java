package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@XmlRootElement(name="RemittanceAccountStatusResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account extends Response {
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


    public Account(String firstName, String lastName, String email, String phone, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
