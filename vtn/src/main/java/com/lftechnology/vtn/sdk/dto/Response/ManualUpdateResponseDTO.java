package com.lftechnology.vtn.sdk.dto.Response;

import com.lftechnology.vtn.sdk.utils.BigDecimalAdapter;
import com.lftechnology.vtn.sdk.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;

@XmlRootElement(name="Transaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManualUpdateResponseDTO extends ResponseDTO {


    @XmlElement(name="TransactionId")
    private String transactionId;

    @XmlElement(name="RevertStatus")
    private String revertStatus;

    @XmlElement(name = "ManualUpdateStatus")
    private String manualUpdateStatus;

    @XmlElement(name = "RevertedDate")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate revertedDate;

    @XmlElement(name = "TotalAmount")
    private BigDecimal totalAmount;

    @XmlElement(name = "NumberOfEntries")
    private Integer numberOfEntries;




    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getRevertStatus() {
        return revertStatus;
    }

    public void setRevertStatus(String revertStatus) {
        this.revertStatus = revertStatus;
    }

    public String getManualUpdateStatus() {
        return manualUpdateStatus;
    }

    public void setManualUpdateStatus(String manualUpdateStatus) {
        this.manualUpdateStatus = manualUpdateStatus;
    }

    public LocalDate getRevertedDate() {
        return revertedDate;
    }

    public void setRevertedDate(LocalDate revertedDate) {
        this.revertedDate = revertedDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(Integer numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    @Override
    public String toString() {
        return "ManualUpdateResponseDTO{" +
                "transactionId='" + transactionId + '\'' +
                ", revertStatus='" + revertStatus + '\'' +
                ", manualUpdateStatus='" + manualUpdateStatus + '\'' +
                ", revertedDate=" + revertedDate +
                ", totalAmount=" + totalAmount +
                ", numberOfEntries=" + numberOfEntries +

                ", responseCode=" + getCode() +
                ", responseMessage=" + getMessage() +
                '}';
    }
}
