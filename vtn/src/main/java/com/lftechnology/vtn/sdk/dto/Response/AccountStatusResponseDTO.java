package com.lftechnology.vtn.sdk.dto.Response;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name="RemittanceAccountStatusResponse")
public class AccountStatusResponseDTO extends ResponseDTO {
    @XmlElement(name="FirstName")
    private String firstName;
    @XmlElement(name="LastName")
    private String lastName;
    @XmlElement(name="Email")
    private String email;
    @XmlElement(name="Phone")
    private String phone;
}
