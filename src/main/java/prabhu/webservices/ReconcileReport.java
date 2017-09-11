
package prabhu.webservices;

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
 *         &lt;element name="AGENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REPORT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FROM_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FROM_DATE_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TO_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TO_DATE_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHOW_INCREMENTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "agentcode",
    "userid",
    "password",
    "agentsessionid",
    "reporttype",
    "fromdate",
    "fromdatetime",
    "todate",
    "todatetime",
    "showincremental"
})
@XmlRootElement(name = "ReconcileReport")
public class ReconcileReport {

    @XmlElement(name = "AGENT_CODE")
    protected String agentcode;
    @XmlElement(name = "USER_ID")
    protected String userid;
    @XmlElement(name = "PASSWORD")
    protected String password;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "REPORT_TYPE")
    protected String reporttype;
    @XmlElement(name = "FROM_DATE")
    protected String fromdate;
    @XmlElement(name = "FROM_DATE_TIME")
    protected String fromdatetime;
    @XmlElement(name = "TO_DATE")
    protected String todate;
    @XmlElement(name = "TO_DATE_TIME")
    protected String todatetime;
    @XmlElement(name = "SHOW_INCREMENTAL")
    protected String showincremental;

    /**
     * Gets the value of the agentcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENTCODE() {
        return agentcode;
    }

    /**
     * Sets the value of the agentcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENTCODE(String value) {
        this.agentcode = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORD() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORD(String value) {
        this.password = value;
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
     * Gets the value of the reporttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTTYPE() {
        return reporttype;
    }

    /**
     * Sets the value of the reporttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTTYPE(String value) {
        this.reporttype = value;
    }

    /**
     * Gets the value of the fromdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROMDATE() {
        return fromdate;
    }

    /**
     * Sets the value of the fromdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROMDATE(String value) {
        this.fromdate = value;
    }

    /**
     * Gets the value of the fromdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROMDATETIME() {
        return fromdatetime;
    }

    /**
     * Sets the value of the fromdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROMDATETIME(String value) {
        this.fromdatetime = value;
    }

    /**
     * Gets the value of the todate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTODATE() {
        return todate;
    }

    /**
     * Sets the value of the todate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTODATE(String value) {
        this.todate = value;
    }

    /**
     * Gets the value of the todatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTODATETIME() {
        return todatetime;
    }

    /**
     * Sets the value of the todatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTODATETIME(String value) {
        this.todatetime = value;
    }

    /**
     * Gets the value of the showincremental property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHOWINCREMENTAL() {
        return showincremental;
    }

    /**
     * Sets the value of the showincremental property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHOWINCREMENTAL(String value) {
        this.showincremental = value;
    }

}
