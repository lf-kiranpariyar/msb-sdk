
package com.lftechnology.gmt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_Contact_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_Error_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_License" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_RTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_RTR_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsResponse", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "error",
    "message",
    "password",
    "receipt",
    "receiptContact",
    "receiptContactEN",
    "receiptError",
    "receiptErrorEN",
    "receiptLicense",
    "receiptRTR",
    "receiptRTREN",
    "receiverID",
    "senderID",
    "status",
    "valid"
})
public class WsResponse {

    @XmlElement(name = "Error")
    protected Integer error;
    @XmlElementRef(name = "Message", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "Password", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "Receipt", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receipt;
    @XmlElementRef(name = "Receipt_Contact", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptContact;
    @XmlElementRef(name = "Receipt_Contact_EN", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptContactEN;
    @XmlElementRef(name = "Receipt_Error", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptError;
    @XmlElementRef(name = "Receipt_Error_EN", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptErrorEN;
    @XmlElementRef(name = "Receipt_License", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptLicense;
    @XmlElementRef(name = "Receipt_RTR", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptRTR;
    @XmlElementRef(name = "Receipt_RTR_EN", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptRTREN;
    @XmlElement(name = "ReceiverID")
    protected Integer receiverID;
    @XmlElement(name = "SenderID")
    protected Integer senderID;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElement(name = "Valid")
    protected Boolean valid;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setError(Integer value) {
        this.error = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceipt(JAXBElement<String> value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the receiptContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptContact() {
        return receiptContact;
    }

    /**
     * Sets the value of the receiptContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptContact(JAXBElement<String> value) {
        this.receiptContact = value;
    }

    /**
     * Gets the value of the receiptContactEN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptContactEN() {
        return receiptContactEN;
    }

    /**
     * Sets the value of the receiptContactEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptContactEN(JAXBElement<String> value) {
        this.receiptContactEN = value;
    }

    /**
     * Gets the value of the receiptError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptError() {
        return receiptError;
    }

    /**
     * Sets the value of the receiptError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptError(JAXBElement<String> value) {
        this.receiptError = value;
    }

    /**
     * Gets the value of the receiptErrorEN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptErrorEN() {
        return receiptErrorEN;
    }

    /**
     * Sets the value of the receiptErrorEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptErrorEN(JAXBElement<String> value) {
        this.receiptErrorEN = value;
    }

    /**
     * Gets the value of the receiptLicense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptLicense() {
        return receiptLicense;
    }

    /**
     * Sets the value of the receiptLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptLicense(JAXBElement<String> value) {
        this.receiptLicense = value;
    }

    /**
     * Gets the value of the receiptRTR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptRTR() {
        return receiptRTR;
    }

    /**
     * Sets the value of the receiptRTR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptRTR(JAXBElement<String> value) {
        this.receiptRTR = value;
    }

    /**
     * Gets the value of the receiptRTREN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptRTREN() {
        return receiptRTREN;
    }

    /**
     * Sets the value of the receiptRTREN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptRTREN(JAXBElement<String> value) {
        this.receiptRTREN = value;
    }

    /**
     * Gets the value of the receiverID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiverID() {
        return receiverID;
    }

    /**
     * Sets the value of the receiverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiverID(Integer value) {
        this.receiverID = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSenderID(Integer value) {
        this.senderID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

}
