
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
 *         &lt;element name="SendTransactionResult" type="{WebServices}Return_CreateTXN"/>
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
    "sendTransactionResult"
})
@XmlRootElement(name = "SendTransactionResponse")
public class SendTransactionResponse {

    @XmlElement(name = "SendTransactionResult", required = true)
    protected ReturnCreateTXN sendTransactionResult;

    /**
     * Gets the value of the sendTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCreateTXN }
     *     
     */
    public ReturnCreateTXN getSendTransactionResult() {
        return sendTransactionResult;
    }

    /**
     * Sets the value of the sendTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCreateTXN }
     *     
     */
    public void setSendTransactionResult(ReturnCreateTXN value) {
        this.sendTransactionResult = value;
    }

}
