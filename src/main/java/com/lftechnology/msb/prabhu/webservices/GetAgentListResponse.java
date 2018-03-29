
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
 *         &lt;element name="GetAgentListResult" type="{WebServices}ArrayOfReturn_AGENTLIST" minOccurs="0"/>
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
    "getAgentListResult"
})
@XmlRootElement(name = "GetAgentListResponse")
public class GetAgentListResponse {

    @XmlElement(name = "GetAgentListResult")
    protected ArrayOfReturnAGENTLIST getAgentListResult;

    /**
     * Gets the value of the getAgentListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReturnAGENTLIST }
     *     
     */
    public ArrayOfReturnAGENTLIST getGetAgentListResult() {
        return getAgentListResult;
    }

    /**
     * Sets the value of the getAgentListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReturnAGENTLIST }
     *     
     */
    public void setGetAgentListResult(ArrayOfReturnAGENTLIST value) {
        this.getAgentListResult = value;
    }

}
