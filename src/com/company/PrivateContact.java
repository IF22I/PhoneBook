package com.company;

import java.util.Objects;

public class PrivateContact extends PhoneContact implements PrintableContact, StorableContact {

    public PrivateContact(Integer id, String name, String surname, String phoneNumber, Integer age, boolean isHidden, Integer isMobile) {
        super(id, name, surname, phoneNumber, age, isHidden, isMobile);
    }

    public void printContact(PrivateContact privateContact){
        super.printContact(privateContact);
    }

    public void printContactCard(PrivateContact privateContact) {
        super.printContactCard(privateContact);
    }

    public String getContact(PrivateContact privateContact) {
        return super.getContact(privateContact);
    }

    public String getContactRaw(PrivateContact privateContact) {
        return super.getContact(privateContact);
    }

}