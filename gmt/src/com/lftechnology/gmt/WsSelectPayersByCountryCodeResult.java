
package com.lftechnology.gmt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_Select_PayersByCountryCodeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_Select_PayersByCountryCodeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NeedsBank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NeedsBenID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NeedsBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NeedsIBAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PayerAccountTypes" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfws_Select_PayerAccountTypesResult" minOccurs="0"/&gt;
 *         &lt;element name="PayerBanks" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfws_Select_PayerBanksResult" minOccurs="0"/&gt;
 *         &lt;element name="PayerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerCurrencies" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfws_Select_PayerCurrenciesResult" minOccurs="0"/&gt;
 *         &lt;element name="PayerLimits" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfws_Select_PayerLimitsResult" minOccurs="0"/&gt;
 *         &lt;element name="PayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerOffices" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfws_Select_PayerOfficesResult" minOccurs="0"/&gt;
 *         &lt;element name="PayerServices" type="{http://schemas.datacontract.org/2004/07/gmtpay}ArrayOfws_Select_PayerServicesResult" minOccurs="0"/&gt;
 *         &lt;element name="PayerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_Select_PayersByCountryCodeResult", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "needsBank",
    "needsBenID",
    "needsBranch",
    "needsIBAN",
    "payerAccountTypes",
    "payerBanks",
    "payerCode",
    "payerCountryName",
    "payerCurrencies",
    "payerLimits",
    "payerName",
    "payerOffices",
    "payerServices",
    "payerType"
})
public class WsSelectPayersByCountryCodeResult {

    @XmlElement(name = "NeedsBank")
    protected Boolean needsBank;
    @XmlElement(name = "NeedsBenID")
    protected Boolean needsBenID;
    @XmlElement(name = "NeedsBranch")
    protected Boolean needsBranch;
    @XmlElement(name = "NeedsIBAN")
    protected Boolean needsIBAN;
    @XmlElementRef(name = "PayerAccountTypes", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsSelectPayerAccountTypesResult> payerAccountTypes;
    @XmlElementRef(name = "PayerBanks", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsSelectPayerBanksResult> payerBanks;
    @XmlElementRef(name = "PayerCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payerCode;
    @XmlElementRef(name = "PayerCountryName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payerCountryName;
    @XmlElementRef(name = "PayerCurrencies", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsSelectPayerCurrenciesResult> payerCurrencies;
    @XmlElementRef(name = "PayerLimits", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsSelectPayerLimitsResult> payerLimits;
    @XmlElementRef(name = "PayerName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payerName;
    @XmlElementRef(name = "PayerOffices", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsSelectPayerOfficesResult> payerOffices;
    @XmlElementRef(name = "PayerServices", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwsSelectPayerServicesResult> payerServices;
    @XmlElementRef(name = "PayerType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payerType;

    /**
     * Gets the value of the needsBank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsBank() {
        return needsBank;
    }

    /**
     * Sets the value of the needsBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsBank(Boolean value) {
        this.needsBank = value;
    }

    /**
     * Gets the value of the needsBenID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsBenID() {
        return needsBenID;
    }

    /**
     * Sets the value of the needsBenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsBenID(Boolean value) {
        this.needsBenID = value;
    }

    /**
     * Gets the value of the needsBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsBranch() {
        return needsBranch;
    }

    /**
     * Sets the value of the needsBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsBranch(Boolean value) {
        this.needsBranch = value;
    }

    /**
     * Gets the value of the needsIBAN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsIBAN() {
        return needsIBAN;
    }

    /**
     * Sets the value of the needsIBAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsIBAN(Boolean value) {
        this.needsIBAN = value;
    }

    /**
     * Gets the value of the payerAccountTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerAccountTypesResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsSelectPayerAccountTypesResult> getPayerAccountTypes() {
        return payerAccountTypes;
    }

    /**
     * Sets the value of the payerAccountTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerAccountTypesResult }{@code >}
     *     
     */
    public void setPayerAccountTypes(JAXBElement<ArrayOfwsSelectPayerAccountTypesResult> value) {
        this.payerAccountTypes = value;
    }

    /**
     * Gets the value of the payerBanks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerBanksResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsSelectPayerBanksResult> getPayerBanks() {
        return payerBanks;
    }

    /**
     * Sets the value of the payerBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerBanksResult }{@code >}
     *     
     */
    public void setPayerBanks(JAXBElement<ArrayOfwsSelectPayerBanksResult> value) {
        this.payerBanks = value;
    }

    /**
     * Gets the value of the payerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayerCode() {
        return payerCode;
    }

    /**
     * Sets the value of the payerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayerCode(JAXBElement<String> value) {
        this.payerCode = value;
    }

    /**
     * Gets the value of the payerCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayerCountryName() {
        return payerCountryName;
    }

    /**
     * Sets the value of the payerCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayerCountryName(JAXBElement<String> value) {
        this.payerCountryName = value;
    }

    /**
     * Gets the value of the payerCurrencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerCurrenciesResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsSelectPayerCurrenciesResult> getPayerCurrencies() {
        return payerCurrencies;
    }

    /**
     * Sets the value of the payerCurrencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerCurrenciesResult }{@code >}
     *     
     */
    public void setPayerCurrencies(JAXBElement<ArrayOfwsSelectPayerCurrenciesResult> value) {
        this.payerCurrencies = value;
    }

    /**
     * Gets the value of the payerLimits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerLimitsResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsSelectPayerLimitsResult> getPayerLimits() {
        return payerLimits;
    }

    /**
     * Sets the value of the payerLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerLimitsResult }{@code >}
     *     
     */
    public void setPayerLimits(JAXBElement<ArrayOfwsSelectPayerLimitsResult> value) {
        this.payerLimits = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayerName(JAXBElement<String> value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerOffices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerOfficesResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsSelectPayerOfficesResult> getPayerOffices() {
        return payerOffices;
    }

    /**
     * Sets the value of the payerOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerOfficesResult }{@code >}
     *     
     */
    public void setPayerOffices(JAXBElement<ArrayOfwsSelectPayerOfficesResult> value) {
        this.payerOffices = value;
    }

    /**
     * Gets the value of the payerServices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerServicesResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwsSelectPayerServicesResult> getPayerServices() {
        return payerServices;
    }

    /**
     * Sets the value of the payerServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerServicesResult }{@code >}
     *     
     */
    public void setPayerServices(JAXBElement<ArrayOfwsSelectPayerServicesResult> value) {
        this.payerServices = value;
    }

    /**
     * Gets the value of the payerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayerType() {
        return payerType;
    }

    /**
     * Sets the value of the payerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayerType(JAXBElement<String> value) {
        this.payerType = value;
    }

}
