
package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authorized_ConfirmedResult" type="{WebServices}Return_TXNAuth"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorizedConfirmedResult"
})
@XmlRootElement(name = "Authorized_ConfirmedResponse")
public class AuthorizedConfirmedResponse {

    @XmlElement(name = "Authorized_ConfirmedResult", required = true)
    protected ReturnTXNAuth authorizedConfirmedResult;

    /**
     * Gets the value of the authorizedConfirmedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnTXNAuth }
     *     
     */
    public ReturnTXNAuth getAuthorizedConfirmedResult() {
        return authorizedConfirmedResult;
    }

    /**
     * Sets the value of the authorizedConfirmedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnTXNAuth }
     *     
     */
    public void setAuthorizedConfirmedResult(ReturnTXNAuth value) {
        this.authorizedConfirmedResult = value;
    }

}
