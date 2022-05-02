package com.company;

public class Main {

    public static void main(String[] args) {

        MobileContact mobileContact = new MobileContact("", "Wierzbicki", "5145145314", 27, false, 0);
        mobileContact.printContactCard(mobileContact);
        mobileContact.addContact(mobileContact.getId(), mobileContact);

        PrivateContact privateContact = new PrivateContact("a", "Wierzbicki", "514514314", 27, false, 0);
        privateContact.printContactCard(privateContact);
        privateContact.addContact(privateContact.getId(), privateContact);

        WorkContact workContact = new WorkContact("b", "Wierzbicki", "51455314", 27, false, 0);
        workContact.printContactCard(workContact);
        workContact.addContact(workContact.getId(), workContact);

    }

}