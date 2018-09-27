package com.lftechnology.vtn.sdk.dto.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="RemittanceTransactionResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManualUpdateListResponseDTO {

    @XmlElement(name = "TransactionDetails" )
    private ManualUpdateResponseDTO transaction;

    public ManualUpdateResponseDTO getTransaction() {
        return transaction;
    }

    public void setTransaction(ManualUpdateResponseDTO transaction) {
        this.transaction = transaction;
    }
}
