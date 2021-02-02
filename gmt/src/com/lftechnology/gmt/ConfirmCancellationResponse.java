
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
 *         &lt;element name="ConfirmCancellationResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}wsResponse" minOccurs="0"/&gt;
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
    "confirmCancellationResult"
})
@XmlRootElement(name = "ConfirmCancellationResponse")
public class ConfirmCancellationResponse {

    @XmlElementRef(name = "ConfirmCancellationResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WsResponse> confirmCancellationResult;

    /**
     * Gets the value of the confirmCancellationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     *     
     */
    public JAXBElement<WsResponse> getConfirmCancellationResult() {
        return confirmCancellationResult;
    }

    /**
     * Sets the value of the confirmCancellationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     *     
     */
    public void setConfirmCancellationResult(JAXBElement<WsResponse> value) {
        this.confirmCancellationResult = value;
    }

}
