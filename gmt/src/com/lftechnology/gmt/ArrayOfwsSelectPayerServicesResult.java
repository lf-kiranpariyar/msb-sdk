
package com.lftechnology.gmt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfws_Select_PayerServicesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfws_Select_PayerServicesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ws_Select_PayerServicesResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}ws_Select_PayerServicesResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfws_Select_PayerServicesResult", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "wsSelectPayerServicesResult"
})
public class ArrayOfwsSelectPayerServicesResult {

    @XmlElement(name = "ws_Select_PayerServicesResult", nillable = true)
    protected List<WsSelectPayerServicesResult> wsSelectPayerServicesResult;

    /**
     * Gets the value of the wsSelectPayerServicesResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsSelectPayerServicesResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsSelectPayerServicesResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsSelectPayerServicesResult }
     * 
     * 
     */
    public List<WsSelectPayerServicesResult> getWsSelectPayerServicesResult() {
        if (wsSelectPayerServicesResult == null) {
            wsSelectPayerServicesResult = new ArrayList<WsSelectPayerServicesResult>();
        }
        return this.wsSelectPayerServicesResult;
    }

}
