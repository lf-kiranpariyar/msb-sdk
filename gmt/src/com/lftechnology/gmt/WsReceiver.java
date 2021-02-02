
package com.lftechnology.gmt;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for wsReceiver complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsReceiver"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReceiverActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverAverageMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverBirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverCountryNationallity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverDocExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverFileImg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverFileImg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverIdIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverLastTransaction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverMaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverMoneyOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverOccupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverPEP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverPOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsReceiver", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "receiverActive",
    "receiverAddress",
    "receiverAverageMonth",
    "receiverBirthDate",
    "receiverCity",
    "receiverCompany",
    "receiverCountry",
    "receiverCountryNationallity",
    "receiverCurrency",
    "receiverDocExpiration",
    "receiverEmail",
    "receiverFileImg",
    "receiverFileImg2",
    "receiverGender",
    "receiverId",
    "receiverIdIssuer",
    "receiverIdNumber",
    "receiverIdType",
    "receiverLastName",
    "receiverLastTransaction",
    "receiverMaritalStatus",
    "receiverMobile",
    "receiverMoneyOrigin",
    "receiverName",
    "receiverOccupation",
    "receiverOfficeCode",
    "receiverPEP",
    "receiverPOB",
    "receiverPhone",
    "receiverPicture",
    "receiverRemark",
    "receiverState",
    "receiverZip",
    "senderID"
})
public class WsReceiver {

