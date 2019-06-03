
package com.lftechnology.gmt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rec_contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rec_contact_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rec_error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rec_error_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rec_idioma_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rec_license" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rec_pdf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rec_rtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rec_rtr_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptTemplate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "recContact",
    "recContactEn",
    "recError",
    "recErrorEn",
    "recIdiomaId",
    "recLicense",
    "recPdf",
    "recRtr",
    "recRtrEn"
})
public class ReceiptTemplate {

    @XmlElementRef(name = "rec_contact", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recContact;
    @XmlElementRef(name = "rec_contact_en", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recContactEn;
    @XmlElementRef(name = "rec_error", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recError;
    @XmlElementRef(name = "rec_error_en", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recErrorEn;
    @XmlElement(name = "rec_idioma_id")
    protected Integer recIdiomaId;
    @XmlElementRef(name = "rec_license", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recLicense;
    @XmlElementRef(name = "rec_pdf", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recPdf;
    @XmlElementRef(name = "rec_rtr", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recRtr;
    @XmlElementRef(name = "rec_rtr_en", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recRtrEn;

    /**
     * Gets the value of the recContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecContact() {
        return recContact;
    }

    /**
     * Sets the value of the recContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecContact(JAXBElement<String> value) {
        this.recContact = value;
    }

    /**
     * Gets the value of the recContactEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecContactEn() {
        return recContactEn;
    }

    /**
     * Sets the value of the recContactEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecContactEn(JAXBElement<String> value) {
        this.recContactEn = value;
    }

    /**
     * Gets the value of the recError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecError() {
        return recError;
    }

    /**
     * Sets the value of the recError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecError(JAXBElement<String> value) {
        this.recError = value;
    }

    /**
     * Gets the value of the recErrorEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecErrorEn() {
        return recErrorEn;
    }

    /**
     * Sets the value of the recErrorEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecErrorEn(JAXBElement<String> value) {
        this.recErrorEn = value;
    }

    /**
     * Gets the value of the recIdiomaId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecIdiomaId() {
        return recIdiomaId;
    }

    /**
     * Sets the value of the recIdiomaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecIdiomaId(Integer value) {
        this.recIdiomaId = value;
    }

    /**
     * Gets the value of the recLicense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecLicense() {
        return recLicense;
    }

    /**
     * Sets the value of the recLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecLicense(JAXBElement<String> value) {
        this.recLicense = value;
    }

    /**
     * Gets the value of the recPdf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecPdf() {
        return recPdf;
    }

    /**
     * Sets the value of the recPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecPdf(JAXBElement<String> value) {
        this.recPdf = value;
    }

    /**
     * Gets the value of the recRtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecRtr() {
        return recRtr;
    }

    /**
     * Sets the value of the recRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecRtr(JAXBElement<String> value) {
        this.recRtr = value;
    }

    /**
     * Gets the value of the recRtrEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecRtrEn() {
        return recRtrEn;
    }

    /**
     * Sets the value of the recRtrEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecRtrEn(JAXBElement<String> value) {
        this.recRtrEn = value;
    }

}
