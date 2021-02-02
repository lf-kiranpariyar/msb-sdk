package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANSFERAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYMENTMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CALC_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAIVE_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROMOTIONAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "agentcode",
        "userid",
        "password",
        "agentsessionid",
        "transferamount",
        "paymentmode",
        "calcby",
        "locationid",
        "payoutcountry",
        "waivefee",
        "promotionalcode"
})
@XmlRootElement(name = "GetEXRate")
public class GetEXRate {

    @XmlElement(name = "AGENT_CODE")
    protected String agentcode;
    @XmlElement(name = "USER_ID")
    protected String userid;
    @XmlElement(name = "PASSWORD")
    protected String password;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "TRANSFERAMOUNT")
    protected String transferamount;
    @XmlElement(name = "PAYMENTMODE")
    protected String paymentmode;
    @XmlElement(name = "CALC_BY")
    protected String calcby;
    @XmlElement(name = "LOCATION_ID")
    protected String locationid;
    @XmlElement(name = "PAYOUT_COUNTRY")
    protected String payoutcountry;
    @XmlElement(name = "WAIVE_FEE")
    protected String waivefee;
    @XmlElement(name = "PROMOTIONAL_CODE")
    protected String promotionalcode;

    /**
     * Gets the value of the agentcode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAGENTCODE() {
        return agentcode;
    }

    /**
     * Sets the value of the agentcode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAGENTCODE(String value) {
        this.agentcode = value;
    }

    /**
     * Gets the value of the userid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPASSWORD() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPASSWORD(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the agentsessionid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAGENTSESSIONID() {
        return agentsessionid;
    }

    /**
     * Sets the value of the agentsessionid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAGENTSESSIONID(String value) {
        this.agentsessionid = value;
    }

    /**
     * Gets the value of the transferamount property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTRANSFERAMOUNT() {
        return transferamount;
    }

    /**
     * Sets the value of the transferamount property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTRANSFERAMOUNT(String value) {
        this.transferamount = value;
    }

    /**
     * Gets the value of the paymentmode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPAYMENTMODE() {
        return paymentmode;
    }

    /**
     * Sets the value of the paymentmode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPAYMENTMODE(String value) {
        this.paymentmode = value;
    }

    /**
     * Gets the value of the calcby property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCALCBY() {
        return calcby;
    }

    /**
     * Sets the value of the calcby property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCALCBY(String value) {
        this.calcby = value;
    }

    /**
     * Gets the value of the locationid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLOCATIONID() {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLOCATIONID(String value) {
        this.locationid = value;
    }

    /**
     * Gets the value of the payoutcountry property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPAYOUTCOUNTRY() {
        return payoutcountry;
    }

    /**
     * Sets the value of the payoutcountry property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPAYOUTCOUNTRY(String value) {
        this.payoutcountry = value;
    }

    /**
     * Gets the value of the waivefee property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWAIVEFEE() {
        return waivefee;
    }

    /**
     * Sets the value of the waivefee property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWAIVEFEE(String value) {
        this.waivefee = value;
    }

    /**
     * Gets the value of the promotionalcode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPROMOTIONALCODE() {
        return promotionalcode;
    }

    /**
     * Sets the value of the promotionalcode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPROMOTIONALCODE(String value) {
        this.promotionalcode = value;
    }

}
