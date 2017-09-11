
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
 *         &lt;element name="AGENT_TXNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_MOBILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_ID_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_ID_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_ID_ISSUE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_ID_EXPIRE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_CONTACT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANSFERAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYMENTMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANKID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CALC_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHORIZED_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_BRANCH_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_BRANCHID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_SOURCE_OF_FUND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_BENEFICIARY_RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PURPOSE_OF_REMITTANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAIVE_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROMOTIONAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_SOCIAL_SECURITY_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "agenttxnid",
    "locationid",
    "sendername",
    "senderaddress",
    "sendermobile",
    "sendercity",
    "sendercountry",
    "senderidtype",
    "senderidnumber",
    "senderidissuedate",
    "senderidexpiredate",
    "senderdateofbirth",
    "receivername",
    "receiveraddress",
    "receivercontactnumber",
    "receivercity",
    "receivercountry",
    "transferamount",
    "paymentmode",
    "bankid",
    "bankaccountnumber",
    "calcby",
    "authorizedrequired",
    "bankbranchname",
    "bankbranchid",
    "senderoccupation",
    "sendersourceoffund",
    "senderbeneficiaryrelationship",
    "purposeofremittance",
    "waivefee",
    "promotionalcode",
    "sendersocialsecuritynumber"
})
@XmlRootElement(name = "SendTransaction")
public class SendTransaction {

