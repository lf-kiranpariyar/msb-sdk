package com.lftechnology.vtn.sdk.dto.Response;


import com.lftechnology.vtn.sdk.utils.BigDecimalAdapter;
import com.lftechnology.vtn.sdk.utils.LocalDateAdapter;
import com.lftechnology.vtn.sdk.utils.LocalDateTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@XmlRootElement(name="RemittanceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionResponseDTO extends ResponseDTO {

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "TransferDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
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
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal amount;

    @XmlElement(name = "AmountInNaira")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal amountInNaira;

    @XmlElement(name = "BankAccountNumber")
    private String accountNumber;

    @XmlElement(name = "BankAccountName")
    private  String bankAccountName;

    @XmlElement(name = "BankName")
    private String bankName;

    @XmlElement(name = "NotificationMessage")
    private String notificationMessage;

    @XmlElement(name = "TransactionStatus")
    private Integer transactionStatus;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmmountInNaira() {
        return amountInNaira;
    }

    public void setAmmountInNaira(BigDecimal ammountInNaira) {
        this.amountInNaira = ammountInNaira;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @Override
    public String toString() {
        return "TransactionResponseDTO{" +
                "transactionId='" + transactionId + '\'' +
                ", transferDate=" + transferDate +
                ", transferType=" + transferType +
                ", senderEmail='" + senderEmail + '\'' +
                ", senderPhone='" + senderPhone + '\'' +
                ", receiverEmail='" + receiverEmail + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", currency='" + currency + '\'' +
                ", ammount=" + amount +
                ", ammountInNaira=" + amountInNaira +
                ", accountNumber=" + accountNumber +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", notificationMessage='" + notificationMessage + '\'' +
                ", transactionStatus=" + transactionStatus + '\'' +
                ", responseCode=" + getCode() + '\'' +
                ", response message=" + getMessage() +
                '}';
    }
}