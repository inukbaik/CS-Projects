package Fall_Demos;


public class SchoolAssociate {

	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	public SchoolAssociate(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		if (email.indexOf('@') < 0) {
			System.out.println("SchoolAssociate: email address invalid!");
		} else {
			this.email = email;
		}
	}

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return name;
	}
}
