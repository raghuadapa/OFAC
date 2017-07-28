
package ofac;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressType", namespace = "http://tempuri.org/sdnList.xsd", propOrder = {
    "uidOrAddress1OrAddress2"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class AddressType {

    @XmlElementRefs({
        @XmlElementRef(name = "address1", namespace = "http://tempuri.org/sdnList.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "city", namespace = "http://tempuri.org/sdnList.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address2", namespace = "http://tempuri.org/sdnList.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uid", namespace = "http://tempuri.org/sdnList.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "stateOrProvince", namespace = "http://tempuri.org/sdnList.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address3", namespace = "http://tempuri.org/sdnList.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "postalCode", namespace = "http://tempuri.org/sdnList.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "country", namespace = "http://tempuri.org/sdnList.xsd", type = JAXBElement.class, required = false)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<JAXBElement<String>> uidOrAddress1OrAddress2;

    /**
     * Gets the value of the uidOrAddress1OrAddress2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uidOrAddress1OrAddress2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUidOrAddress1OrAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<JAXBElement<String>> getUidOrAddress1OrAddress2() {
        if (uidOrAddress1OrAddress2 == null) {
            uidOrAddress1OrAddress2 = new ArrayList<JAXBElement<String>>();
        }
        return this.uidOrAddress1OrAddress2;
    }

}
