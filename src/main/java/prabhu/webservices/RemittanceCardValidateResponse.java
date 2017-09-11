
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
 *         &lt;element name="RemittanceCardValidateResult" type="{Web Services}Return_CardValid" minOccurs="0"/>
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
    "remittanceCardValidateResult"
})
@XmlRootElement(name = "RemittanceCardValidateResponse")
public class RemittanceCardValidateResponse {

    @XmlElement(name = "RemittanceCardValidateResult")
    protected ReturnCardValid remittanceCardValidateResult;

    /**
     * Gets the value of the remittanceCardValidateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCardValid }
     *     
     */
    public ReturnCardValid getRemittanceCardValidateResult() {
        return remittanceCardValidateResult;
    }

    /**
     * Sets the value of the remittanceCardValidateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCardValid }
     *     
     */
    public void setRemittanceCardValidateResult(ReturnCardValid value) {
        this.remittanceCardValidateResult = value;
    }

}
