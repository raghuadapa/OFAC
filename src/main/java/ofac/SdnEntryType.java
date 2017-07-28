
package ofac;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sdnEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sdnEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sdnType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Entity"/>
 *               &lt;enumeration value="Individual"/>
 *               &lt;enumeration value="Vessel"/>
 *               &lt;enumeration value="Aircraft"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programList" type="{http://tempuri.org/sdnList.xsd}programListType"/>
 *         &lt;element name="idList" type="{http://tempuri.org/sdnList.xsd}idListType" minOccurs="0"/>
 *         &lt;element name="akaList" type="{http://tempuri.org/sdnList.xsd}akaListType" minOccurs="0"/>
 *         &lt;element name="addressList" type="{http://tempuri.org/sdnList.xsd}addressListType" minOccurs="0"/>
 *         &lt;element name="nationalityList" type="{http://tempuri.org/sdnList.xsd}nationalityListType" minOccurs="0"/>
 *         &lt;element name="citizenshipList" type="{http://tempuri.org/sdnList.xsd}citizenshipListType" minOccurs="0"/>
 *         &lt;element name="dateOfBirthList" type="{http://tempuri.org/sdnList.xsd}dateOfBirthListType" minOccurs="0"/>
 *         &lt;element name="placeOfBirthList" type="{http://tempuri.org/sdnList.xsd}placeOfBirthListType" minOccurs="0"/>
 *         &lt;element name="vesselInfo" type="{http://tempuri.org/sdnList.xsd}vesselInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sdnEntryType", namespace = "http://tempuri.org/sdnList.xsd", propOrder = {
    "uid",
    "firstName",
    "lastName",
    "title",
    "sdnType",
    "remarks",
    "programList",
    "idList",
    "akaList",
    "addressList",
    "nationalityList",
    "citizenshipList",
    "dateOfBirthList",
    "placeOfBirthList",
    "vesselInfo"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SdnEntryType {

    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String uid;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String firstName;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String lastName;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String title;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String sdnType;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String remarks;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ProgramListType programList;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IdListType idList;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected AkaListType akaList;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected AddressListType addressList;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected NationalityListType nationalityList;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CitizenshipListType citizenshipList;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DateOfBirthListType dateOfBirthList;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PlaceOfBirthListType placeOfBirthList;
    @XmlElement(namespace = "http://tempuri.org/sdnList.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected VesselInfoType vesselInfo;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the sdnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSdnType() {
        return sdnType;
    }

    /**
     * Sets the value of the sdnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSdnType(String value) {
        this.sdnType = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the programList property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ProgramListType getProgramList() {
        return programList;
    }

    /**
     * Sets the value of the programList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setProgramList(ProgramListType value) {
        this.programList = value;
    }

    /**
     * Gets the value of the idList property.
     * 
     * @return
     *     possible object is
     *     {@link IdListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IdListType getIdList() {
        return idList;
    }

    /**
     * Sets the value of the idList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdList(IdListType value) {
        this.idList = value;
    }

    /**
     * Gets the value of the akaList property.
     * 
     * @return
     *     possible object is
     *     {@link AkaListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public AkaListType getAkaList() {
        return akaList;
    }

    /**
     * Sets the value of the akaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AkaListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAkaList(AkaListType value) {
        this.akaList = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public AddressListType getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAddressList(AddressListType value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the nationalityList property.
     * 
     * @return
     *     possible object is
     *     {@link NationalityListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public NationalityListType getNationalityList() {
        return nationalityList;
    }

    /**
     * Sets the value of the nationalityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalityListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNationalityList(NationalityListType value) {
        this.nationalityList = value;
    }

    /**
     * Gets the value of the citizenshipList property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenshipListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CitizenshipListType getCitizenshipList() {
        return citizenshipList;
    }

    /**
     * Sets the value of the citizenshipList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenshipListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCitizenshipList(CitizenshipListType value) {
        this.citizenshipList = value;
    }

    /**
     * Gets the value of the dateOfBirthList property.
     * 
     * @return
     *     possible object is
     *     {@link DateOfBirthListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DateOfBirthListType getDateOfBirthList() {
        return dateOfBirthList;
    }

    /**
     * Sets the value of the dateOfBirthList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOfBirthListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDateOfBirthList(DateOfBirthListType value) {
        this.dateOfBirthList = value;
    }

    /**
     * Gets the value of the placeOfBirthList property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfBirthListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PlaceOfBirthListType getPlaceOfBirthList() {
        return placeOfBirthList;
    }

    /**
     * Sets the value of the placeOfBirthList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfBirthListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPlaceOfBirthList(PlaceOfBirthListType value) {
        this.placeOfBirthList = value;
    }

    /**
     * Gets the value of the vesselInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VesselInfoType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public VesselInfoType getVesselInfo() {
        return vesselInfo;
    }

    /**
     * Sets the value of the vesselInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselInfoType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-07-28T01:38:31-04:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVesselInfo(VesselInfoType value) {
        this.vesselInfo = value;
    }

}
