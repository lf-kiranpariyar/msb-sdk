package com.lftechnology.vtn.dto.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "RemittanceTransactionResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionListResponse extends Response {

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "NumberOfEntries")
    private Integer numberOfEntries;

    @XmlElement(name = "Transaction")
    @XmlElementWrapper(name = "TransactionDetails")
    private List<TransactionResponse> transactionResponseDTO;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(Integer numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    public List<TransactionResponse> getTransactionResponseDTO() {
        return transactionResponseDTO;
    }

    public void setTransactionResponseDTO(List<TransactionResponse> transactionResponseDTO) {
        this.transactionResponseDTO = transactionResponseDTO;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransactionListResponse{");
        sb.append("transactionId='").append(transactionId).append('\'');
        sb.append(", numberOfEntries=").append(numberOfEntries);
        sb.append(", transactionResponseDTO=").append(transactionResponseDTO);
        sb.append('}');
        return sb.toString();
    }
}
