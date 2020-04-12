package myapp;

public class Person {
    
    private String name;
    private String contactNumber;
    private Address address;

    public Person(String name, String contactNumber, Address address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public Person() {
        
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}
