package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name="RemittanceBalanceResponse")
@Data
public class Account extends Response {
    @XmlElement(name ="AccountBalance")
    private BigDecimal balance;
}
