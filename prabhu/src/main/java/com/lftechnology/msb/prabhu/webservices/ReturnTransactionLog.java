package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Return_TransactionLog complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Return_TransactionLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return_TransactionLog", propOrder = {
        "code",
        "message",
        "logDate"
})
public class ReturnTransactionLog {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "LogDate")
    protected String logDate;

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
     * Gets the value of the logDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLogDate() {
        return logDate;
    }

    /**
     * Sets the value of the logDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLogDate(String value) {
        this.logDate = value;
    }

}
