
package ofac;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sdnListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sdnListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publshInformation" type="{http://tempuri.org/sdnList.xsd}publshInformationType"/>
 *         &lt;element name="sdnEntry" type="{http://tempuri.org/sdnList.xsd}sdnEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sdnListType", namespace = "http://tempuri.org/sdnList.xsd", propOrder = {
    "publshInformation",
    "sdnEntry"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SdnListType {

    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PublshInformationType publshInformation;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<SdnEntryType> sdnEntry;

    /**
     * Gets the value of the publshInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PublshInformationType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PublshInformationType getPublshInformation() {
        return publshInformation;
    }

    /**
     * Sets the value of the publshInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublshInformationType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPublshInformation(PublshInformationType value) {
        this.publshInformation = value;
    }

    /**
     * Gets the value of the sdnEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdnEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdnEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdnEntryType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<SdnEntryType> getSdnEntry() {
        if (sdnEntry == null) {
            sdnEntry = new ArrayList<SdnEntryType>();
        }
        return this.sdnEntry;
    }

}
