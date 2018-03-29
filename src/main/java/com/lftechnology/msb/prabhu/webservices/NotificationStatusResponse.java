
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
 *         &lt;element name="NotificationStatusResult" type="{WebServices}ArrayOfReturn_Notification" minOccurs="0"/>
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
    "notificationStatusResult"
})
@XmlRootElement(name = "NotificationStatusResponse")
public class NotificationStatusResponse {

    @XmlElement(name = "NotificationStatusResult")
    protected ArrayOfReturnNotification notificationStatusResult;

    /**
     * Gets the value of the notificationStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReturnNotification }
     *     
     */
    public ArrayOfReturnNotification getNotificationStatusResult() {
        return notificationStatusResult;
    }

    /**
     * Sets the value of the notificationStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReturnNotification }
     *     
     */
    public void setNotificationStatusResult(ArrayOfReturnNotification value) {
        this.notificationStatusResult = value;
    }

}
