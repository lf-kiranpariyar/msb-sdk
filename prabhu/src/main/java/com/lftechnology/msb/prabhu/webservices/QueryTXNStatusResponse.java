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
 *         &lt;element name="QueryTXNStatusResult" type="{WebServices}Return_TXNStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryTXNStatusResult"
})
@XmlRootElement(name = "QueryTXNStatusResponse")
public class QueryTXNStatusResponse {

    @XmlElement(name = "QueryTXNStatusResult", required = true)
    protected ReturnTXNStatus queryTXNStatusResult;

    /**
     * Gets the value of the queryTXNStatusResult property.
     *
     * @return possible object is
     * {@link ReturnTXNStatus }
     */
    public ReturnTXNStatus getQueryTXNStatusResult() {
        return queryTXNStatusResult;
    }

    /**
     * Sets the value of the queryTXNStatusResult property.
     *
     * @param value allowed object is
     *              {@link ReturnTXNStatus }
     */
    public void setQueryTXNStatusResult(ReturnTXNStatus value) {
        this.queryTXNStatusResult = value;
    }

}
