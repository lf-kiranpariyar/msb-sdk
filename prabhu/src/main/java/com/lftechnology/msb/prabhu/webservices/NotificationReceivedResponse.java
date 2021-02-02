package com.lftechnology.msb.prabhu.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationReceivedResult" type="{WebServices}Return_NotificationStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "notificationReceivedResult"
})
@XmlRootElement(name = "NotificationReceivedResponse")
public class NotificationReceivedResponse {

    @XmlElement(name = "NotificationReceivedResult", required = true)
    protected ReturnNotificationStatus notificationReceivedResult;

    /**
     * Gets the value of the notificationReceivedResult property.
     *
     * @return possible object is
     * {@link ReturnNotificationStatus }
     */
    public ReturnNotificationStatus getNotificationReceivedResult() {
        return notificationReceivedResult;
    }

    /**
     * Sets the value of the notificationReceivedResult property.
     *
     * @param value allowed object is
     *              {@link ReturnNotificationStatus }
     */
    public void setNotificationReceivedResult(ReturnNotificationStatus value) {
        this.notificationReceivedResult = value;
    }

}
