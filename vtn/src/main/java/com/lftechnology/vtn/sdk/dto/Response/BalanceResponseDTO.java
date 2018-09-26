package com.lftechnology.vtn.sdk.dto.Response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name="RemittanceBalanceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BalanceResponseDTO extends ResponseDTO {

    @XmlElement(name ="AccountBalance")
    private String  balance;

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BalanceResponseDTO{" +
                "balance=" + balance +
                '}';
    }


}
