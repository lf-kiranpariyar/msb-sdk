
package com.lftechnology.gmt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfwsVoidTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfwsVoidTransactions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsVoidTransactions" type="{http://schemas.datacontract.org/2004/07/gmtpay}wsVoidTransactions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfwsVoidTransactions", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "wsVoidTransactions"
})
public class ArrayOfwsVoidTransactions {

    @XmlElement(nillable = true)
    protected List<WsVoidTransactions> wsVoidTransactions;

    /**
     * Gets the value of the wsVoidTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsVoidTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsVoidTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsVoidTransactions }
     * 
     * 
     */
    public List<WsVoidTransactions> getWsVoidTransactions() {
        if (wsVoidTransactions == null) {
            wsVoidTransactions = new ArrayList<WsVoidTransactions>();
        }
        return this.wsVoidTransactions;
    }

}