    @XmlElement(name = "AGENT_CODE")
    protected String agentcode;
    @XmlElement(name = "USER_ID")
    protected String userid;
    @XmlElement(name = "PASSWORD")
    protected String password;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "AGENT_TXNID")
    protected String agenttxnid;
    @XmlElement(name = "LOCATION_ID")
    protected String locationid;
    @XmlElement(name = "SENDER_NAME")
    protected String sendername;
    @XmlElement(name = "SENDER_ADDRESS")
    protected String senderaddress;
    @XmlElement(name = "SENDER_MOBILE")
    protected String sendermobile;
    @XmlElement(name = "SENDER_CITY")
    protected String sendercity;
    @XmlElement(name = "SENDER_COUNTRY")
    protected String sendercountry;
    @XmlElement(name = "SENDER_ID_TYPE")
    protected String senderidtype;
    @XmlElement(name = "SENDER_ID_NUMBER")
    protected String senderidnumber;
    @XmlElement(name = "SENDER_ID_ISSUE_DATE")
    protected String senderidissuedate;
    @XmlElement(name = "SENDER_ID_EXPIRE_DATE")
    protected String senderidexpiredate;
    @XmlElement(name = "SENDER_DATE_OF_BIRTH")
    protected String senderdateofbirth;
    @XmlElement(name = "RECEIVER_NAME")
    protected String receivername;
    @XmlElement(name = "RECEIVER_ADDRESS")
    protected String receiveraddress;
    @XmlElement(name = "RECEIVER_CONTACT_NUMBER")
    protected String receivercontactnumber;
    @XmlElement(name = "RECEIVER_CITY")
    protected String receivercity;
    @XmlElement(name = "RECEIVER_COUNTRY")
    protected String receivercountry;
    @XmlElement(name = "TRANSFERAMOUNT")
    protected String transferamount;
    @XmlElement(name = "PAYMENTMODE")
    protected String paymentmode;
    @XmlElement(name = "BANKID")
    protected String bankid;
    @XmlElement(name = "BANK_ACCOUNT_NUMBER")
    protected String bankaccountnumber;
    @XmlElement(name = "CALC_BY")
    protected String calcby;
    @XmlElement(name = "AUTHORIZED_REQUIRED")
    protected String authorizedrequired;
    @XmlElement(name = "BANK_BRANCH_NAME")
    protected String bankbranchname;
    @XmlElement(name = "BANK_BRANCHID")
    protected String bankbranchid;
    @XmlElement(name = "SENDER_OCCUPATION")
    protected String senderoccupation;
    @XmlElement(name = "SENDER_SOURCE_OF_FUND")
    protected String sendersourceoffund;
    @XmlElement(name = "SENDER_BENEFICIARY_RELATIONSHIP")
    protected String senderbeneficiaryrelationship;
    @XmlElement(name = "PURPOSE_OF_REMITTANCE")
    protected String purposeofremittance;
    @XmlElement(name = "WAIVE_FEE")
    protected String waivefee;
    @XmlElement(name = "PROMOTIONAL_CODE")
    protected String promotionalcode;
    @XmlElement(name = "SENDER_SOCIAL_SECURITY_NUMBER")
    protected String sendersocialsecuritynumber;

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
     * Gets the value of the sendername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERNAME() {
        return sendername;
    }

    /**
     * Sets the value of the sendername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERNAME(String value) {
        this.sendername = value;
    }

    /**
     * Gets the value of the senderaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERADDRESS() {
        return senderaddress;
    }

    /**
     * Sets the value of the senderaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERADDRESS(String value) {
        this.senderaddress = value;
    }

    /**
     * Gets the value of the sendermobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERMOBILE() {
        return sendermobile;
    }

    /**
     * Sets the value of the sendermobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERMOBILE(String value) {
        this.sendermobile = value;
    }

    /**
     * Gets the value of the sendercity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERCITY() {
        return sendercity;
    }

    /**
     * Sets the value of the sendercity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERCITY(String value) {
        this.sendercity = value;
    }

    /**
     * Gets the value of the sendercountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERCOUNTRY() {
        return sendercountry;
    }

    /**
     * Sets the value of the sendercountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERCOUNTRY(String value) {
        this.sendercountry = value;
    }

    /**
     * Gets the value of the senderidtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERIDTYPE() {
        return senderidtype;
    }

    /**
     * Sets the value of the senderidtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERIDTYPE(String value) {
        this.senderidtype = value;
    }

    /**
     * Gets the value of the senderidnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERIDNUMBER() {
        return senderidnumber;
    }

    /**
     * Sets the value of the senderidnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERIDNUMBER(String value) {
        this.senderidnumber = value;
    }

    /**
     * Gets the value of the senderidissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERIDISSUEDATE() {
        return senderidissuedate;
    }

    /**
     * Sets the value of the senderidissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERIDISSUEDATE(String value) {
        this.senderidissuedate = value;
    }

    /**
     * Gets the value of the senderidexpiredate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERIDEXPIREDATE() {
        return senderidexpiredate;
    }

    /**
     * Sets the value of the senderidexpiredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERIDEXPIREDATE(String value) {
        this.senderidexpiredate = value;
    }

    /**
     * Gets the value of the senderdateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERDATEOFBIRTH() {
        return senderdateofbirth;
    }

    /**
     * Sets the value of the senderdateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERDATEOFBIRTH(String value) {
        this.senderdateofbirth = value;
    }

    /**
     * Gets the value of the receivername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVERNAME() {
        return receivername;
    }

    /**
     * Sets the value of the receivername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVERNAME(String value) {
        this.receivername = value;
    }

    /**
     * Gets the value of the receiveraddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVERADDRESS() {
        return receiveraddress;
    }

    /**
     * Sets the value of the receiveraddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVERADDRESS(String value) {
        this.receiveraddress = value;
    }

    /**
     * Gets the value of the receivercontactnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVERCONTACTNUMBER() {
        return receivercontactnumber;
    }

    /**
     * Sets the value of the receivercontactnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVERCONTACTNUMBER(String value) {
        this.receivercontactnumber = value;
    }

    /**
     * Gets the value of the receivercity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVERCITY() {
        return receivercity;
    }

    /**
     * Sets the value of the receivercity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVERCITY(String value) {
        this.receivercity = value;
    }

    /**
     * Gets the value of the receivercountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVERCOUNTRY() {
        return receivercountry;
    }

    /**
     * Sets the value of the receivercountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVERCOUNTRY(String value) {
        this.receivercountry = value;
    }

    /**
     * Gets the value of the transferamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFERAMOUNT() {
        return transferamount;
    }

    /**
     * Sets the value of the transferamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFERAMOUNT(String value) {
        this.transferamount = value;
    }

    /**
     * Gets the value of the paymentmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTMODE() {
        return paymentmode;
    }

    /**
     * Sets the value of the paymentmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTMODE(String value) {
        this.paymentmode = value;
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
     * Gets the value of the bankaccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKACCOUNTNUMBER() {
        return bankaccountnumber;
    }

    /**
     * Sets the value of the bankaccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKACCOUNTNUMBER(String value) {
        this.bankaccountnumber = value;
    }

    /**
     * Gets the value of the calcby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALCBY() {
        return calcby;
    }

    /**
     * Sets the value of the calcby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALCBY(String value) {
        this.calcby = value;
    }

    /**
     * Gets the value of the authorizedrequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHORIZEDREQUIRED() {
        return authorizedrequired;
    }

    /**
     * Sets the value of the authorizedrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHORIZEDREQUIRED(String value) {
        this.authorizedrequired = value;
    }

    /**
     * Gets the value of the bankbranchname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKBRANCHNAME() {
        return bankbranchname;
    }

    /**
     * Sets the value of the bankbranchname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKBRANCHNAME(String value) {
        this.bankbranchname = value;
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
     * Gets the value of the senderoccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDEROCCUPATION() {
        return senderoccupation;
    }

    /**
     * Sets the value of the senderoccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDEROCCUPATION(String value) {
        this.senderoccupation = value;
    }

    /**
     * Gets the value of the sendersourceoffund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERSOURCEOFFUND() {
        return sendersourceoffund;
    }

    /**
     * Sets the value of the sendersourceoffund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERSOURCEOFFUND(String value) {
        this.sendersourceoffund = value;
    }

    /**
     * Gets the value of the senderbeneficiaryrelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERBENEFICIARYRELATIONSHIP() {
        return senderbeneficiaryrelationship;
    }

    /**
     * Sets the value of the senderbeneficiaryrelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERBENEFICIARYRELATIONSHIP(String value) {
        this.senderbeneficiaryrelationship = value;
    }

    /**
     * Gets the value of the purposeofremittance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURPOSEOFREMITTANCE() {
        return purposeofremittance;
    }

    /**
     * Sets the value of the purposeofremittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURPOSEOFREMITTANCE(String value) {
        this.purposeofremittance = value;
    }

    /**
     * Gets the value of the waivefee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVEFEE() {
        return waivefee;
    }

    /**
     * Sets the value of the waivefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVEFEE(String value) {
        this.waivefee = value;
    }

    /**
     * Gets the value of the promotionalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROMOTIONALCODE() {
        return promotionalcode;
    }

    /**
     * Sets the value of the promotionalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROMOTIONALCODE(String value) {
        this.promotionalcode = value;
    }

    /**
     * Gets the value of the sendersocialsecuritynumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERSOCIALSECURITYNUMBER() {
        return sendersocialsecuritynumber;
    }

    /**
     * Sets the value of the sendersocialsecuritynumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERSOCIALSECURITYNUMBER(String value) {
        this.sendersocialsecuritynumber = value;
    }

}
