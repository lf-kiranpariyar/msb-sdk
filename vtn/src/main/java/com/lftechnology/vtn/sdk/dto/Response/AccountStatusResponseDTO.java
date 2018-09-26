package com.lftechnology.vtn.sdk.dto.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@XmlRootElement(name="RemittanceAccountStatusResponse")
@XmlAccessorType(XmlAccessType.FIELD)

public class AccountStatusResponseDTO extends ResponseDTO {

    @XmlElement(name="FirstName")
    private String firstName;
    @XmlElement(name="LastName")
    private String lastName;
    @XmlElement(name="Email")
    private String email;
    @XmlElement(name="Phone")
    private String phone;

    @XmlElement(name = "DateOfBirth")
    private String dob;



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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "AccountStatusResponseDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
