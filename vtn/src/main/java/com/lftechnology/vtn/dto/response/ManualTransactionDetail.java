package com.lftechnology.vtn.dto.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TransactionDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManualTransactionDetail {

    @XmlElement(name = "Transaction")
    private ManualTransaction transaction;

    public ManualTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(ManualTransaction transaction) {
        this.transaction = transaction;
    }


    public String getCode() {
        return transaction.getCode();
    }

    public String getMessage() {
        return transaction.getMessage();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManualTransactionDetail{");
        sb.append("transaction=").append(transaction);
        sb.append('}');
        return sb.toString();
    }
}
