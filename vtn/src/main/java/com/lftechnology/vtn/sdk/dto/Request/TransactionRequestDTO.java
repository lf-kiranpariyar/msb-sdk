package com.lftechnology.vtn.sdk.dto.Request;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionRequestDTO extends Credentials{

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @Xml
    @XmlElement(name = "TransferDate")
    private LocalDate transferDate;

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
    private String accountNumber;

    @XmlElement(name = "BankAccountName")
    private  String bankAccountName;

    @XmlElement(name = "BankName")
    private String bankName;


    public TransactionRequestDTO(String transactionId, LocalDateTime transferDate, Integer transferType, String senderEmail, String senderPhone, String senderFirstName, String senderLastName, String senderCountry, String receiverEmail, String receiverPhone, String receiverFirstName, String getReceiverLastName, String receiverCountry, String currencyCode, int ammountInSenderCountry, double ammountInNaira, int feeInSenderCountry, int feeInNaira, String accountNumber, String bankAccountName, String bankName) {
        this.transactionId = transactionId;
        this.transferDate = transferDate;
        this.transferType = transferType;
        this.senderEmail = senderEmail;
        this.senderPhone = senderPhone;
        this.senderFirstName = senderFirstName;
        this.senderLastName = senderLastName;
        this.senderCountry = senderCountry;
        this.receiverEmail = receiverEmail;
        this.receiverPhone = receiverPhone;
        this.receiverFirstName = receiverFirstName;
        this.getReceiverLastName = getReceiverLastName;
        this.receiverCountry = receiverCountry;
        this.currencyCode = currencyCode;
        this.ammountInSenderCountry = ammountInSenderCountry;
        this.ammountInNaira = ammountInNaira;
        this.feeInSenderCountry = feeInSenderCountry;
        this.feeInNaira = feeInNaira;
        this.accountNumber = accountNumber;
        this.bankAccountName = bankAccountName;
        this.bankName = bankName;
    }





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

    public String getSenderFirstName() {
        return senderFirstName;
    }

    public void setSenderFirstName(String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }

    public String getSenderLastName() {
        return senderLastName;
    }

    public void setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
    }

    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
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

    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    public void setReceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }

    public String getGetReceiverLastName() {
        return getReceiverLastName;
    }

    public void setGetReceiverLastName(String getReceiverLastName) {
        this.getReceiverLastName = getReceiverLastName;
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getAmmountInSenderCountry() {
        return ammountInSenderCountry;
    }

    public void setAmmountInSenderCountry(BigDecimal ammountInSenderCountry) {
        this.ammountInSenderCountry = ammountInSenderCountry;
    }

    public BigDecimal getAmmountInNaira() {
        return ammountInNaira;
    }

    public void setAmmountInNaira(BigDecimal ammountInNaira) {
        this.ammountInNaira = ammountInNaira;
    }

    public BigDecimal getFeeInSenderCountry() {
        return feeInSenderCountry;
    }

    public void setFeeInSenderCountry(BigDecimal feeInSenderCountry) {
        this.feeInSenderCountry = feeInSenderCountry;
    }

    public BigDecimal getFeeInNaira() {
        return feeInNaira;
    }

    public void setFeeInNaira(BigDecimal feeInNaira) {
        this.feeInNaira = feeInNaira;
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
}
