
package com.lftechnology.gmt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfwsPaidTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfwsPaidTransactions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsPaidTransactions" type="{http://schemas.datacontract.org/2004/07/gmtpay}wsPaidTransactions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfwsPaidTransactions", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "wsPaidTransactions"
})
public class ArrayOfwsPaidTransactions {

    @XmlElement(nillable = true)
    protected List<WsPaidTransactions> wsPaidTransactions;

    /**
     * Gets the value of the wsPaidTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsPaidTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsPaidTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPaidTransactions }
     * 
     * 
     */
    public List<WsPaidTransactions> getWsPaidTransactions() {
        if (wsPaidTransactions == null) {
            wsPaidTransactions = new ArrayList<WsPaidTransactions>();
        }
        return this.wsPaidTransactions;
    }

}
