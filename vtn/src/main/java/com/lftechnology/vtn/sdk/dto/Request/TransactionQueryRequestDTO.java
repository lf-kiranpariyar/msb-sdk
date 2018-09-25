package com.lftechnology.vtn.sdk.dto.Request;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
@Data
public class TransactionQueryRequestDTO {

    @XmlElement(name = "TransactionId")
    private String transactionId;
}
