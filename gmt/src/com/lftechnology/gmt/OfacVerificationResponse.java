
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
 *         &lt;element name="OfacVerificationResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}wsOfac" minOccurs="0"/&gt;
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
    "ofacVerificationResult"
})
@XmlRootElement(name = "OfacVerificationResponse")
public class OfacVerificationResponse {

    @XmlElementRef(name = "OfacVerificationResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WsOfac> ofacVerificationResult;

    /**
     * Gets the value of the ofacVerificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsOfac }{@code >}
     *     
     */
    public JAXBElement<WsOfac> getOfacVerificationResult() {
        return ofacVerificationResult;
    }

    /**
     * Sets the value of the ofacVerificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsOfac }{@code >}
     *     
     */
    public void setOfacVerificationResult(JAXBElement<WsOfac> value) {
        this.ofacVerificationResult = value;
    }

}
