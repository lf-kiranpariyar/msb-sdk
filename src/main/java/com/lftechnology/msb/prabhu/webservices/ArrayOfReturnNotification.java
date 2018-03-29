
package com.lftechnology.msb.prabhu.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReturn_Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReturn_Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Return_Notification" type="{WebServices}Return_Notification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReturn_Notification", propOrder = {
    "returnNotification"
})
public class ArrayOfReturnNotification {

    @XmlElement(name = "Return_Notification")
    protected List<ReturnNotification> returnNotification;

    /**
     * Gets the value of the returnNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnNotification }
     * 
     * 
     */
    public List<ReturnNotification> getReturnNotification() {
        if (returnNotification == null) {
            returnNotification = new ArrayList<ReturnNotification>();
        }
        return this.returnNotification;
    }

}
