package com.lftechnology.vtn.sdk.dto.Response;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;


@XmlRootElement(name="RemittanceNameEnquiryResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BankResponseDTO extends ResponseDTO {

    public BigDecimal getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BigDecimal accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @XmlElement(name = "BankAccountNumber")
    private BigDecimal accountNumber;

    @XmlElement(name = "BankAccountName")
    private String accountName;

    @XmlElement(name="BankName")
    private  String bankName;

    @Override
    public String toString() {
        return "BankResponseDTO{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}

