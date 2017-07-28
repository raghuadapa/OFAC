
package ofac;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for akaListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="akaListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aka" type="{http://tempuri.org/sdnList.xsd}akaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "akaListType", namespace = "http://tempuri.org/sdnList.xsd", propOrder = {
    "aka"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class AkaListType {

    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<AkaType> aka;

    /**
     * Gets the value of the aka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AkaType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<AkaType> getAka() {
        if (aka == null) {
            aka = new ArrayList<AkaType>();
        }
        return this.aka;
    }

}
