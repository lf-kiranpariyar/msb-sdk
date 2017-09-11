
package prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Return_AGENTLIST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return_AGENTLIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCATIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANKID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_BRANCHID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_BRANCHSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPTIONAL_FIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return_AGENTLIST", propOrder = {
    "code",
    "agentsessionid",
    "message",
    "locationid",
    "agent",
    "branch",
    "address",
    "city",
    "currency",
    "bankid",
    "bankbranchid",
    "bankbranchstate",
    "optionalfield",
    "agentcode"
})
public class ReturnAGENTLIST {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "LOCATIONID")
    protected String locationid;
    @XmlElement(name = "AGENT")
    protected String agent;
    @XmlElement(name = "BRANCH")
    protected String branch;
    @XmlElement(name = "ADDRESS")
    protected String address;
    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "BANKID")
    protected String bankid;
    @XmlElement(name = "BANK_BRANCHID")
    protected String bankbranchid;
    @XmlElement(name = "BANK_BRANCHSTATE")
    protected String bankbranchstate;
    @XmlElement(name = "OPTIONAL_FIELD")
    protected String optionalfield;
    @XmlElement(name = "AGENT_CODE")
    protected String agentcode;

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
     * Gets the value of the locationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONID() {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONID(String value) {
        this.locationid = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENT() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENT(String value) {
        this.agent = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the bankid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKID() {
        return bankid;
    }

    /**
     * Sets the value of the bankid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKID(String value) {
        this.bankid = value;
    }

    /**
     * Gets the value of the bankbranchid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKBRANCHID() {
        return bankbranchid;
    }

    /**
     * Sets the value of the bankbranchid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKBRANCHID(String value) {
        this.bankbranchid = value;
    }

    /**
     * Gets the value of the bankbranchstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKBRANCHSTATE() {
        return bankbranchstate;
    }

    /**
     * Sets the value of the bankbranchstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKBRANCHSTATE(String value) {
        this.bankbranchstate = value;
    }

    /**
     * Gets the value of the optionalfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTIONALFIELD() {
        return optionalfield;
    }

    /**
     * Sets the value of the optionalfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTIONALFIELD(String value) {
        this.optionalfield = value;
    }

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

}
