package data.repositories;

import data.models.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhoneBookRepositoryImplTest {
    PhoneBookRepository  phoneBookRepository;
    PhoneBook phoneBook;
    @BeforeEach
    public void setUp()  {
        phoneBookRepository = new PhoneBookRepositoryImpl();
        phoneBook = new PhoneBook();
    }

    @Test
    public  void savePhoneBookTotalPhoneBookIsOneTest() {
        // given I have a new phoneBook repository and a phonebook

        //when I try to save a contact
        phoneBookRepository.save(phoneBook);

        //assert equals count  is 1
        assertEquals(1, phoneBookRepository.count());

    }
    @Test
    public  void savePhoneBookFindByIdReturnSavedPhoneBook()  {
        // given that I have a new phonebook repository
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setOwnerPhoneNumber("9900");
        phoneBook.setOwnersName("Simi");
        phoneBookRepository.save(phoneBook);
        //when I save new phonebook
        PhoneBook updateSavedPhoneBook = new PhoneBook();
        updateSavedPhoneBook.setOwnersName("Simex");
        updateSavedPhoneBook.setOwnerPhoneNumber("9900");
        //and when I find by id
        phoneBookRepository.save(updateSavedPhoneBook);
        // assert that phonebook is equals to saved phonebook
        PhoneBook savedPhoneBook = phoneBookRepository.findById("9900");
        assertEquals(1,phoneBookRepository.count());
        assertEquals("Simex",savedPhoneBook.getOwnersName());
    }
}