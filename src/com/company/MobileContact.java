package com.company;

import java.util.Objects;

public class MobileContact extends PhoneContact implements PrintableContact, StorableContact {

    public MobileContact(String name, String surname, String phoneNumber, Integer age, boolean isHidden, Integer isMobile) {
        super(name, surname, phoneNumber, age, isHidden, isMobile);
    }

    public void printContact(PrivateContact privateContact){
        super.printContact(privateContact);
    }

    public void printContactCard(MobileContact mobileContact) {
        super.printContactCard(mobileContact);
    }

    public String getContact(MobileContact mobileContact) {
        return super.getContact(mobileContact);
    }

    public String getContactRaw(MobileContact mobileContact) {
        return super.getContact(mobileContact);
    }

}
