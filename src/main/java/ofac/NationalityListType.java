
package ofac;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nationalityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nationalityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nationality" type="{http://tempuri.org/sdnList.xsd}nationalityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nationalityListType", namespace = "http://tempuri.org/sdnList.xsd", propOrder = {
    "nationality"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class NationalityListType {

    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<NationalityType> nationality;

    /**
     * Gets the value of the nationality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalityType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<NationalityType> getNationality() {
        if (nationality == null) {
            nationality = new ArrayList<NationalityType>();
        }
        return this.nationality;
    }

}
