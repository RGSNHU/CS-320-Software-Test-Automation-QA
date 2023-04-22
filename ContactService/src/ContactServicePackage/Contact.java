package ContactServicePackage;

public class Contact{
	// The Variables for the contacts
	private String contactID;
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	
	// Here we are making sure that All of our requirements are being meet
	public Contact(String contactID, String firstName, String lastName,
		String Number, String Address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ContactID");
		}
		if (firstName.length() > 10 || firstName == null) {
			throw new IllegalArgumentException("Invalid First name");
		}
		if (lastName.length() > 10 || lastName == null) {
			throw new IllegalArgumentException("Invalid Last name");
		}
		if (Number.length() != 10 || Number == null) {
			throw new IllegalArgumentException("Invalid Phone number");
		}
		if (Address.length() > 30 || Address == null) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;
	}
	
	// All of the getters and setters for the variables
	public String getContactID() {
		return contactID;
	}

	public void setContactID(String contactID) {
		this.contactID = contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String Number) {
		
		this.Number = Number;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		
		this.Address = Address;
	}
	
	
	
	
}