    @XmlElement(name = "ReceiverActive")
    protected Boolean receiverActive;
    @XmlElementRef(name = "ReceiverAddress", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverAddress;
    @XmlElement(name = "ReceiverAverageMonth")
    protected BigDecimal receiverAverageMonth;
    @XmlElementRef(name = "ReceiverBirthDate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> receiverBirthDate;
    @XmlElementRef(name = "ReceiverCity", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverCity;
    @XmlElementRef(name = "ReceiverCompany", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverCompany;
    @XmlElementRef(name = "ReceiverCountry", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverCountry;
    @XmlElementRef(name = "ReceiverCountryNationallity", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverCountryNationallity;
    @XmlElementRef(name = "ReceiverCurrency", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverCurrency;
    @XmlElementRef(name = "ReceiverDocExpiration", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> receiverDocExpiration;
    @XmlElementRef(name = "ReceiverEmail", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverEmail;
    @XmlElementRef(name = "ReceiverFileImg", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverFileImg;
    @XmlElementRef(name = "ReceiverFileImg2", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverFileImg2;
    @XmlElementRef(name = "ReceiverGender", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverGender;
    @XmlElement(name = "ReceiverId")
    protected Integer receiverId;
    @XmlElementRef(name = "ReceiverIdIssuer", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverIdIssuer;
    @XmlElementRef(name = "ReceiverIdNumber", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverIdNumber;
    @XmlElementRef(name = "ReceiverIdType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverIdType;
    @XmlElementRef(name = "ReceiverLastName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverLastName;
    @XmlElement(name = "ReceiverLastTransaction")
    protected Integer receiverLastTransaction;
    @XmlElementRef(name = "ReceiverMaritalStatus", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverMaritalStatus;
    @XmlElementRef(name = "ReceiverMobile", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverMobile;
    @XmlElementRef(name = "ReceiverMoneyOrigin", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverMoneyOrigin;
    @XmlElementRef(name = "ReceiverName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverName;
    @XmlElementRef(name = "ReceiverOccupation", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverOccupation;
    @XmlElementRef(name = "ReceiverOfficeCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverOfficeCode;
    @XmlElement(name = "ReceiverPEP")
    protected Boolean receiverPEP;
    @XmlElementRef(name = "ReceiverPOB", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverPOB;
    @XmlElementRef(name = "ReceiverPhone", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverPhone;
    @XmlElementRef(name = "ReceiverPicture", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverPicture;
    @XmlElementRef(name = "ReceiverRemark", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverRemark;
    @XmlElementRef(name = "ReceiverState", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverState;
    @XmlElementRef(name = "ReceiverZip", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverZip;
    @XmlElement(name = "SenderID")
    protected Integer senderID;

    /**
     * Gets the value of the receiverActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiverActive() {
        return receiverActive;
    }

    /**
     * Sets the value of the receiverActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiverActive(Boolean value) {
        this.receiverActive = value;
    }

    /**
     * Gets the value of the receiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Sets the value of the receiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverAddress(JAXBElement<String> value) {
        this.receiverAddress = value;
    }

    /**
     * Gets the value of the receiverAverageMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceiverAverageMonth() {
        return receiverAverageMonth;
    }

    /**
     * Sets the value of the receiverAverageMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceiverAverageMonth(BigDecimal value) {
        this.receiverAverageMonth = value;
    }

    /**
     * Gets the value of the receiverBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReceiverBirthDate() {
        return receiverBirthDate;
    }

    /**
     * Sets the value of the receiverBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReceiverBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.receiverBirthDate = value;
    }

    /**
     * Gets the value of the receiverCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverCity() {
        return receiverCity;
    }

    /**
     * Sets the value of the receiverCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverCity(JAXBElement<String> value) {
        this.receiverCity = value;
    }

    /**
     * Gets the value of the receiverCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverCompany() {
        return receiverCompany;
    }

    /**
     * Sets the value of the receiverCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverCompany(JAXBElement<String> value) {
        this.receiverCompany = value;
    }

    /**
     * Gets the value of the receiverCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverCountry() {
        return receiverCountry;
    }

    /**
     * Sets the value of the receiverCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverCountry(JAXBElement<String> value) {
        this.receiverCountry = value;
    }

    /**
     * Gets the value of the receiverCountryNationallity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverCountryNationallity() {
        return receiverCountryNationallity;
    }

    /**
     * Sets the value of the receiverCountryNationallity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverCountryNationallity(JAXBElement<String> value) {
        this.receiverCountryNationallity = value;
    }

    /**
     * Gets the value of the receiverCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverCurrency() {
        return receiverCurrency;
    }

    /**
     * Sets the value of the receiverCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverCurrency(JAXBElement<String> value) {
        this.receiverCurrency = value;
    }

    /**
     * Gets the value of the receiverDocExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReceiverDocExpiration() {
        return receiverDocExpiration;
    }

    /**
     * Sets the value of the receiverDocExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReceiverDocExpiration(JAXBElement<XMLGregorianCalendar> value) {
        this.receiverDocExpiration = value;
    }

    /**
     * Gets the value of the receiverEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverEmail() {
        return receiverEmail;
    }

    /**
     * Sets the value of the receiverEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverEmail(JAXBElement<String> value) {
        this.receiverEmail = value;
    }

    /**
     * Gets the value of the receiverFileImg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverFileImg() {
        return receiverFileImg;
    }

    /**
     * Sets the value of the receiverFileImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverFileImg(JAXBElement<String> value) {
        this.receiverFileImg = value;
    }

    /**
     * Gets the value of the receiverFileImg2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverFileImg2() {
        return receiverFileImg2;
    }

    /**
     * Sets the value of the receiverFileImg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverFileImg2(JAXBElement<String> value) {
        this.receiverFileImg2 = value;
    }

    /**
     * Gets the value of the receiverGender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverGender() {
        return receiverGender;
    }

    /**
     * Sets the value of the receiverGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverGender(JAXBElement<String> value) {
        this.receiverGender = value;
    }

    /**
     * Gets the value of the receiverId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiverId() {
        return receiverId;
    }

    /**
     * Sets the value of the receiverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiverId(Integer value) {
        this.receiverId = value;
    }

    /**
     * Gets the value of the receiverIdIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverIdIssuer() {
        return receiverIdIssuer;
    }

    /**
     * Sets the value of the receiverIdIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverIdIssuer(JAXBElement<String> value) {
        this.receiverIdIssuer = value;
    }

    /**
     * Gets the value of the receiverIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverIdNumber() {
        return receiverIdNumber;
    }

    /**
     * Sets the value of the receiverIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverIdNumber(JAXBElement<String> value) {
        this.receiverIdNumber = value;
    }

    /**
     * Gets the value of the receiverIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverIdType() {
        return receiverIdType;
    }

    /**
     * Sets the value of the receiverIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverIdType(JAXBElement<String> value) {
        this.receiverIdType = value;
    }

    /**
     * Gets the value of the receiverLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverLastName() {
        return receiverLastName;
    }

    /**
     * Sets the value of the receiverLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverLastName(JAXBElement<String> value) {
        this.receiverLastName = value;
    }

    /**
     * Gets the value of the receiverLastTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiverLastTransaction() {
        return receiverLastTransaction;
    }

    /**
     * Sets the value of the receiverLastTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiverLastTransaction(Integer value) {
        this.receiverLastTransaction = value;
    }

    /**
     * Gets the value of the receiverMaritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverMaritalStatus() {
        return receiverMaritalStatus;
    }

    /**
     * Sets the value of the receiverMaritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverMaritalStatus(JAXBElement<String> value) {
        this.receiverMaritalStatus = value;
    }

    /**
     * Gets the value of the receiverMobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * Sets the value of the receiverMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverMobile(JAXBElement<String> value) {
        this.receiverMobile = value;
    }

    /**
     * Gets the value of the receiverMoneyOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverMoneyOrigin() {
        return receiverMoneyOrigin;
    }

    /**
     * Sets the value of the receiverMoneyOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverMoneyOrigin(JAXBElement<String> value) {
        this.receiverMoneyOrigin = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverName(JAXBElement<String> value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the receiverOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverOccupation() {
        return receiverOccupation;
    }

    /**
     * Sets the value of the receiverOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverOccupation(JAXBElement<String> value) {
        this.receiverOccupation = value;
    }

    /**
     * Gets the value of the receiverOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverOfficeCode() {
        return receiverOfficeCode;
    }

    /**
     * Sets the value of the receiverOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverOfficeCode(JAXBElement<String> value) {
        this.receiverOfficeCode = value;
    }

    /**
     * Gets the value of the receiverPEP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiverPEP() {
        return receiverPEP;
    }

    /**
     * Sets the value of the receiverPEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiverPEP(Boolean value) {
        this.receiverPEP = value;
    }

    /**
     * Gets the value of the receiverPOB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverPOB() {
        return receiverPOB;
    }

    /**
     * Sets the value of the receiverPOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverPOB(JAXBElement<String> value) {
        this.receiverPOB = value;
    }

    /**
     * Gets the value of the receiverPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * Sets the value of the receiverPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverPhone(JAXBElement<String> value) {
        this.receiverPhone = value;
    }

    /**
     * Gets the value of the receiverPicture property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverPicture() {
        return receiverPicture;
    }

    /**
     * Sets the value of the receiverPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverPicture(JAXBElement<String> value) {
        this.receiverPicture = value;
    }

    /**
     * Gets the value of the receiverRemark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverRemark() {
        return receiverRemark;
    }

    /**
     * Sets the value of the receiverRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverRemark(JAXBElement<String> value) {
        this.receiverRemark = value;
    }

    /**
     * Gets the value of the receiverState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverState() {
        return receiverState;
    }

    /**
     * Sets the value of the receiverState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverState(JAXBElement<String> value) {
        this.receiverState = value;
    }

    /**
     * Gets the value of the receiverZip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverZip() {
        return receiverZip;
    }

    /**
     * Sets the value of the receiverZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverZip(JAXBElement<String> value) {
        this.receiverZip = value;
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

}
