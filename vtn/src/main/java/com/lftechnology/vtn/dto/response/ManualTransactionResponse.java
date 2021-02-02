package com.lftechnology.vtn.dto.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RemittanceTransactionResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManualTransactionResponse {

    @XmlElement(name = "TransactionDetails")
    private ManualTransactionDetail manualTransactionDetail;

    public ManualTransactionDetail getManualTransactionDetail() {
        return manualTransactionDetail;
    }

    public void setManualTransactionDetail(ManualTransactionDetail manualTransactionDetail) {
        this.manualTransactionDetail = manualTransactionDetail;
    }


    public String getCode() {
        return manualTransactionDetail.getCode();
    }

    public String getMessage() {
        return manualTransactionDetail.getMessage();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManualTransactionResponse{");
        sb.append("manualTransactionDetail=").append(manualTransactionDetail);
        sb.append('}');
        return sb.toString();
    }
}
