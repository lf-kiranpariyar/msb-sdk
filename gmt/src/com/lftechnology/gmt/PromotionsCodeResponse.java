
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
 *         &lt;element name="PromotionsCodeResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}ws_Select_PromoResult" minOccurs="0"/&gt;
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
    "promotionsCodeResult"
})
@XmlRootElement(name = "PromotionsCodeResponse")
public class PromotionsCodeResponse {

    @XmlElementRef(name = "PromotionsCodeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WsSelectPromoResult> promotionsCodeResult;

    /**
     * Gets the value of the promotionsCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsSelectPromoResult }{@code >}
     *     
     */
    public JAXBElement<WsSelectPromoResult> getPromotionsCodeResult() {
        return promotionsCodeResult;
    }

    /**
     * Sets the value of the promotionsCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsSelectPromoResult }{@code >}
     *     
     */
    public void setPromotionsCodeResult(JAXBElement<WsSelectPromoResult> value) {
        this.promotionsCodeResult = value;
    }

}
