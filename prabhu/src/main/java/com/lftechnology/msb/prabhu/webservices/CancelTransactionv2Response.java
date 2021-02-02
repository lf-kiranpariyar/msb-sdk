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
 *         &lt;element name="CancelTransactionv2Result" type="{WebServices}Return_TXNCancel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "cancelTransactionv2Result"
})
@XmlRootElement(name = "CancelTransactionv2Response")
public class CancelTransactionv2Response {

    @XmlElement(name = "CancelTransactionv2Result", required = true)
    protected ReturnTXNCancel cancelTransactionv2Result;

    /**
     * Gets the value of the cancelTransactionv2Result property.
     *
     * @return possible object is
     * {@link ReturnTXNCancel }
     */
    public ReturnTXNCancel getCancelTransactionv2Result() {
        return cancelTransactionv2Result;
    }

    /**
     * Sets the value of the cancelTransactionv2Result property.
     *
     * @param value allowed object is
     *              {@link ReturnTXNCancel }
     */
    public void setCancelTransactionv2Result(ReturnTXNCancel value) {
        this.cancelTransactionv2Result = value;
    }

}
