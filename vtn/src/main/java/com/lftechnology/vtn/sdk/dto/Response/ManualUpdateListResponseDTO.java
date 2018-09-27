package com.lftechnology.vtn.sdk.dto.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RemittanceTransactionResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManualUpdateListResponseDTO {

    @XmlElement(name="TransactionDetails")
    private ManualTransactionDetailsDTO manualTransactionDetailsDTO;

    public ManualTransactionDetailsDTO getManualTransactionDetailsDTO() {
        return manualTransactionDetailsDTO;
    }

    public void setManualTransactionDetailsDTO(ManualTransactionDetailsDTO manualTransactionDetailsDTO) {
        this.manualTransactionDetailsDTO = manualTransactionDetailsDTO;
    }

    @Override
    public String toString() {
        return "ManualUpdateListResponseDTO{" +
                "manualTransactionDetailsDTO=" + manualTransactionDetailsDTO +
                '}';
    }
}
