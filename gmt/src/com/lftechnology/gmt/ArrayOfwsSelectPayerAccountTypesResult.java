
package com.lftechnology.gmt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfws_Select_PayerAccountTypesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfws_Select_PayerAccountTypesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ws_Select_PayerAccountTypesResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}ws_Select_PayerAccountTypesResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfws_Select_PayerAccountTypesResult", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "wsSelectPayerAccountTypesResult"
})
public class ArrayOfwsSelectPayerAccountTypesResult {

    @XmlElement(name = "ws_Select_PayerAccountTypesResult", nillable = true)
    protected List<WsSelectPayerAccountTypesResult> wsSelectPayerAccountTypesResult;

    /**
     * Gets the value of the wsSelectPayerAccountTypesResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsSelectPayerAccountTypesResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsSelectPayerAccountTypesResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsSelectPayerAccountTypesResult }
     * 
     * 
     */
    public List<WsSelectPayerAccountTypesResult> getWsSelectPayerAccountTypesResult() {
        if (wsSelectPayerAccountTypesResult == null) {
            wsSelectPayerAccountTypesResult = new ArrayList<WsSelectPayerAccountTypesResult>();
        }
        return this.wsSelectPayerAccountTypesResult;
    }

}
