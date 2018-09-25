package com.lftechnology.vtn.sdk.dto.Response;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Data
@XmlRootElement(name="RemittanceNameEnquiryResponse")
public class BankNameQueryDTO extends ResponseDTO {

    @XmlElement(name = "BankAccountNumber")
    private BigDecimal accountNumber;

    @XmlElement(name = "BankAccountName")
    private String accountName;

    @XmlElement(name="BankName")
    private  BigDecimal bankName;

}

