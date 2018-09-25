package com.lftechnology.vtn.sdk.dto.Request;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class BankNameRequestDTO {

    @XmlElement(name = "BankAccountNumber")
    private String bankAccountNumber;

    @XmlElement(name = "BankAccountName")
    private String bankAccountName;

    @XmlElement(name = "BankName")
    private String BankName;
}
