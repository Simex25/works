package data.models;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private  String ownersName;
    private String ownersPhoneNumber;
    private List<Contact > contacts = new ArrayList<>();

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }


    public String getOwnerPhoneNumber() {
        return ownersPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownersPhoneNumber) {
        this.ownersPhoneNumber = ownersPhoneNumber;
    }

    public List<Contact> getContactList() {
        return contacts;
    }

    public void setContactList(List<Contact> contactList) {
        this.contacts = contactList;
    }
}
