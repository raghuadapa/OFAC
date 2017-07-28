
package ofac;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ofac package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SdnList_QNAME = new QName("http://tempuri.org/sdnList.xsd", "sdnList");
    private final static QName _AddressTypePostalCode_QNAME = new QName("http://tempuri.org/sdnList.xsd", "postalCode");
    private final static QName _AddressTypeAddress1_QNAME = new QName("http://tempuri.org/sdnList.xsd", "address1");
    private final static QName _AddressTypeAddress2_QNAME = new QName("http://tempuri.org/sdnList.xsd", "address2");
    private final static QName _AddressTypeCity_QNAME = new QName("http://tempuri.org/sdnList.xsd", "city");
    private final static QName _AddressTypeStateOrProvince_QNAME = new QName("http://tempuri.org/sdnList.xsd", "stateOrProvince");
    private final static QName _AddressTypeAddress3_QNAME = new QName("http://tempuri.org/sdnList.xsd", "address3");
    private final static QName _AddressTypeUid_QNAME = new QName("http://tempuri.org/sdnList.xsd", "uid");
    private final static QName _AddressTypeCountry_QNAME = new QName("http://tempuri.org/sdnList.xsd", "country");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ofac
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SdnListType }
     * 
     */
    public SdnListType createSdnListType() {
        return new SdnListType();
    }

    /**
     * Create an instance of {@link AkaType }
     * 
     */
    public AkaType createAkaType() {
        return new AkaType();
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link CitizenshipType }
     * 
     */
    public CitizenshipType createCitizenshipType() {
        return new CitizenshipType();
    }

    /**
     * Create an instance of {@link CitizenshipListType }
     * 
     */
    public CitizenshipListType createCitizenshipListType() {
        return new CitizenshipListType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DateOfBirthItemType }
     * 
     */
    public DateOfBirthItemType createDateOfBirthItemType() {
        return new DateOfBirthItemType();
    }

    /**
     * Create an instance of {@link PlaceOfBirthItemType }
     * 
     */
    public PlaceOfBirthItemType createPlaceOfBirthItemType() {
        return new PlaceOfBirthItemType();
    }

    /**
     * Create an instance of {@link PublshInformationType }
     * 
     */
    public PublshInformationType createPublshInformationType() {
        return new PublshInformationType();
    }

    /**
     * Create an instance of {@link ProgramListType }
     * 
     */
    public ProgramListType createProgramListType() {
        return new ProgramListType();
    }

    /**
     * Create an instance of {@link NationalityType }
     * 
     */
    public NationalityType createNationalityType() {
        return new NationalityType();
    }

    /**
     * Create an instance of {@link AkaListType }
     * 
     */
    public AkaListType createAkaListType() {
        return new AkaListType();
    }

    /**
     * Create an instance of {@link NationalityListType }
     * 
     */
    public NationalityListType createNationalityListType() {
        return new NationalityListType();
    }

    /**
     * Create an instance of {@link IdListType }
     * 
     */
    public IdListType createIdListType() {
        return new IdListType();
    }

    /**
     * Create an instance of {@link AddressListType }
     * 
     */
    public AddressListType createAddressListType() {
        return new AddressListType();
    }

    /**
     * Create an instance of {@link VesselInfoType }
     * 
     */
    public VesselInfoType createVesselInfoType() {
        return new VesselInfoType();
    }

    /**
     * Create an instance of {@link DateOfBirthListType }
     * 
     */
    public DateOfBirthListType createDateOfBirthListType() {
        return new DateOfBirthListType();
    }

    /**
     * Create an instance of {@link SdnEntryType }
     * 
     */
    public SdnEntryType createSdnEntryType() {
        return new SdnEntryType();
    }

    /**
     * Create an instance of {@link PlaceOfBirthListType }
     * 
     */
    public PlaceOfBirthListType createPlaceOfBirthListType() {
        return new PlaceOfBirthListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdnListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "sdnList")
    public JAXBElement<SdnListType> createSdnList(SdnListType value) {
        return new JAXBElement<SdnListType>(_SdnList_QNAME, SdnListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "postalCode", scope = AddressType.class)
    public JAXBElement<String> createAddressTypePostalCode(String value) {
        return new JAXBElement<String>(_AddressTypePostalCode_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "address1", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddress1(String value) {
        return new JAXBElement<String>(_AddressTypeAddress1_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "address2", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddress2(String value) {
        return new JAXBElement<String>(_AddressTypeAddress2_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "city", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCity(String value) {
        return new JAXBElement<String>(_AddressTypeCity_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "stateOrProvince", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeStateOrProvince(String value) {
        return new JAXBElement<String>(_AddressTypeStateOrProvince_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "address3", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddress3(String value) {
        return new JAXBElement<String>(_AddressTypeAddress3_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "uid", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeUid(String value) {
        return new JAXBElement<String>(_AddressTypeUid_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/sdnList.xsd", name = "country", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCountry(String value) {
        return new JAXBElement<String>(_AddressTypeCountry_QNAME, String.class, AddressType.class, value);
    }

}
