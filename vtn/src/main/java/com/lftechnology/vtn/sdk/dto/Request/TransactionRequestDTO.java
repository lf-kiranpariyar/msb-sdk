package com.lftechnology.vtn.sdk.dto.Request;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionRequestDTO {

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "TransferDate")
    private LocalDateTime transferDate;

    @XmlElement(name = "TransferType")
    private Integer transferType;

    @XmlElement(name = "SenderEmail")
    private String senderEmail;

    @XmlElement(name = "SenderPhone")
    private String senderPhone;

    @XmlElement(name = "SenderFirstName")
    private String senderFirstName;

    @XmlElement(name = "SenderLastName")
    private String senderLastName;

    @XmlElement(name = "SenderCountry")
    private String senderCountry;

    @XmlElement(name = "ReceiverEmail")
    private String receiverEmail;

    @XmlElement(name = "ReceiverPhone")
    private String receiverPhone;

    @XmlElement(name = "ReceiverFirstName")
    private String receiverFirstName;

    @XmlElement(name = "ReceiverLastName")
    private String getReceiverLastName;

    @XmlElement(name = "ReceiverCountry")
        private String receiverCountry;

    @XmlElement(name = "CurrencyCode")
    private String currencyCode;

    @XmlElement(name = "AmountInSendereCountry")
    private BigDecimal ammountInSenderCountry;

    @XmlElement(name = "AmmountInNaira")
    private BigDecimal ammountInNaira;

    @XmlElement(name = "FeeInSenderCountry")
    private BigDecimal feeInSenderCountry;

    @XmlElement(name = "FeeInNaira")
    private BigDecimal feeInNaira;

    @XmlElement(name = "BankAccountNumber")
    private BigDecimal accountNumber;

    @XmlElement(name = "BankAccountName")
    private  String bankAccountName;

    @XmlElement(name = "BankName")
    private String bankName;
}
