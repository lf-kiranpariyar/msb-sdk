
package com.lftechnology.msb.prabhu.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReturn_TRANSREPORT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReturn_TRANSREPORT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Return_TRANSREPORT" type="{WebServices}Return_TRANSREPORT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReturn_TRANSREPORT", propOrder = {
    "returnTRANSREPORT"
})
public class ArrayOfReturnTRANSREPORT {

    @XmlElement(name = "Return_TRANSREPORT")
    protected List<ReturnTRANSREPORT> returnTRANSREPORT;

    /**
     * Gets the value of the returnTRANSREPORT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnTRANSREPORT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnTRANSREPORT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnTRANSREPORT }
     * 
     * 
     */
    public List<ReturnTRANSREPORT> getReturnTRANSREPORT() {
        if (returnTRANSREPORT == null) {
            returnTRANSREPORT = new ArrayList<ReturnTRANSREPORT>();
        }
        return this.returnTRANSREPORT;
    }

}
