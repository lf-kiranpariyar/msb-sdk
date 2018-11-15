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
 *         &lt;element name="NOTIFICATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "notificationid",
        "agentsessionid"
})
@XmlRootElement(name = "NotificationReceived")
public class NotificationReceived {

    @XmlElement(name = "AGENT_CODE")
    protected String agentcode;
    @XmlElement(name = "USER_ID")
    protected String userid;
    @XmlElement(name = "PASSWORD")
    protected String password;
    @XmlElement(name = "NOTIFICATION_ID")
    protected String notificationid;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;

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
     * Gets the value of the notificationid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNOTIFICATIONID() {
        return notificationid;
    }

    /**
     * Sets the value of the notificationid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNOTIFICATIONID(String value) {
        this.notificationid = value;
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

}
