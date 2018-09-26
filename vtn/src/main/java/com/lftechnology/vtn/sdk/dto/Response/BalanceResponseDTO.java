package com.lftechnology.vtn.sdk.dto.Response;


import com.lftechnology.vtn.sdk.utils.BigDecimalAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlRootElement(name="RemittanceBalanceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BalanceResponseDTO extends ResponseDTO {

    @XmlElement(name ="AccountBalance")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal  balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BalanceResponseDTO{" +
                "balance=" + balance +
                '}';
    }


}
