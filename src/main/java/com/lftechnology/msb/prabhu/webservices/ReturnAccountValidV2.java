
package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Return_AccountValid_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return_AccountValid_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMER_MOBILE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMER_EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_NO_OLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISSUE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return_AccountValid_V2", propOrder = {
    "code",
    "agentsessionid",
    "message",
    "customername",
    "customermobileno",
    "customeremail",
    "accountno",
    "accountnoold",
    "branchname",
    "idtype",
    "idnumber",
    "issuedate",
    "expirydate"
})
public class ReturnAccountValidV2 {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "CUSTOMER_NAME")
    protected String customername;
    @XmlElement(name = "CUSTOMER_MOBILE_NO")
    protected String customermobileno;
    @XmlElement(name = "CUSTOMER_EMAIL")
    protected String customeremail;
    @XmlElement(name = "ACCOUNT_NO")
    protected String accountno;
    @XmlElement(name = "ACCOUNT_NO_OLD")
    protected String accountnoold;
    @XmlElement(name = "BRANCH_NAME")
    protected String branchname;
    @XmlElement(name = "ID_TYPE")
    protected String idtype;
    @XmlElement(name = "ID_NUMBER")
    protected String idnumber;
    @XmlElement(name = "ISSUE_DATE")
    protected String issuedate;
    @XmlElement(name = "EXPIRY_DATE")
    protected String expirydate;

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
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNAME() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNAME(String value) {
        this.customername = value;
    }

    /**
     * Gets the value of the customermobileno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERMOBILENO() {
        return customermobileno;
    }

    /**
     * Sets the value of the customermobileno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERMOBILENO(String value) {
        this.customermobileno = value;
    }

    /**
     * Gets the value of the customeremail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMEREMAIL() {
        return customeremail;
    }

    /**
     * Sets the value of the customeremail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMEREMAIL(String value) {
        this.customeremail = value;
    }

    /**
     * Gets the value of the accountno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNO() {
        return accountno;
    }

    /**
     * Sets the value of the accountno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNO(String value) {
        this.accountno = value;
    }

    /**
     * Gets the value of the accountnoold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNOOLD() {
        return accountnoold;
    }

    /**
     * Sets the value of the accountnoold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNOOLD(String value) {
        this.accountnoold = value;
    }

    /**
     * Gets the value of the branchname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHNAME() {
        return branchname;
    }

    /**
     * Sets the value of the branchname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHNAME(String value) {
        this.branchname = value;
    }

    /**
     * Gets the value of the idtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTYPE() {
        return idtype;
    }

    /**
     * Sets the value of the idtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTYPE(String value) {
        this.idtype = value;
    }

    /**
     * Gets the value of the idnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNUMBER() {
        return idnumber;
    }

    /**
     * Sets the value of the idnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNUMBER(String value) {
        this.idnumber = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUEDATE(String value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPIRYDATE(String value) {
        this.expirydate = value;
    }

}
