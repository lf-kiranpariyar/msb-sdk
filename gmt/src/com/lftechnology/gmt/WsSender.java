
package com.lftechnology.gmt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for wsSender complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsSender"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgentAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderAchAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderAchRouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderAchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderAddressStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderAggregatedTransfers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SenderBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderBirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SenderCardBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCardExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SenderCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCardType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SenderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderComments3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCompanyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCompanyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCountryNationallity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCountryResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderDocExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SenderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderFileImg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderFileImg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderForceNew" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SenderIdCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderIdIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderIdNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderIdType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderMaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderMoneyOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderMoneyOwn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderMonthAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderOccupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderOnBehalfOf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderPEP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderPOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderPoliticalFamily" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderResidenceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderResidenceAddressExtra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderResidenceCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderResidenceCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderResidenceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderResidenceZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderSendingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsSender", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "agentAlias",
    "senderAchAccount",
    "senderAchRouting",
    "senderAchType",
    "senderActive",
    "senderAddress",
    "senderAddressStreet",
    "senderAggregatedTransfers",
    "senderBank",
    "senderBirthDate",
    "senderCardBank",
    "senderCardExpiration",
    "senderCardName",
    "senderCardNumber",
    "senderCardType",
    "senderCity",
    "senderComments",
    "senderComments3",
    "senderCompany",
    "senderCompanyAddress",
    "senderCompanyPhone",
    "senderCountryCode",
    "senderCountryNationallity",
    "senderCountryResidence",
    "senderCurrencyCode",
    "senderDocExpiration",
    "senderEmail",
    "senderFileImg",
    "senderFileImg2",
    "senderForceNew",
    "senderGender",
    "senderIP",
    "senderId",
    "senderIdCard",
    "senderIdIssuer",
    "senderIdNumber",
    "senderIdNumber2",
    "senderIdType",
    "senderIdType2",
    "senderLastName",
    "senderMaritalStatus",
    "senderMobile",
    "senderMoneyOrigin",
    "senderMoneyOwn",
    "senderMonthAverage",
    "senderName",
    "senderOccupation",
    "senderOnBehalfOf",
    "senderPEP",
    "senderPOB",
    "senderPassword",
    "senderPhone",
    "senderPicture",
    "senderPoliticalFamily",
    "senderResidenceAddress",
    "senderResidenceAddressExtra",
    "senderResidenceCity",
    "senderResidenceCountryCode",
    "senderResidenceState",
    "senderResidenceZip",
    "senderSendingReason",
    "senderState",
    "senderTrackingNumber",
    "senderZip"
})
public class WsSender {

