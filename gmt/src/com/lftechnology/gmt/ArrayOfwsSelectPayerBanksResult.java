
package com.lftechnology.gmt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfws_Select_PayerBanksResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfws_Select_PayerBanksResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ws_Select_PayerBanksResult" type="{http://schemas.datacontract.org/2004/07/gmtpay}ws_Select_PayerBanksResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfws_Select_PayerBanksResult", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "wsSelectPayerBanksResult"
})
public class ArrayOfwsSelectPayerBanksResult {

    @XmlElement(name = "ws_Select_PayerBanksResult", nillable = true)
    protected List<WsSelectPayerBanksResult> wsSelectPayerBanksResult;

    /**
     * Gets the value of the wsSelectPayerBanksResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsSelectPayerBanksResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsSelectPayerBanksResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsSelectPayerBanksResult }
     * 
     * 
     */
    public List<WsSelectPayerBanksResult> getWsSelectPayerBanksResult() {
        if (wsSelectPayerBanksResult == null) {
            wsSelectPayerBanksResult = new ArrayList<WsSelectPayerBanksResult>();
        }
        return this.wsSelectPayerBanksResult;
    }

}
