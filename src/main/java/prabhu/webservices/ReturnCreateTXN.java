
package prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Return_CreateTXN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return_CreateTXN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PINNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_TXNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COLLECT_AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COLLECT_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERVICE_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUTAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUTCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TXN_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTNER_SETTLEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTNER_CCYRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDITIONAL_PREMIUM_RATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUT_SERVICE_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return_CreateTXN", propOrder = {
    "code",
    "agentsessionid",
    "message",
    "pinno",
    "agenttxnid",
    "collectamt",
    "collectcurrency",
    "exchangerate",
    "servicecharge",
    "payoutamt",
    "payoutcurrency",
    "txndate",
    "partnersettlement",
    "partnerccyrate",
    "additionalpremiumrate",
    "feediscount",
    "payoutservicecharge"
})
public class ReturnCreateTXN {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "PINNO")
    protected String pinno;
    @XmlElement(name = "AGENT_TXNID")
    protected String agenttxnid;
    @XmlElement(name = "COLLECT_AMT")
    protected String collectamt;
    @XmlElement(name = "COLLECT_CURRENCY")
    protected String collectcurrency;
    @XmlElement(name = "EXCHANGE_RATE")
    protected String exchangerate;
    @XmlElement(name = "SERVICE_CHARGE")
    protected String servicecharge;
    @XmlElement(name = "PAYOUTAMT")
    protected String payoutamt;
    @XmlElement(name = "PAYOUTCURRENCY")
    protected String payoutcurrency;
    @XmlElement(name = "TXN_DATE")
    protected String txndate;
    @XmlElement(name = "PARTNER_SETTLEMENT")
    protected String partnersettlement;
    @XmlElement(name = "PARTNER_CCYRATE")
    protected String partnerccyrate;
    @XmlElement(name = "ADDITIONAL_PREMIUM_RATE")
    protected String additionalpremiumrate;
    @XmlElement(name = "FEE_DISCOUNT")
    protected String feediscount;
    @XmlElement(name = "PAYOUT_SERVICE_CHARGE")
    protected String payoutservicecharge;

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
     * Gets the value of the collectamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLLECTAMT() {
        return collectamt;
    }

    /**
     * Sets the value of the collectamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLLECTAMT(String value) {
        this.collectamt = value;
    }

    /**
     * Gets the value of the collectcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLLECTCURRENCY() {
        return collectcurrency;
    }

    /**
     * Sets the value of the collectcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLLECTCURRENCY(String value) {
        this.collectcurrency = value;
    }

    /**
     * Gets the value of the exchangerate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCHANGERATE() {
        return exchangerate;
    }

    /**
     * Sets the value of the exchangerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCHANGERATE(String value) {
        this.exchangerate = value;
    }

    /**
     * Gets the value of the servicecharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICECHARGE() {
        return servicecharge;
    }

    /**
     * Sets the value of the servicecharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICECHARGE(String value) {
        this.servicecharge = value;
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
     * Gets the value of the txndate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNDATE() {
        return txndate;
    }

    /**
     * Sets the value of the txndate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNDATE(String value) {
        this.txndate = value;
    }

    /**
     * Gets the value of the partnersettlement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTNERSETTLEMENT() {
        return partnersettlement;
    }

    /**
     * Sets the value of the partnersettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTNERSETTLEMENT(String value) {
        this.partnersettlement = value;
    }

    /**
     * Gets the value of the partnerccyrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTNERCCYRATE() {
        return partnerccyrate;
    }

    /**
     * Sets the value of the partnerccyrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTNERCCYRATE(String value) {
        this.partnerccyrate = value;
    }

    /**
     * Gets the value of the additionalpremiumrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDITIONALPREMIUMRATE() {
        return additionalpremiumrate;
    }

    /**
     * Sets the value of the additionalpremiumrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDITIONALPREMIUMRATE(String value) {
        this.additionalpremiumrate = value;
    }

    /**
     * Gets the value of the feediscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEEDISCOUNT() {
        return feediscount;
    }

    /**
     * Sets the value of the feediscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEEDISCOUNT(String value) {
        this.feediscount = value;
    }

    /**
     * Gets the value of the payoutservicecharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTSERVICECHARGE() {
        return payoutservicecharge;
    }

    /**
     * Sets the value of the payoutservicecharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTSERVICECHARGE(String value) {
        this.payoutservicecharge = value;
    }

}
