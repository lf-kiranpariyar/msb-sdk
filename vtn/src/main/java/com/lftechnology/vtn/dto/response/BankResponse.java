package com.lftechnology.vtn.dto.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;


@XmlRootElement(name = "RemittanceNameEnquiryResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BankResponse extends Response {

    @XmlElement(name = "BankAccountNumber")
    private BigDecimal accountNumber;
    @XmlElement(name = "BankAccountName")
    private String accountName;
    @XmlElement(name = "BankName")
    private String bankName;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankResponse{");
        sb.append("accountNumber=").append(accountNumber);
        sb.append(", accountName='").append(accountName).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

