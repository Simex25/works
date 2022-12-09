package data.repositories;

import data.models.PhoneBook;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.Objects;

public class PhoneBookRepositoryImpl implements PhoneBookRepository {
    private ArrayList<PhoneBook>phonebooks = new ArrayList<PhoneBook>();
    @Override
    public PhoneBook save(PhoneBook phonebook) {
        PhoneBook savedPhoneBook = findById(phonebook.getOwnerPhoneNumber());
        if (savedPhoneBook == null) {
            phonebooks.add(phonebook);
        }
        else {
            updateSavedPhoneBook(phonebook, savedPhoneBook);
        }

        return phonebook;
    }
    private void updateSavedPhoneBook(PhoneBook phoneBook, PhoneBook savedPhoneBook) {
        savedPhoneBook.setOwnersName(phoneBook.getOwnersName());
        savedPhoneBook.setContactList(phoneBook.getContactList());
        savedPhoneBook.setOwnerPhoneNumber(phoneBook.getOwnerPhoneNumber());
    }
    @Override
    public void delete(PhoneBook phonebook) {

    }

    @Override
    public int count() {
        return phonebooks.size();
    }

    @Override
    public PhoneBook findById(String phoneNumber) {
        for (PhoneBook phoneBook: phonebooks) {
            String storedPhoneNumber = phoneBook.getOwnerPhoneNumber();
            boolean phoneNumberMatches = storedPhoneNumber.equals(phoneNumber);
           if (phoneNumberMatches) {
               return phoneBook;
           }


        }
        return null;
    }
}
