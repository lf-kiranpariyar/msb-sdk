package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Return_TXNAuth complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Return_TXNAuth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENT_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PINNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUTAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOUTCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return_TXNAuth", propOrder = {
        "code",
        "agentsessionid",
        "message",
        "pinno",
        "sendername",
        "payoutamt",
        "payoutcurrency"
})
public class ReturnTXNAuth {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "AGENT_SESSION_ID")
    protected String agentsessionid;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "PINNO")
    protected String pinno;
    @XmlElement(name = "SENDER_NAME")
    protected String sendername;
    @XmlElement(name = "PAYOUTAMT")
    protected String payoutamt;
    @XmlElement(name = "PAYOUTCURRENCY")
    protected String payoutcurrency;

    /**
     * Gets the value of the code property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCODE(String value) {
        this.code = value;
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
     * Gets the value of the message property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMESSAGE() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMESSAGE(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the pinno property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPINNO() {
        return pinno;
    }

    /**
     * Sets the value of the pinno property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPINNO(String value) {
        this.pinno = value;
    }

    /**
     * Gets the value of the sendername property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSENDERNAME() {
        return sendername;
    }

    /**
     * Sets the value of the sendername property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSENDERNAME(String value) {
        this.sendername = value;
    }

    /**
     * Gets the value of the payoutamt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPAYOUTAMT() {
        return payoutamt;
    }

    /**
     * Sets the value of the payoutamt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPAYOUTAMT(String value) {
        this.payoutamt = value;
    }

    /**
     * Gets the value of the payoutcurrency property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPAYOUTCURRENCY() {
        return payoutcurrency;
    }

    /**
     * Sets the value of the payoutcurrency property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPAYOUTCURRENCY(String value) {
        this.payoutcurrency = value;
    }

}
