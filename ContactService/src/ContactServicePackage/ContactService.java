package ContactServicePackage; 

import java.util.ArrayList;


public class ContactService {
	// Sets up the array to hold all of the contacts
	ArrayList<Contact> contacts;
	
	// sets up the function to access the arrayList
	public ContactService() {
		contacts = new ArrayList<>();
	}
	// Here we use a boolean so that we can test the function 
	public boolean newcontact(Contact contact) {
		// Loops us Through the ArrayList
		for (Contact List:contacts) {
			// Checks on if the it is a unique contactID or not 
			if(List.getContactID() == contact.getContactID()) {
				return false;
			}
		}
		// if the Contact id is unique it adds it to the array
		contacts.add(contact);
		return true;
	}
		
	
	

		public boolean deleteOption(String IdForContact) {	
		//loops through our array
		for(Contact List:contacts) {
			// Checks and only removes the contact Id entered
			if(List.getContactID().equals(IdForContact)) {
				// Removes it from the array
				contacts.remove(List);
				return true;
				
			}
	}
		// Returns false if not in the array
		return false;
	
	}
	
	public boolean UpdateOption(String contactID, String firstName, String lastName,
			String Number, String Address) {
		//Loop again
		for (Contact List: contacts) {
			// Recheck all requirements for new entries
			if(List.getContactID().equals(contactID)) {
				if (firstName.length() > 10 || firstName == null) {
					return false;
				}
				if (lastName.length() > 10 || lastName == null) {
					return false;
				}
				if (Number.length() != 10 || Number == null) {
					return false;
				}
				if (Address.length() > 30 || Address == null) {
					return false;
					
					
				}
				// If it meets all of the requirements then it changes the contact 
				else {
					List.setFirstName(firstName);
					List.setLastName(lastName);
					List.setNumber(Number);
					List.setAddress(Address);
					return true;
				}
			}
		}
		
		
		
				return false;
		
	}
	
}

