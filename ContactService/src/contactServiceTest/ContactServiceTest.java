package contactServiceTest;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;


import ContactServicePackage.Contact;
import ContactServicePackage.ContactService;


class ContactServiceTest {

	@Test
	@DisplayName("New Contact Test")
	void newContactTest() {
		ContactService testArray = new ContactService();
		Contact contact = new Contact("987654321","FirstName","LastName","1234567890","Address");
		Assertions.assertEquals(true, testArray.newcontact(contact));
	
	}

	@Test
	@DisplayName("Test Delete Option")
	void deleteOptionTest() {
		
		ContactService testArray = new ContactService();
		Contact contact = new Contact("987654329","FirstName","LastName","1234567890","Address");
		Contact contact1 = new Contact("987654328","FirstName","LastName","1234567890","Address");
		Contact contact2 = new Contact("987654327","FirstName","LastName","1234567890","Address");
		
		testArray.newcontact(contact);
		testArray.newcontact(contact1);
		testArray.newcontact(contact2);
		
		
		Assertions.assertEquals(true, testArray.deleteOption("987654329"));
		Assertions.assertEquals(false, testArray.deleteOption("987654329"));
		
		
	}
	
	@Test
	@DisplayName("Check for updates")
	void updateOptionTest() {
		ContactService testArray = new ContactService();
		Contact contact = new Contact("987654329","FirstName","LastName","1234567890","Address");
		Contact contact1 = new Contact("987654328","FirstName","LastName","1234567890","Address");
		Contact contact2 = new Contact("987654327","FirstName","LastName","1234567890","Address");
		
		testArray.newcontact(contact);
		testArray.newcontact(contact1);
		testArray.newcontact(contact2);
		
		Assertions.assertEquals(true, testArray.UpdateOption("987654329","Ryan","Green","9876543210","NewAddress:"));
		Assertions.assertEquals(false, testArray.UpdateOption("1234567890","Ryan","Green","9876543210","NewAddress:" ));
	}
}
	

