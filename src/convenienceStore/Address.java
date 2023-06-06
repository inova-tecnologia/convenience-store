package convenienceStore;

public class Address {
	
	private Integer zipCode;
	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private Integer number;
	private String complement;   
	
	public Address(Integer zipCode, String state, String city, String neighborhood, String street,
			Integer number, String complement){
			this.zipCode = zipCode;
			this.state = state;
			this.city = city;
			this.neighborhood = neighborhood;
			this.street = street;
			this.number = number;
			this.complement = complement;    
	}
}
   