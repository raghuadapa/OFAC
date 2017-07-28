
package ofac;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placeOfBirthListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="placeOfBirthListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placeOfBirthItem" type="{http://tempuri.org/sdnList.xsd}placeOfBirthItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeOfBirthListType", namespace = "http://tempuri.org/sdnList.xsd", propOrder = {
    "placeOfBirthItem"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PlaceOfBirthListType {

    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<PlaceOfBirthItemType> placeOfBirthItem;

    /**
     * Gets the value of the placeOfBirthItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeOfBirthItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceOfBirthItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceOfBirthItemType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<PlaceOfBirthItemType> getPlaceOfBirthItem() {
        if (placeOfBirthItem == null) {
            placeOfBirthItem = new ArrayList<PlaceOfBirthItemType>();
        }
        return this.placeOfBirthItem;
    }

}
