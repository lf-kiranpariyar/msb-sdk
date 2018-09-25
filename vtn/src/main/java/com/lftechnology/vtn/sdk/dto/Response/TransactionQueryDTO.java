package com.lftechnology.vtn.sdk.dto.Response;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "RemittanceTransactionResponse")
public class TransactionQueryDTO extends ResponseDTO {

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "NumberOfEntries")
    private Integer numberOfEntries;

    @XmlElement(name = "TransactionDetails")
    private TransactionDTO transactionDTO;

}
