
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
 *         &lt;element name="GetClearedAchTransactionsResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfwsCollectedAch" minOccurs="0"/&gt;
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
    "getClearedAchTransactionsResult"
})
@XmlRootElement(name = "GetClearedAchTransactionsResponse")
public class GetClearedAchTransactionsResponse {

    @XmlElementRef(name = "GetClearedAchTransactionsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsCollectedAch> getClearedAchTransactionsResult;

    /**
     * Gets the value of the getClearedAchTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsCollectedAch }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsCollectedAch> getGetClearedAchTransactionsResult() {
        return getClearedAchTransactionsResult;
    }

    /**
     * Sets the value of the getClearedAchTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsCollectedAch }{@code >}
     *     
     */
    public void setGetClearedAchTransactionsResult(JAXBElement<ArrayOfwsCollectedAch> value) {
        this.getClearedAchTransactionsResult = value;
    }

}
