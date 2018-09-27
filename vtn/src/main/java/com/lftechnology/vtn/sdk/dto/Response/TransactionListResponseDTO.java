package com.lftechnology.vtn.sdk.dto.Response;



import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "RemittanceTransactionResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionListResponseDTO extends ResponseDTO {

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "NumberOfEntries")
    private Integer numberOfEntries;

    @XmlElement(name = "Transaction")
    @XmlElementWrapper(name = "TransactionDetails")
    private List<TransactionResponseDTO> transactionResponseDTO;

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

    public List<TransactionResponseDTO> getTransactionResponseDTO() {
        return transactionResponseDTO;
    }

    public void setTransactionResponseDTO(List<TransactionResponseDTO> transactionResponseDTO) {
        this.transactionResponseDTO = transactionResponseDTO;
    }

    @Override
    public String toString() {
        return "TransactionListResponseDTO{" +
                "transactionId='" + transactionId + '\'' +
                ", numberOfEntries=" + numberOfEntries +
                ", transactionResponseDTO=" + transactionResponseDTO +
                ", responseCode=" + getCode() + '\'' +
                ", response message=" + getMessage() +
                '}';
    }
}