    @XmlElementRef(name = "AgentAlias", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agentAlias;
    @XmlElementRef(name = "SenderAchAccount", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderAchAccount;
    @XmlElementRef(name = "SenderAchRouting", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderAchRouting;
    @XmlElementRef(name = "SenderAchType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderAchType;
    @XmlElement(name = "SenderActive")
    protected Boolean senderActive;
    @XmlElementRef(name = "SenderAddress", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderAddress;
    @XmlElementRef(name = "SenderAddressStreet", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderAddressStreet;
    @XmlElement(name = "SenderAggregatedTransfers")
    protected Integer senderAggregatedTransfers;
    @XmlElementRef(name = "SenderBank", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderBank;
    @XmlElementRef(name = "SenderBirthDate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> senderBirthDate;
    @XmlElementRef(name = "SenderCardBank", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCardBank;
    @XmlElementRef(name = "SenderCardExpiration", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> senderCardExpiration;
    @XmlElementRef(name = "SenderCardName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCardName;
    @XmlElementRef(name = "SenderCardNumber", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCardNumber;
    @XmlElementRef(name = "SenderCardType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> senderCardType;
    @XmlElementRef(name = "SenderCity", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCity;
    @XmlElementRef(name = "SenderComments", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderComments;
    @XmlElementRef(name = "SenderComments3", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderComments3;
    @XmlElementRef(name = "SenderCompany", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCompany;
    @XmlElementRef(name = "SenderCompanyAddress", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCompanyAddress;
    @XmlElementRef(name = "SenderCompanyPhone", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCompanyPhone;
    @XmlElementRef(name = "SenderCountryCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCountryCode;
    @XmlElementRef(name = "SenderCountryNationallity", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCountryNationallity;
    @XmlElementRef(name = "SenderCountryResidence", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCountryResidence;
    @XmlElementRef(name = "SenderCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCurrencyCode;
    @XmlElementRef(name = "SenderDocExpiration", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> senderDocExpiration;
    @XmlElementRef(name = "SenderEmail", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderEmail;
    @XmlElementRef(name = "SenderFileImg", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderFileImg;
    @XmlElementRef(name = "SenderFileImg2", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderFileImg2;
    @XmlElement(name = "SenderForceNew")
    protected Boolean senderForceNew;
    @XmlElementRef(name = "SenderGender", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderGender;
    @XmlElementRef(name = "SenderIP", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderIP;
    @XmlElement(name = "SenderId")
    protected Integer senderId;
    @XmlElementRef(name = "SenderIdCard", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderIdCard;
    @XmlElementRef(name = "SenderIdIssuer", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderIdIssuer;
    @XmlElementRef(name = "SenderIdNumber", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderIdNumber;
    @XmlElementRef(name = "SenderIdNumber2", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderIdNumber2;
    @XmlElementRef(name = "SenderIdType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderIdType;
    @XmlElementRef(name = "SenderIdType2", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderIdType2;
    @XmlElementRef(name = "SenderLastName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderLastName;
    @XmlElementRef(name = "SenderMaritalStatus", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderMaritalStatus;
    @XmlElementRef(name = "SenderMobile", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderMobile;
    @XmlElementRef(name = "SenderMoneyOrigin", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderMoneyOrigin;
    @XmlElement(name = "SenderMoneyOwn")
    protected Boolean senderMoneyOwn;
    @XmlElement(name = "SenderMonthAverage")
    protected BigDecimal senderMonthAverage;
    @XmlElementRef(name = "SenderName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderName;
    @XmlElementRef(name = "SenderOccupation", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderOccupation;
    @XmlElement(name = "SenderOnBehalfOf")
    protected Boolean senderOnBehalfOf;
    @XmlElement(name = "SenderPEP")
    protected Boolean senderPEP;
    @XmlElementRef(name = "SenderPOB", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderPOB;
    @XmlElementRef(name = "SenderPassword", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderPassword;
    @XmlElementRef(name = "SenderPhone", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderPhone;
    @XmlElementRef(name = "SenderPicture", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderPicture;
    @XmlElement(name = "SenderPoliticalFamily")
    protected Boolean senderPoliticalFamily;
    @XmlElementRef(name = "SenderResidenceAddress", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderResidenceAddress;
    @XmlElementRef(name = "SenderResidenceAddressExtra", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderResidenceAddressExtra;
    @XmlElementRef(name = "SenderResidenceCity", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderResidenceCity;
    @XmlElementRef(name = "SenderResidenceCountryCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderResidenceCountryCode;
    @XmlElementRef(name = "SenderResidenceState", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderResidenceState;
    @XmlElementRef(name = "SenderResidenceZip", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderResidenceZip;
    @XmlElementRef(name = "SenderSendingReason", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderSendingReason;
    @XmlElementRef(name = "SenderState", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderState;
    @XmlElementRef(name = "SenderTrackingNumber", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderTrackingNumber;
    @XmlElementRef(name = "SenderZip", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderZip;

    /**
     * Gets the value of the agentAlias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgentAlias() {
        return agentAlias;
    }

    /**
     * Sets the value of the agentAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgentAlias(JAXBElement<String> value) {
        this.agentAlias = value;
    }

    /**
     * Gets the value of the senderAchAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderAchAccount() {
        return senderAchAccount;
    }

    /**
     * Sets the value of the senderAchAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderAchAccount(JAXBElement<String> value) {
        this.senderAchAccount = value;
    }

    /**
     * Gets the value of the senderAchRouting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderAchRouting() {
        return senderAchRouting;
    }

    /**
     * Sets the value of the senderAchRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderAchRouting(JAXBElement<String> value) {
        this.senderAchRouting = value;
    }

    /**
     * Gets the value of the senderAchType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderAchType() {
        return senderAchType;
    }

    /**
     * Sets the value of the senderAchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderAchType(JAXBElement<String> value) {
        this.senderAchType = value;
    }

    /**
     * Gets the value of the senderActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderActive() {
        return senderActive;
    }

    /**
     * Sets the value of the senderActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderActive(Boolean value) {
        this.senderActive = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderAddress(JAXBElement<String> value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the senderAddressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderAddressStreet() {
        return senderAddressStreet;
    }

    /**
     * Sets the value of the senderAddressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderAddressStreet(JAXBElement<String> value) {
        this.senderAddressStreet = value;
    }

    /**
     * Gets the value of the senderAggregatedTransfers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSenderAggregatedTransfers() {
        return senderAggregatedTransfers;
    }

    /**
     * Sets the value of the senderAggregatedTransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSenderAggregatedTransfers(Integer value) {
        this.senderAggregatedTransfers = value;
    }

    /**
     * Gets the value of the senderBank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderBank() {
        return senderBank;
    }

    /**
     * Sets the value of the senderBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderBank(JAXBElement<String> value) {
        this.senderBank = value;
    }

    /**
     * Gets the value of the senderBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSenderBirthDate() {
        return senderBirthDate;
    }

    /**
     * Sets the value of the senderBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSenderBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.senderBirthDate = value;
    }

    /**
     * Gets the value of the senderCardBank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCardBank() {
        return senderCardBank;
    }

    /**
     * Sets the value of the senderCardBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCardBank(JAXBElement<String> value) {
        this.senderCardBank = value;
    }

    /**
     * Gets the value of the senderCardExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSenderCardExpiration() {
        return senderCardExpiration;
    }

    /**
     * Sets the value of the senderCardExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSenderCardExpiration(JAXBElement<XMLGregorianCalendar> value) {
        this.senderCardExpiration = value;
    }

    /**
     * Gets the value of the senderCardName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCardName() {
        return senderCardName;
    }

    /**
     * Sets the value of the senderCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCardName(JAXBElement<String> value) {
        this.senderCardName = value;
    }

    /**
     * Gets the value of the senderCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCardNumber() {
        return senderCardNumber;
    }

    /**
     * Sets the value of the senderCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCardNumber(JAXBElement<String> value) {
        this.senderCardNumber = value;
    }

    /**
     * Gets the value of the senderCardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSenderCardType() {
        return senderCardType;
    }

    /**
     * Sets the value of the senderCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSenderCardType(JAXBElement<Integer> value) {
        this.senderCardType = value;
    }

    /**
     * Gets the value of the senderCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCity() {
        return senderCity;
    }

    /**
     * Sets the value of the senderCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCity(JAXBElement<String> value) {
        this.senderCity = value;
    }

    /**
     * Gets the value of the senderComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderComments() {
        return senderComments;
    }

    /**
     * Sets the value of the senderComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderComments(JAXBElement<String> value) {
        this.senderComments = value;
    }

    /**
     * Gets the value of the senderComments3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderComments3() {
        return senderComments3;
    }

    /**
     * Sets the value of the senderComments3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderComments3(JAXBElement<String> value) {
        this.senderComments3 = value;
    }

    /**
     * Gets the value of the senderCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCompany() {
        return senderCompany;
    }

    /**
     * Sets the value of the senderCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCompany(JAXBElement<String> value) {
        this.senderCompany = value;
    }

    /**
     * Gets the value of the senderCompanyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCompanyAddress() {
        return senderCompanyAddress;
    }

    /**
     * Sets the value of the senderCompanyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCompanyAddress(JAXBElement<String> value) {
        this.senderCompanyAddress = value;
    }

    /**
     * Gets the value of the senderCompanyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCompanyPhone() {
        return senderCompanyPhone;
    }

    /**
     * Sets the value of the senderCompanyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCompanyPhone(JAXBElement<String> value) {
        this.senderCompanyPhone = value;
    }

    /**
     * Gets the value of the senderCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCountryCode() {
        return senderCountryCode;
    }

    /**
     * Sets the value of the senderCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCountryCode(JAXBElement<String> value) {
        this.senderCountryCode = value;
    }

    /**
     * Gets the value of the senderCountryNationallity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCountryNationallity() {
        return senderCountryNationallity;
    }

    /**
     * Sets the value of the senderCountryNationallity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCountryNationallity(JAXBElement<String> value) {
        this.senderCountryNationallity = value;
    }

    /**
     * Gets the value of the senderCountryResidence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCountryResidence() {
        return senderCountryResidence;
    }

    /**
     * Sets the value of the senderCountryResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCountryResidence(JAXBElement<String> value) {
        this.senderCountryResidence = value;
    }

    /**
     * Gets the value of the senderCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCurrencyCode() {
        return senderCurrencyCode;
    }

    /**
     * Sets the value of the senderCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCurrencyCode(JAXBElement<String> value) {
        this.senderCurrencyCode = value;
    }

    /**
     * Gets the value of the senderDocExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSenderDocExpiration() {
        return senderDocExpiration;
    }

    /**
     * Sets the value of the senderDocExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSenderDocExpiration(JAXBElement<XMLGregorianCalendar> value) {
        this.senderDocExpiration = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderEmail(JAXBElement<String> value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the senderFileImg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderFileImg() {
        return senderFileImg;
    }

    /**
     * Sets the value of the senderFileImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderFileImg(JAXBElement<String> value) {
        this.senderFileImg = value;
    }

    /**
     * Gets the value of the senderFileImg2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderFileImg2() {
        return senderFileImg2;
    }

    /**
     * Sets the value of the senderFileImg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderFileImg2(JAXBElement<String> value) {
        this.senderFileImg2 = value;
    }

    /**
     * Gets the value of the senderForceNew property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderForceNew() {
        return senderForceNew;
    }

    /**
     * Sets the value of the senderForceNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderForceNew(Boolean value) {
        this.senderForceNew = value;
    }

    /**
     * Gets the value of the senderGender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderGender() {
        return senderGender;
    }

    /**
     * Sets the value of the senderGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderGender(JAXBElement<String> value) {
        this.senderGender = value;
    }

    /**
     * Gets the value of the senderIP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderIP() {
        return senderIP;
    }

    /**
     * Sets the value of the senderIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderIP(JAXBElement<String> value) {
        this.senderIP = value;
    }

    /**
     * Gets the value of the senderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSenderId(Integer value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the senderIdCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderIdCard() {
        return senderIdCard;
    }

    /**
     * Sets the value of the senderIdCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderIdCard(JAXBElement<String> value) {
        this.senderIdCard = value;
    }

    /**
     * Gets the value of the senderIdIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderIdIssuer() {
        return senderIdIssuer;
    }

    /**
     * Sets the value of the senderIdIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderIdIssuer(JAXBElement<String> value) {
        this.senderIdIssuer = value;
    }

    /**
     * Gets the value of the senderIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderIdNumber() {
        return senderIdNumber;
    }

    /**
     * Sets the value of the senderIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderIdNumber(JAXBElement<String> value) {
        this.senderIdNumber = value;
    }

    /**
     * Gets the value of the senderIdNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderIdNumber2() {
        return senderIdNumber2;
    }

    /**
     * Sets the value of the senderIdNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderIdNumber2(JAXBElement<String> value) {
        this.senderIdNumber2 = value;
    }

    /**
     * Gets the value of the senderIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderIdType() {
        return senderIdType;
    }

    /**
     * Sets the value of the senderIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderIdType(JAXBElement<String> value) {
        this.senderIdType = value;
    }

    /**
     * Gets the value of the senderIdType2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderIdType2() {
        return senderIdType2;
    }

    /**
     * Sets the value of the senderIdType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderIdType2(JAXBElement<String> value) {
        this.senderIdType2 = value;
    }

    /**
     * Gets the value of the senderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderLastName() {
        return senderLastName;
    }

    /**
     * Sets the value of the senderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderLastName(JAXBElement<String> value) {
        this.senderLastName = value;
    }

    /**
     * Gets the value of the senderMaritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderMaritalStatus() {
        return senderMaritalStatus;
    }

    /**
     * Sets the value of the senderMaritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderMaritalStatus(JAXBElement<String> value) {
        this.senderMaritalStatus = value;
    }

    /**
     * Gets the value of the senderMobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderMobile() {
        return senderMobile;
    }

    /**
     * Sets the value of the senderMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderMobile(JAXBElement<String> value) {
        this.senderMobile = value;
    }

    /**
     * Gets the value of the senderMoneyOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderMoneyOrigin() {
        return senderMoneyOrigin;
    }

    /**
     * Sets the value of the senderMoneyOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderMoneyOrigin(JAXBElement<String> value) {
        this.senderMoneyOrigin = value;
    }

    /**
     * Gets the value of the senderMoneyOwn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderMoneyOwn() {
        return senderMoneyOwn;
    }

    /**
     * Sets the value of the senderMoneyOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderMoneyOwn(Boolean value) {
        this.senderMoneyOwn = value;
    }

    /**
     * Gets the value of the senderMonthAverage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSenderMonthAverage() {
        return senderMonthAverage;
    }

    /**
     * Sets the value of the senderMonthAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSenderMonthAverage(BigDecimal value) {
        this.senderMonthAverage = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderName(JAXBElement<String> value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the senderOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderOccupation() {
        return senderOccupation;
    }

    /**
     * Sets the value of the senderOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderOccupation(JAXBElement<String> value) {
        this.senderOccupation = value;
    }

    /**
     * Gets the value of the senderOnBehalfOf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderOnBehalfOf() {
        return senderOnBehalfOf;
    }

    /**
     * Sets the value of the senderOnBehalfOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderOnBehalfOf(Boolean value) {
        this.senderOnBehalfOf = value;
    }

    /**
     * Gets the value of the senderPEP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderPEP() {
        return senderPEP;
    }

    /**
     * Sets the value of the senderPEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderPEP(Boolean value) {
        this.senderPEP = value;
    }

    /**
     * Gets the value of the senderPOB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderPOB() {
        return senderPOB;
    }

    /**
     * Sets the value of the senderPOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderPOB(JAXBElement<String> value) {
        this.senderPOB = value;
    }

    /**
     * Gets the value of the senderPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderPassword() {
        return senderPassword;
    }

    /**
     * Sets the value of the senderPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderPassword(JAXBElement<String> value) {
        this.senderPassword = value;
    }

    /**
     * Gets the value of the senderPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderPhone() {
        return senderPhone;
    }

    /**
     * Sets the value of the senderPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderPhone(JAXBElement<String> value) {
        this.senderPhone = value;
    }

    /**
     * Gets the value of the senderPicture property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderPicture() {
        return senderPicture;
    }

    /**
     * Sets the value of the senderPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderPicture(JAXBElement<String> value) {
        this.senderPicture = value;
    }

    /**
     * Gets the value of the senderPoliticalFamily property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderPoliticalFamily() {
        return senderPoliticalFamily;
    }

    /**
     * Sets the value of the senderPoliticalFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderPoliticalFamily(Boolean value) {
        this.senderPoliticalFamily = value;
    }

    /**
     * Gets the value of the senderResidenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderResidenceAddress() {
        return senderResidenceAddress;
    }

    /**
     * Sets the value of the senderResidenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderResidenceAddress(JAXBElement<String> value) {
        this.senderResidenceAddress = value;
    }

    /**
     * Gets the value of the senderResidenceAddressExtra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderResidenceAddressExtra() {
        return senderResidenceAddressExtra;
    }

    /**
     * Sets the value of the senderResidenceAddressExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderResidenceAddressExtra(JAXBElement<String> value) {
        this.senderResidenceAddressExtra = value;
    }

    /**
     * Gets the value of the senderResidenceCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderResidenceCity() {
        return senderResidenceCity;
    }

    /**
     * Sets the value of the senderResidenceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderResidenceCity(JAXBElement<String> value) {
        this.senderResidenceCity = value;
    }

    /**
     * Gets the value of the senderResidenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderResidenceCountryCode() {
        return senderResidenceCountryCode;
    }

    /**
     * Sets the value of the senderResidenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderResidenceCountryCode(JAXBElement<String> value) {
        this.senderResidenceCountryCode = value;
    }

    /**
     * Gets the value of the senderResidenceState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderResidenceState() {
        return senderResidenceState;
    }

    /**
     * Sets the value of the senderResidenceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderResidenceState(JAXBElement<String> value) {
        this.senderResidenceState = value;
    }

    /**
     * Gets the value of the senderResidenceZip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderResidenceZip() {
        return senderResidenceZip;
    }

    /**
     * Sets the value of the senderResidenceZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderResidenceZip(JAXBElement<String> value) {
        this.senderResidenceZip = value;
    }

    /**
     * Gets the value of the senderSendingReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderSendingReason() {
        return senderSendingReason;
    }

    /**
     * Sets the value of the senderSendingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderSendingReason(JAXBElement<String> value) {
        this.senderSendingReason = value;
    }

    /**
     * Gets the value of the senderState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderState() {
        return senderState;
    }

    /**
     * Sets the value of the senderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderState(JAXBElement<String> value) {
        this.senderState = value;
    }

    /**
     * Gets the value of the senderTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderTrackingNumber() {
        return senderTrackingNumber;
    }

    /**
     * Sets the value of the senderTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderTrackingNumber(JAXBElement<String> value) {
        this.senderTrackingNumber = value;
    }

    /**
     * Gets the value of the senderZip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderZip() {
        return senderZip;
    }

    /**
     * Sets the value of the senderZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderZip(JAXBElement<String> value) {
        this.senderZip = value;
    }

}
