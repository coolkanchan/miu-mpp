package foreach;

public class Customer {
	
	private String name;
	private String address;
	private String city;
	private String zip;
	
	
	public Customer(String name, String address, String city, String zip) {
		
		this.name=name;
		this.city=city;
		this.zip= zip;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}
	

}
