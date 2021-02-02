
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
 *         &lt;element name="PayersConsultResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfws_Select_PayersByCountryCodeResult" minOccurs="0"/&gt;
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
    "payersConsultResult"
})
@XmlRootElement(name = "PayersConsultResponse")
public class PayersConsultResponse {

    @XmlElementRef(name = "PayersConsultResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsSelectPayersByCountryCodeResult> payersConsultResult;

    /**
     * Gets the value of the payersConsultResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayersByCountryCodeResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsSelectPayersByCountryCodeResult> getPayersConsultResult() {
        return payersConsultResult;
    }

    /**
     * Sets the value of the payersConsultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayersByCountryCodeResult }{@code >}
     *     
     */
    public void setPayersConsultResult(JAXBElement<ArrayOfwsSelectPayersByCountryCodeResult> value) {
        this.payersConsultResult = value;
    }

}
