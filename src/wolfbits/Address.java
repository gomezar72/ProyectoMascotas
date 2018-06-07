
package wolfbits;


public class Address {

    private String street;
    private int nomenclature;
    private String floor;
    private String city;
    private String province;
    private String additionalInformation;

    public Address() {
    }

    public Address(String street, int nomenclature, String city, String province, String additionalInformation) {
        this.street = street;
        this.nomenclature = nomenclature;
        this.city = city;
        this.province = province;
        this.additionalInformation = additionalInformation;
    }

    public Address(String street, int nomenclature, String floor, String city, String province, String additionalInformation) {
        this.street = street;
        this.nomenclature = nomenclature;
        this.floor = floor;
        this.city = city;
        this.province = province;
        this.additionalInformation = additionalInformation;
    }

    public void setStreet(String st) {
        this.street = st;
    }

    public String getStreet() {
        return this.street;
    }

    public void setNomenclature(int nomenclature) {
        this.nomenclature = nomenclature;
    }

    public int getNomenclature() {
        return this.nomenclature;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloor() {
        return this.floor;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setProvince(String prov) {
        this.province = prov;
    }

    public String getProvince() {
        return this.province;
    }

    public void setAdditionaInformation(String AI) {
        this.additionalInformation = AI;
    }

    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

}
