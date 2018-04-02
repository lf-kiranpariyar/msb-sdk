
package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Return_ExCountry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return_ExCountry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESTINATION_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUTCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_UPDATED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dollar_Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return_ExCountry", propOrder = {
    "code",
    "destinationcountry",
    "exrate",
    "payoutcurrency",
    "lastupdated",
    "message",
    "dollarRate"
})
public class ReturnExCountry {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "DESTINATION_COUNTRY")
    protected String destinationcountry;
    @XmlElement(name = "EXRATE")
    protected String exrate;
    @XmlElement(name = "PAYOUTCURRENCY")
    protected String payoutcurrency;
    @XmlElement(name = "LAST_UPDATED")
    protected String lastupdated;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "Dollar_Rate")
    protected String dollarRate;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the destinationcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATIONCOUNTRY() {
        return destinationcountry;
    }

    /**
     * Sets the value of the destinationcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATIONCOUNTRY(String value) {
        this.destinationcountry = value;
    }

    /**
     * Gets the value of the exrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXRATE() {
        return exrate;
    }

    /**
     * Sets the value of the exrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXRATE(String value) {
        this.exrate = value;
    }

    /**
     * Gets the value of the payoutcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTCURRENCY() {
        return payoutcurrency;
    }

    /**
     * Sets the value of the payoutcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTCURRENCY(String value) {
        this.payoutcurrency = value;
    }

    /**
     * Gets the value of the lastupdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTUPDATED() {
        return lastupdated;
    }

    /**
     * Sets the value of the lastupdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTUPDATED(String value) {
        this.lastupdated = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGE() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGE(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the dollarRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDollarRate() {
        return dollarRate;
    }

    /**
     * Sets the value of the dollarRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDollarRate(String value) {
        this.dollarRate = value;
    }

}
