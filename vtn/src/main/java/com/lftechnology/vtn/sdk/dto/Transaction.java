package com.lftechnology.vtn.sdk.dto;

import lombok.Data;


import javax.xml.bind.annotation.XmlElement;
import java.time.LocalDateTime;

@Data
public class Transaction extends Response{
    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "TransferDate")
    private LocalDateTime transferDate;

    @XmlElement(name = "TransferType")
    private Integer transferType;

    private Sender sender;
    private Receiver receiver;
    private Bank bank;


}