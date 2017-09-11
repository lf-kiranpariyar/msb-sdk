
package prabhu.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReturn_TransactionLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReturn_TransactionLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Return_TransactionLog" type="{WebServices}Return_TransactionLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReturn_TransactionLog", propOrder = {
    "returnTransactionLog"
})
public class ArrayOfReturnTransactionLog {

    @XmlElement(name = "Return_TransactionLog")
    protected List<ReturnTransactionLog> returnTransactionLog;

    /**
     * Gets the value of the returnTransactionLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnTransactionLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnTransactionLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnTransactionLog }
     * 
     * 
     */
    public List<ReturnTransactionLog> getReturnTransactionLog() {
        if (returnTransactionLog == null) {
            returnTransactionLog = new ArrayList<ReturnTransactionLog>();
        }
        return this.returnTransactionLog;
    }

}
