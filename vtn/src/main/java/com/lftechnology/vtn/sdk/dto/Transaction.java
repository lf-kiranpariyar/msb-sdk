package com.lftechnology.vtn.sdk.dto;

import lombok.Data;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlElement;
@Data
public class Transaction extends Response{
    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "TransferDate")
    private DateTime transferDate;

    @XmlElement(name = "TransferType")
    private int transferType;

    private Sender sender;
    private Receiver receiver;




}

