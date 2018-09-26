package com.lftechnology.vtn.sdk.dto.Response;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "RemittanceTransactionResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionQueryDTO extends ResponseDTO {

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "NumberOfEntries")
    private Integer numberOfEntries;

    @XmlElement(name = "TransactionDetails")
    private List<TransactionDTO> transactionDTO;

}
