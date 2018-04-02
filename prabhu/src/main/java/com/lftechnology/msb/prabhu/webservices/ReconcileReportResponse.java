
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
 *         &lt;element name="ReconcileReportResult" type="{WebServices}ArrayOfReturn_TRANSREPORT" minOccurs="0"/>
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
    "reconcileReportResult"
})
@XmlRootElement(name = "ReconcileReportResponse")
public class ReconcileReportResponse {

    @XmlElement(name = "ReconcileReportResult")
    protected ArrayOfReturnTRANSREPORT reconcileReportResult;

    /**
     * Gets the value of the reconcileReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReturnTRANSREPORT }
     *     
     */
    public ArrayOfReturnTRANSREPORT getReconcileReportResult() {
        return reconcileReportResult;
    }

    /**
     * Sets the value of the reconcileReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReturnTRANSREPORT }
     *     
     */
    public void setReconcileReportResult(ArrayOfReturnTRANSREPORT value) {
        this.reconcileReportResult = value;
    }

}
