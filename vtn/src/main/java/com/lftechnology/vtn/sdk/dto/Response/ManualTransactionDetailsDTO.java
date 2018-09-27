package com.lftechnology.vtn.sdk.dto.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TransactionDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManualTransactionDetailsDTO {

    @XmlElement(name = "Transaction" )
    private ManualUpdateResponseDTO transaction;

    public ManualUpdateResponseDTO getTransaction() {
        return transaction;
    }

    public void setTransaction(ManualUpdateResponseDTO transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "ManualTransactionDetailsDTO{" +
                "transaction=" + transaction +
                '}';
    }
}
