
package prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Return_Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return_Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PINNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_TXNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTIFICATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTIFICATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_AGENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_BENEFICIARY_ID_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_BENEFICIARY_ID_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTIFICATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return_Notification", propOrder = {
    "code",
    "pinno",
    "agenttxnid",
    "notificationtype",
    "notification",
    "notificationdate",
    "payoutagent",
    "payoutbranch",
    "payoutbeneficiaryidtype",
    "payoutbeneficiaryidnumber",
    "agentsessionid",
    "notificationid"
})
public class ReturnNotification {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "PINNO")
    protected String pinno;
    @XmlElement(name = "AGENT_TXNID")
    protected String agenttxnid;
    @XmlElement(name = "NOTIFICATION_TYPE")
    protected String notificationtype;
    @XmlElement(name = "NOTIFICATION")
    protected String notification;
    @XmlElement(name = "NOTIFICATION_DATE")
    protected String notificationdate;
    @XmlElement(name = "PAYOUT_AGENT")
    protected String payoutagent;
    @XmlElement(name = "PAYOUT_BRANCH")
    protected String payoutbranch;
    @XmlElement(name = "PAYOUT_BENEFICIARY_ID_TYPE")
    protected String payoutbeneficiaryidtype;
    @XmlElement(name = "PAYOUT_BENEFICIARY_ID_NUMBER")
    protected String payoutbeneficiaryidnumber;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "NOTIFICATION_ID")
    protected String notificationid;

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
     * Gets the value of the pinno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINNO() {
        return pinno;
    }

    /**
     * Sets the value of the pinno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINNO(String value) {
        this.pinno = value;
    }

    /**
     * Gets the value of the agenttxnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENTTXNID() {
        return agenttxnid;
    }

    /**
     * Sets the value of the agenttxnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENTTXNID(String value) {
        this.agenttxnid = value;
    }

    /**
     * Gets the value of the notificationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFICATIONTYPE() {
        return notificationtype;
    }

    /**
     * Sets the value of the notificationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFICATIONTYPE(String value) {
        this.notificationtype = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFICATION() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFICATION(String value) {
        this.notification = value;
    }

    /**
     * Gets the value of the notificationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFICATIONDATE() {
        return notificationdate;
    }

    /**
     * Sets the value of the notificationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFICATIONDATE(String value) {
        this.notificationdate = value;
    }

    /**
     * Gets the value of the payoutagent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTAGENT() {
        return payoutagent;
    }

    /**
     * Sets the value of the payoutagent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTAGENT(String value) {
        this.payoutagent = value;
    }

    /**
     * Gets the value of the payoutbranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTBRANCH() {
        return payoutbranch;
    }

    /**
     * Sets the value of the payoutbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTBRANCH(String value) {
        this.payoutbranch = value;
    }

    /**
     * Gets the value of the payoutbeneficiaryidtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTBENEFICIARYIDTYPE() {
        return payoutbeneficiaryidtype;
    }

    /**
     * Sets the value of the payoutbeneficiaryidtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTBENEFICIARYIDTYPE(String value) {
        this.payoutbeneficiaryidtype = value;
    }

    /**
     * Gets the value of the payoutbeneficiaryidnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTBENEFICIARYIDNUMBER() {
        return payoutbeneficiaryidnumber;
    }

    /**
     * Sets the value of the payoutbeneficiaryidnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTBENEFICIARYIDNUMBER(String value) {
        this.payoutbeneficiaryidnumber = value;
    }

    /**
     * Gets the value of the agentsessionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENTSESSIONID() {
        return agentsessionid;
    }

    /**
     * Sets the value of the agentsessionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENTSESSIONID(String value) {
        this.agentsessionid = value;
    }

    /**
     * Gets the value of the notificationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFICATIONID() {
        return notificationid;
    }

    /**
     * Sets the value of the notificationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFICATIONID(String value) {
        this.notificationid = value;
    }

}
