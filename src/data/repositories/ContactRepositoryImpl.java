package data.repositories;

import data.models.Contact;

import java.util.ArrayList;

public class ContactRepositoryImpl implements ContactRepository {
private ArrayList<Contact> contacts = new ArrayList<>();
    @Override
    public Contact save(Contact contact) {
        contact.getFirstName();
        contact.getLastName();
        contact.getPhoneNumber();
        contacts.add(contact);
        return null;
    }

    @Override
    public void delete(Contact contact) {

    }

    @Override
    public int count() {
        return contacts.size();
    }

    @Override
    public Contact findById(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber));
            return contact;
        }
        return null;
    }
}
