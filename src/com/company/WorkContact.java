package com.company;

import java.util.Objects;

public class WorkContact extends PhoneContact implements PrintableContact, StorableContact  {

    public WorkContact(String name, String surname, String phoneNumber, Integer age, boolean isHidden, Integer isMobile) {
        super(name, surname, phoneNumber, age, isHidden, isMobile);
    }

    public void printContact(PrivateContact privateContact){
        super.printContact(privateContact);
    }

    public void printContactCard(WorkContact workContact) {
        super.printContactCard(workContact);
    }

    public String getContact(WorkContact workContact) {
        return super.getContact(workContact);
    }

    public String getContactRaw(WorkContact workContact) {
        return super.getContact(workContact);
    }

}
