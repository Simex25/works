package data.repositories;

import data.models.Contact;
import data.models.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {
    @Test
    public void contactCanBeSaved() {
        ContactRepositoryImpl contactRepository = new ContactRepositoryImpl();
        Contact contact =   new Contact();

        contact.setFirstName("simi");
        contact.setLastName("simi");
        contact.setPhoneNumber("123456");
        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());


    }
    @Test
    public void findContactById()  {
        ContactRepositoryImpl contactRepository = new ContactRepositoryImpl();
        Contact contact =   new Contact();

        contact.setFirstName("simi");
        contact.setLastName("simex");
        contact.setPhoneNumber("123456");
        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());
        contact = contactRepository.findById("123456");
        assertEquals("simi", contact.getFirstName());
        assertEquals("simex",contact.getLastName());
    }

}