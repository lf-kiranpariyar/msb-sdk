package com.lftechnology.vtn.sdk.dto.Response;

import com.lftechnology.vtn.sdk.dto.Response.ResponseDTO;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name="RemittanceBalanceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BalanceQueryDTO extends ResponseDTO {
    @Override
    public String toString() {
        return "BalanceQueryDTO{" +
                "balance=" + balance +
                '}';
    }

    @XmlElement(name ="AccountBalance")
    private BigDecimal balance;
}
