package myapp;

public class MyApp {

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("123 some st.");
        address.setCity("Islamabad");
        address.setCountry("Pakistan");
        
        Person person = new Person();
        person.setName("Junaid Durrani");
        person.setContactNumber("123...");
        person.setAddress(address);

        String myAddress = person.getAddress().getStreet() + " " + person.getAddress().getCity() + " " + person.getAddress().getCountry();
        
        System.out.println(String.format("%s\n%s\n%s", person.getName(), person.getContactNumber(), myAddress));
        
    }
    
}
