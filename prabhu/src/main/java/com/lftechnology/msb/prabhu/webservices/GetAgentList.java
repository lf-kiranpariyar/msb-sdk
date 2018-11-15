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
 *         &lt;element name="PAYMENTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_BRANCHSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "paymenttype",
        "payoutcountry",
        "bankname",
        "bankbranchstate"
})
@XmlRootElement(name = "GetAgentList")
public class GetAgentList {

    @XmlElement(name = "AGENT_CODE")
    protected String agentcode;
    @XmlElement(name = "USER_ID")
    protected String userid;
    @XmlElement(name = "PASSWORD")
    protected String password;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "PAYMENTTYPE")
    protected String paymenttype;
    @XmlElement(name = "PAYOUT_COUNTRY")
    protected String payoutcountry;
    @XmlElement(name = "BANK_NAME")
    protected String bankname;
    @XmlElement(name = "BANK_BRANCHSTATE")
    protected String bankbranchstate;

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
     * Gets the value of the paymenttype property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPAYMENTTYPE() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPAYMENTTYPE(String value) {
        this.paymenttype = value;
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
     * Gets the value of the bankname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBANKNAME() {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBANKNAME(String value) {
        this.bankname = value;
    }

    /**
     * Gets the value of the bankbranchstate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBANKBRANCHSTATE() {
        return bankbranchstate;
    }

    /**
     * Sets the value of the bankbranchstate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBANKBRANCHSTATE(String value) {
        this.bankbranchstate = value;
    }

}
