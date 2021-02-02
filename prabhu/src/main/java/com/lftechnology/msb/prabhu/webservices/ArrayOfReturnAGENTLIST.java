package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfReturn_AGENTLIST complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfReturn_AGENTLIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Return_AGENTLIST" type="{WebServices}Return_AGENTLIST" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReturn_AGENTLIST", propOrder = {
        "returnAGENTLIST"
})
public class ArrayOfReturnAGENTLIST {

    @XmlElement(name = "Return_AGENTLIST")
    protected List<ReturnAGENTLIST> returnAGENTLIST;

    /**
     * Gets the value of the returnAGENTLIST property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnAGENTLIST property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnAGENTLIST().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnAGENTLIST }
     */
    public List<ReturnAGENTLIST> getReturnAGENTLIST() {
        if (returnAGENTLIST == null) {
            returnAGENTLIST = new ArrayList<ReturnAGENTLIST>();
        }
        return this.returnAGENTLIST;
    }

}
