
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
 *         &lt;element name="RequestModificationResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}wsResponse" minOccurs="0"/&gt;
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
    "requestModificationResult"
})
@XmlRootElement(name = "RequestModificationResponse")
public class RequestModificationResponse {

    @XmlElementRef(name = "RequestModificationResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WsResponse> requestModificationResult;

    /**
     * Gets the value of the requestModificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     *     
     */
    public JAXBElement<WsResponse> getRequestModificationResult() {
        return requestModificationResult;
    }

    /**
     * Sets the value of the requestModificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     *     
     */
    public void setRequestModificationResult(JAXBElement<WsResponse> value) {
        this.requestModificationResult = value;
    }

}
