package data.repositories;

import data.models.PhoneBook;

public interface PhoneBookRepository {
    PhoneBook save(PhoneBook phonebook);
    void delete(PhoneBook phonebook);
    int count();


    PhoneBook findById(String phoneNumber);
}
