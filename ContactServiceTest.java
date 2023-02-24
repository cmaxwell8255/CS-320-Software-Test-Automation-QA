package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {

//need to test add, delete and update
//templates
/*
* Contact("1413252", "Jane", "Doe", "4444444444", "Sample 24 Drive");
Contact("1309403", "Malleus", "Draconia", "2187123404", "Valley of Thorns");
Contact("9752319", "Vil", "Schoenheit", "9215501793", "Land of Proxynee");
*/

@Test
public void testAdd()
{
ContactService cs = new ContactService();
Contact test1 = new Contact("1413252", "Jane", "Doe", "4444444444", "Sample 24 Drive");
//assertTrue(test1.equals(test.addContact("1413252", "Jane", "Doe", "4444444444", "Sample 24 Drive")));
assertEquals(true, cs.addContact(test1));

}
}