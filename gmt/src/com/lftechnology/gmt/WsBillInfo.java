
package com.lftechnology.gmt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsBillInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsBillInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillLocalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BillLocalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsBillInfo", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "billAccount",
    "billErrorCode",
    "billInvoice",
    "billInvoiceDate",
    "billLocalAmount",
    "billLocalCurrency",
    "billMessage",
    "billName",
    "billerId"
})
public class WsBillInfo {

    @XmlElementRef(name = "BillAccount", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billAccount;
    @XmlElementRef(name = "BillErrorCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billErrorCode;
    @XmlElementRef(name = "BillInvoice", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billInvoice;
    @XmlElementRef(name = "BillInvoiceDate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billInvoiceDate;
    @XmlElement(name = "BillLocalAmount")
    protected Double billLocalAmount;
    @XmlElementRef(name = "BillLocalCurrency", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billLocalCurrency;
    @XmlElementRef(name = "BillMessage", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billMessage;
    @XmlElementRef(name = "BillName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billName;
    @XmlElement(name = "BillerId")
    protected Integer billerId;

    /**
     * Gets the value of the billAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillAccount() {
        return billAccount;
    }

    /**
     * Sets the value of the billAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillAccount(JAXBElement<String> value) {
        this.billAccount = value;
    }

    /**
     * Gets the value of the billErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillErrorCode() {
        return billErrorCode;
    }

    /**
     * Sets the value of the billErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillErrorCode(JAXBElement<String> value) {
        this.billErrorCode = value;
    }

    /**
     * Gets the value of the billInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillInvoice() {
        return billInvoice;
    }

    /**
     * Sets the value of the billInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillInvoice(JAXBElement<String> value) {
        this.billInvoice = value;
    }

    /**
     * Gets the value of the billInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillInvoiceDate() {
        return billInvoiceDate;
    }

    /**
     * Sets the value of the billInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillInvoiceDate(JAXBElement<String> value) {
        this.billInvoiceDate = value;
    }

    /**
     * Gets the value of the billLocalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBillLocalAmount() {
        return billLocalAmount;
    }

    /**
     * Sets the value of the billLocalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBillLocalAmount(Double value) {
        this.billLocalAmount = value;
    }

    /**
     * Gets the value of the billLocalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillLocalCurrency() {
        return billLocalCurrency;
    }

    /**
     * Sets the value of the billLocalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillLocalCurrency(JAXBElement<String> value) {
        this.billLocalCurrency = value;
    }

    /**
     * Gets the value of the billMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillMessage() {
        return billMessage;
    }

    /**
     * Sets the value of the billMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillMessage(JAXBElement<String> value) {
        this.billMessage = value;
    }

    /**
     * Gets the value of the billName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillName() {
        return billName;
    }

    /**
     * Sets the value of the billName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillName(JAXBElement<String> value) {
        this.billName = value;
    }

    /**
     * Gets the value of the billerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillerId(Integer value) {
        this.billerId = value;
    }

}
