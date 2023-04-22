package contactServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ContactServicePackage.Contact;

class ContactTest {

	@Test
	@DisplayName("Contact ID cant be more then 10")
	void ContacIDtest() {
		// Checks on the contact requirement
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("00000000001","FirstName","LastName","1234567890","Address");
	});
	}



	
	@Test
	@DisplayName("FirstName no greater than 10")
	void FirstNametest() {
		// Checks on the First name requirement 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","LongerFirstName","LastName","1234567890","Address");
		});
	}
	
	@Test
	@DisplayName("LastName TEST")
	void LastNametest() {
		// Makes sure the last name is under the length requirement 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","FirstName","LongerLastName","1234567890","Address");
		});
	}
	
	@Test
	@DisplayName("PhoneNumber TEST")
	void PhonenumberTest() { 
		// Phone numbers have to be 10 numbers 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","FirstName","LastName","12345678900","Address");
		
		});
	}
	
	@Test
	@DisplayName("Address TEST")
	void AddressTEST() { 
		// address test for length 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","FirstName","LastName","1234567890","ThisisAReallyLongAddressNeedsToBeLong");
		
		});
	}

	@Test
	@DisplayName("Testing Getters and Setters")
	// Makes sure all system work when requirements are met
	void ContactCreationTest() {
		Contact contacts = new Contact("1234567890","FirstName","LastName","1234567890","Address");
		assertTrue(contacts.getContactID().equals("1234567890"));
		assertTrue(contacts.getFirstName().equals("FirstName"));
		assertTrue(contacts.getLastName().equals("LastName"));
		assertTrue(contacts.getNumber().equals("1234567890"));
		assertTrue(contacts.getAddress().equals("Address"));
	}
}