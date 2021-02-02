
package com.lftechnology.gmt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfwsReleasedTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfwsReleasedTransactions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsReleasedTransactions" type="{http://schemas.datacontract.org/2004/07/gmtpay}wsReleasedTransactions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfwsReleasedTransactions", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "wsReleasedTransactions"
})
public class ArrayOfwsReleasedTransactions {

    @XmlElement(nillable = true)
    protected List<WsReleasedTransactions> wsReleasedTransactions;

    /**
     * Gets the value of the wsReleasedTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsReleasedTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsReleasedTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsReleasedTransactions }
     * 
     * 
     */
    public List<WsReleasedTransactions> getWsReleasedTransactions() {
        if (wsReleasedTransactions == null) {
            wsReleasedTransactions = new ArrayList<WsReleasedTransactions>();
        }
        return this.wsReleasedTransactions;
    }

}
