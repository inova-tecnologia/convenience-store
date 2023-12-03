package convenienceStore;

import java.util.Date;

public class Customer extends Person{	 
	public Customer(int socialSecurityNumber, String name, Date birthDate, Address address, String phoneNumber, String mail) {
		super(socialSecurityNumber, name, birthDate, address, phoneNumber, mail);
	}	
}
