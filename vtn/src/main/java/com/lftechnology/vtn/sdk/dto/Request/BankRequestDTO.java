package com.lftechnology.vtn.sdk.dto.Request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BankRequestDTO extends Credentials{
    public BankRequestDTO() {
    }

    public BankRequestDTO(String bankAccountNumber, String bankAccountName, String bankName , String accessToken , String accessKey) {
        super(accessToken,accessKey);
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountName = bankAccountName;
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
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

    @XmlElement(name = "BankAccountNumber")
    private String bankAccountNumber;

    @XmlElement(name = "BankAccountName")
    private String bankAccountName;

    @XmlElement(name = "BankName")
    private String bankName;
}

