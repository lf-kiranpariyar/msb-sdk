
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
 *         &lt;element name="GetSingleExchangeRateResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}wsExRate" minOccurs="0"/&gt;
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
    "getSingleExchangeRateResult"
})
@XmlRootElement(name = "GetSingleExchangeRateResponse")
public class GetSingleExchangeRateResponse {

    @XmlElementRef(name = "GetSingleExchangeRateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WsExRate> getSingleExchangeRateResult;

    /**
     * Gets the value of the getSingleExchangeRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsExRate }{@code >}
     *     
     */
    public JAXBElement<WsExRate> getGetSingleExchangeRateResult() {
        return getSingleExchangeRateResult;
    }

    /**
     * Sets the value of the getSingleExchangeRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsExRate }{@code >}
     *     
     */
    public void setGetSingleExchangeRateResult(JAXBElement<WsExRate> value) {
        this.getSingleExchangeRateResult = value;
    }

}
