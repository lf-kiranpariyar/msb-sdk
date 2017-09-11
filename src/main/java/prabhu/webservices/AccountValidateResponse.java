
package prabhu.webservices;

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
 *         &lt;element name="AccountValidateResult" type="{WebServices}Return_AccountValid_V2" minOccurs="0"/>
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
    "accountValidateResult"
})
@XmlRootElement(name = "AccountValidateResponse")
public class AccountValidateResponse {

    @XmlElement(name = "AccountValidateResult")
    protected ReturnAccountValidV2 accountValidateResult;

    /**
     * Gets the value of the accountValidateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnAccountValidV2 }
     *     
     */
    public ReturnAccountValidV2 getAccountValidateResult() {
        return accountValidateResult;
    }

    /**
     * Sets the value of the accountValidateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAccountValidV2 }
     *     
     */
    public void setAccountValidateResult(ReturnAccountValidV2 value) {
        this.accountValidateResult = value;
    }

}
