package com.lftechnology.vtn.dto.response;


import com.lftechnology.vtn.adapter.BigDecimalAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlRootElement(name = "RemittanceBalanceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BalanceResponse extends Response {

    @XmlElement(name = "AccountBalance")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BalanceResponse{");
        sb.append("balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }


}
