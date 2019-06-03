
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
 *         &lt;element name="BillConsultResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}wsBillInfo" minOccurs="0"/&gt;
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
    "billConsultResult"
})
@XmlRootElement(name = "BillConsultResponse")
public class BillConsultResponse {

    @XmlElementRef(name = "BillConsultResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WsBillInfo> billConsultResult;

    /**
     * Gets the value of the billConsultResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsBillInfo }{@code >}
     *     
     */
    public JAXBElement<WsBillInfo> getBillConsultResult() {
        return billConsultResult;
    }

    /**
     * Sets the value of the billConsultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsBillInfo }{@code >}
     *     
     */
    public void setBillConsultResult(JAXBElement<WsBillInfo> value) {
        this.billConsultResult = value;
    }

}
