package com.lftechnology.vtn.sdk.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@Data
public class Bank extends Response {

    @XmlElement(name = "BankAccountNumber")
    private BigDecimal accountNumber;

    @XmlElement(name = "BankAccountName")
    private String accountName;

    @XmlElement(name="BankName")
    private  BigDecimal bankName;
    private Country country;

}

