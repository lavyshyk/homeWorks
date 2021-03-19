package shop.customers;

public class Address {

    private int doorNo;
    private String street;
    private String city;
    private String zip;

    public Address(int doorNo, String street, String city, String zip) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
}
