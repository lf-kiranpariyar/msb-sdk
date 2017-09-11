
package prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Return_TRANSREPORT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return_TRANSREPORT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANSACTION_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PINNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_ID_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_CONTACT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_CONTACT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMIT_AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMIT_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMIT_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMIT_EXRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANSACTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANSACTION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPROVE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPROVE_USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_BRANCH_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAID_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_AGENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CANCEL_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return_TRANSREPORT", propOrder = {
    "code",
    "agentname",
    "agentbranch",
    "transactionstatus",
    "pinno",
    "sendername",
    "senderidtype",
    "senderid",
    "sendernationality",
    "senderaddress",
    "sendercontactno",
    "receivername",
    "receivercountry",
    "receiveraddress",
    "receivercontactno",
    "remitamt",
    "remitccy",
    "remitcharge",
    "remitexrate",
    "payoutamt",
    "payoutccy",
    "transactiontype",
    "transactiondate",
    "userid",
    "approvedate",
    "approveuserid",
    "bankname",
    "bankbranchname",
    "bankaccountnumber",
    "status",
    "paiddate",
    "payoutagent",
    "canceldate",
    "message",
    "agentsessionid"
})
public class ReturnTRANSREPORT {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "AGENT_NAME")
    protected String agentname;
    @XmlElement(name = "AGENT_BRANCH")
    protected String agentbranch;
    @XmlElement(name = "TRANSACTION_STATUS")
    protected String transactionstatus;
    @XmlElement(name = "PINNO")
    protected String pinno;
    @XmlElement(name = "SENDER_NAME")
    protected String sendername;
    @XmlElement(name = "SENDER_ID_TYPE")
    protected String senderidtype;
    @XmlElement(name = "SENDER_ID")
    protected String senderid;
    @XmlElement(name = "SENDER_NATIONALITY")
    protected String sendernationality;
    @XmlElement(name = "SENDER_ADDRESS")
    protected String senderaddress;
    @XmlElement(name = "SENDER_CONTACT_NO")
    protected String sendercontactno;
    @XmlElement(name = "RECEIVER_NAME")
    protected String receivername;
    @XmlElement(name = "RECEIVER_COUNTRY")
    protected String receivercountry;
    @XmlElement(name = "RECEIVER_ADDRESS")
    protected String receiveraddress;
    @XmlElement(name = "RECEIVER_CONTACT_NO")
    protected String receivercontactno;
    @XmlElement(name = "REMIT_AMT")
    protected String remitamt;
    @XmlElement(name = "REMIT_CCY")
    protected String remitccy;
    @XmlElement(name = "REMIT_CHARGE")
    protected String remitcharge;
    @XmlElement(name = "REMIT_EXRATE")
    protected String remitexrate;
    @XmlElement(name = "PAYOUT_AMT")
    protected String payoutamt;
    @XmlElement(name = "PAYOUT_CCY")
    protected String payoutccy;
    @XmlElement(name = "TRANSACTION_TYPE")
    protected String transactiontype;
    @XmlElement(name = "TRANSACTION_DATE")
    protected String transactiondate;
    @XmlElement(name = "USER_ID")
    protected String userid;
    @XmlElement(name = "APPROVE_DATE")
    protected String approvedate;
    @XmlElement(name = "APPROVE_USER_ID")
    protected String approveuserid;
    @XmlElement(name = "BANK_NAME")
    protected String bankname;
    @XmlElement(name = "BANK_BRANCH_NAME")
    protected String bankbranchname;
    @XmlElement(name = "BANK_ACCOUNT_NUMBER")
    protected String bankaccountnumber;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "PAID_DATE")
    protected String paiddate;
    @XmlElement(name = "PAYOUT_AGENT")
    protected String payoutagent;
    @XmlElement(name = "CANCEL_DATE")
    protected String canceldate;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;

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
     * Gets the value of the agentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENTNAME() {
        return agentname;
    }

    /**
     * Sets the value of the agentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENTNAME(String value) {
        this.agentname = value;
    }

    /**
     * Gets the value of the agentbranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENTBRANCH() {
        return agentbranch;
    }

    /**
     * Sets the value of the agentbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENTBRANCH(String value) {
        this.agentbranch = value;
    }

    /**
     * Gets the value of the transactionstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONSTATUS() {
        return transactionstatus;
    }

    /**
     * Sets the value of the transactionstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONSTATUS(String value) {
        this.transactionstatus = value;
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
     * Gets the value of the senderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERID() {
        return senderid;
    }

    /**
     * Sets the value of the senderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERID(String value) {
        this.senderid = value;
    }

    /**
     * Gets the value of the sendernationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERNATIONALITY() {
        return sendernationality;
    }

    /**
     * Sets the value of the sendernationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERNATIONALITY(String value) {
        this.sendernationality = value;
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
     * Gets the value of the sendercontactno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERCONTACTNO() {
        return sendercontactno;
    }

    /**
     * Sets the value of the sendercontactno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERCONTACTNO(String value) {
        this.sendercontactno = value;
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
     * Gets the value of the receivercontactno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVERCONTACTNO() {
        return receivercontactno;
    }

    /**
     * Sets the value of the receivercontactno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVERCONTACTNO(String value) {
        this.receivercontactno = value;
    }

    /**
     * Gets the value of the remitamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMITAMT() {
        return remitamt;
    }

    /**
     * Sets the value of the remitamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMITAMT(String value) {
        this.remitamt = value;
    }

    /**
     * Gets the value of the remitccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMITCCY() {
        return remitccy;
    }

    /**
     * Sets the value of the remitccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMITCCY(String value) {
        this.remitccy = value;
    }

    /**
     * Gets the value of the remitcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMITCHARGE() {
        return remitcharge;
    }

    /**
     * Sets the value of the remitcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMITCHARGE(String value) {
        this.remitcharge = value;
    }

    /**
     * Gets the value of the remitexrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMITEXRATE() {
        return remitexrate;
    }

    /**
     * Sets the value of the remitexrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMITEXRATE(String value) {
        this.remitexrate = value;
    }

    /**
     * Gets the value of the payoutamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTAMT() {
        return payoutamt;
    }

    /**
     * Sets the value of the payoutamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTAMT(String value) {
        this.payoutamt = value;
    }

    /**
     * Gets the value of the payoutccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTCCY() {
        return payoutccy;
    }

    /**
     * Sets the value of the payoutccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTCCY(String value) {
        this.payoutccy = value;
    }

    /**
     * Gets the value of the transactiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONTYPE() {
        return transactiontype;
    }

    /**
     * Sets the value of the transactiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONTYPE(String value) {
        this.transactiontype = value;
    }

    /**
     * Gets the value of the transactiondate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONDATE() {
        return transactiondate;
    }

    /**
     * Sets the value of the transactiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONDATE(String value) {
        this.transactiondate = value;
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
     * Gets the value of the approvedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPROVEDATE() {
        return approvedate;
    }

    /**
     * Sets the value of the approvedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPROVEDATE(String value) {
        this.approvedate = value;
    }

    /**
     * Gets the value of the approveuserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPROVEUSERID() {
        return approveuserid;
    }

    /**
     * Sets the value of the approveuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPROVEUSERID(String value) {
        this.approveuserid = value;
    }

    /**
     * Gets the value of the bankname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKNAME() {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKNAME(String value) {
        this.bankname = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the paiddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIDDATE() {
        return paiddate;
    }

    /**
     * Sets the value of the paiddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIDDATE(String value) {
        this.paiddate = value;
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
     * Gets the value of the canceldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELDATE() {
        return canceldate;
    }

    /**
     * Sets the value of the canceldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELDATE(String value) {
        this.canceldate = value;
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

}
