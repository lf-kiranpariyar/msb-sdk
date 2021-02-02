package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmendmentRequestResult" type="{WebServices}Return_TXNAMEND"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "amendmentRequestResult"
})
@XmlRootElement(name = "AmendmentRequestResponse")
public class AmendmentRequestResponse {

    @XmlElement(name = "AmendmentRequestResult", required = true)
    protected ReturnTXNAMEND amendmentRequestResult;

    /**
     * Gets the value of the amendmentRequestResult property.
     *
     * @return possible object is
     * {@link ReturnTXNAMEND }
     */
    public ReturnTXNAMEND getAmendmentRequestResult() {
        return amendmentRequestResult;
    }

    /**
     * Sets the value of the amendmentRequestResult property.
     *
     * @param value allowed object is
     *              {@link ReturnTXNAMEND }
     */
    public void setAmendmentRequestResult(ReturnTXNAMEND value) {
        this.amendmentRequestResult = value;
    }

}
