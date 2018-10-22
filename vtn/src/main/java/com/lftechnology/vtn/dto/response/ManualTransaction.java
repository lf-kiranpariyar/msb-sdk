package com.lftechnology.vtn.dto.response;

import com.lftechnology.vtn.adapter.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;

@XmlRootElement(name = "Transaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManualTransaction extends Response {


    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "RevertStatus")
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
        final StringBuilder sb = new StringBuilder("ManualTransaction{");
        sb.append("transactionId='").append(transactionId).append('\'');
        sb.append(", revertStatus='").append(revertStatus).append('\'');
        sb.append(", manualUpdateStatus='").append(manualUpdateStatus).append('\'');
        sb.append(", revertedDate=").append(revertedDate);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", numberOfEntries=").append(numberOfEntries);
        sb.append('}');
        return sb.toString();
    }
}
