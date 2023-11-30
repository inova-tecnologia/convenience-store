package convenienceStore;
import java.util.Date;
import java.util.UUID;

public class Person {

    protected String id = UUID.randomUUID().toString();
    protected int socialSecurityNumber;
    protected String name;
    protected Date birthDate;   
    protected Address address;
    protected String phoneNumber;
    protected String mail;   
    
    public Person(int socialSecurityNumber, String name, Date birthDate, Address address, String phoneNumber, String mail) {
        this.id = UUID.randomUUID().toString();
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address; 
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }
    
    public String getId() {   
        return id;
    }
    
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public String getName() {
        return name;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getMail() {
        return mail;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
       
}
