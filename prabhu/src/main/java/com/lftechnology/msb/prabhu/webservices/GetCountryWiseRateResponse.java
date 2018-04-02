
package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCountryWiseRateResult" type="{WebServices}ArrayOfReturn_ExCountry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCountryWiseRateResult"
})
@XmlRootElement(name = "GetCountryWiseRateResponse")
public class GetCountryWiseRateResponse {

    @XmlElement(name = "GetCountryWiseRateResult")
    protected ArrayOfReturnExCountry getCountryWiseRateResult;

    /**
     * Gets the value of the getCountryWiseRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReturnExCountry }
     *     
     */
    public ArrayOfReturnExCountry getGetCountryWiseRateResult() {
        return getCountryWiseRateResult;
    }

    /**
     * Sets the value of the getCountryWiseRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReturnExCountry }
     *     
     */
    public void setGetCountryWiseRateResult(ArrayOfReturnExCountry value) {
        this.getCountryWiseRateResult = value;
    }

}
