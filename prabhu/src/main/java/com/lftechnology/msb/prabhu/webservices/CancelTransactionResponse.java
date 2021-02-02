package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelTransactionResult" type="{WebServices}Return_CreateTXN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "cancelTransactionResult"
})
@XmlRootElement(name = "CancelTransactionResponse")
public class CancelTransactionResponse {

    @XmlElement(name = "CancelTransactionResult", required = true)
    protected ReturnCreateTXN cancelTransactionResult;

    /**
     * Gets the value of the cancelTransactionResult property.
     *
     * @return possible object is
     * {@link ReturnCreateTXN }
     */
    public ReturnCreateTXN getCancelTransactionResult() {
        return cancelTransactionResult;
    }

    /**
     * Sets the value of the cancelTransactionResult property.
     *
     * @param value allowed object is
     *              {@link ReturnCreateTXN }
     */
    public void setCancelTransactionResult(ReturnCreateTXN value) {
        this.cancelTransactionResult = value;
    }

}
