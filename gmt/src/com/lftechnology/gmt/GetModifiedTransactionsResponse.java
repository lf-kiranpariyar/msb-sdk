
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
 *         &lt;element name="GetModifiedTransactionsResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfwsModifiedTransactions" minOccurs="0"/&gt;
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
    "getModifiedTransactionsResult"
})
@XmlRootElement(name = "GetModifiedTransactionsResponse")
public class GetModifiedTransactionsResponse {

    @XmlElementRef(name = "GetModifiedTransactionsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsModifiedTransactions> getModifiedTransactionsResult;

    /**
     * Gets the value of the getModifiedTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsModifiedTransactions }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsModifiedTransactions> getGetModifiedTransactionsResult() {
        return getModifiedTransactionsResult;
    }

    /**
     * Sets the value of the getModifiedTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsModifiedTransactions }{@code >}
     *     
     */
    public void setGetModifiedTransactionsResult(JAXBElement<ArrayOfwsModifiedTransactions> value) {
        this.getModifiedTransactionsResult = value;
    }

}
