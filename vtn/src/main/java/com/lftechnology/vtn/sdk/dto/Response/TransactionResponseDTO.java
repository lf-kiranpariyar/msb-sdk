package com.lftechnology.vtn.sdk.dto.Response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@XmlRootElement(name="RemittanceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionResponseDTO extends ResponseDTO {

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

    @XmlElement(name = "ReceiverEmail")
    private String receiverEmail;

    @XmlElement(name = "ReceiverPhone")
    private String receiverPhone;

    @XmlElement(name = "Currency")
    private String currency;

    @XmlElement(name = "Amount")
    private BigDecimal ammount;

    @XmlElement(name = "AmmountInNaira")
    private BigDecimal ammountInNaira;

    @XmlElement(name = "BankAccountNumber")
    private BigDecimal accountNumber;

    @XmlElement(name = "BankAccountName")
    private  String bankAccountName;

    @XmlElement(name = "BankName")
    private String bankName;

    @XmlElement(name = "NotificationMessage")
    private String notificationMessage;

    @XmlElement(name = "TransactionStatus")
    private Integer transactionStatus;



}