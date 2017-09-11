
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
 *         &lt;element name="GetEXRateResult" type="{WebServices}Return_FOREX"/>
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
    "getEXRateResult"
})
@XmlRootElement(name = "GetEXRateResponse")
public class GetEXRateResponse {

    @XmlElement(name = "GetEXRateResult", required = true)
    protected ReturnFOREX getEXRateResult;

    /**
     * Gets the value of the getEXRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnFOREX }
     *     
     */
    public ReturnFOREX getGetEXRateResult() {
        return getEXRateResult;
    }

    /**
     * Sets the value of the getEXRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnFOREX }
     *     
     */
    public void setGetEXRateResult(ReturnFOREX value) {
        this.getEXRateResult = value;
    }

}
