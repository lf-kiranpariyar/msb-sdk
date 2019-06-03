
package com.lftechnology.gmt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetPaidTransactionsResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfwsPaidTransactions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPaidTransactionsResult"
})
@XmlRootElement(name = "GetPaidTransactionsResponse")
public class GetPaidTransactionsResponse {

    @XmlElementRef(name = "GetPaidTransactionsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsPaidTransactions> getPaidTransactionsResult;

    /**
     * Gets the value of the getPaidTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsPaidTransactions }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsPaidTransactions> getGetPaidTransactionsResult() {
        return getPaidTransactionsResult;
    }

    /**
     * Sets the value of the getPaidTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsPaidTransactions }{@code >}
     *     
     */
    public void setGetPaidTransactionsResult(JAXBElement<ArrayOfwsPaidTransactions> value) {
        this.getPaidTransactionsResult = value;
    }

}
