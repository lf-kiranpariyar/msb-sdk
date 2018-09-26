package com.lftechnology.vtn.sdk.dto.Response;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "RemittanceTransactionResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionQueryReponseDTO extends ResponseDTO {

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "NumberOfEntries")
    private Integer numberOfEntries;

    @XmlElement(name = "TransactionDetails")
    private List<TransactionResponseDTO> transactionDTO;

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

    public List<TransactionResponseDTO> getTransactionDTO() {
        return transactionDTO;
    }

    public void setTransactionDTO(List<TransactionResponseDTO> transactionDTO) {
        this.transactionDTO = transactionDTO;
    }


    @Override
    public String toString() {
        return "TransactionQueryReponseDTO{" +
                "transactionId='" + transactionId + '\'' +
                ", numberOfEntries=" + numberOfEntries +
                ", transactionDTO=" + transactionDTO +
                '}';
    }
}
