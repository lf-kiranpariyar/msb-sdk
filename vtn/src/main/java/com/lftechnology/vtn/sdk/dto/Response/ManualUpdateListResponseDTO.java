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
    private List<ManualUpdateResponseDTO> transactionList;

    public ManualUpdateListResponseDTO(List<ManualUpdateResponseDTO> transactionList) {
        this.transactionList = transactionList;
    }

    public List<ManualUpdateResponseDTO> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<ManualUpdateResponseDTO> transactionList) {
        this.transactionList = transactionList;
    }
}
