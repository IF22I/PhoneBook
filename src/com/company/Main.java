package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        MobileContact mobileContact = new MobileContact(1, "", "Wierzbicki", "5145145314", 27, false, 0);

//        mobileContact.PrintInfo();
//        System.out.println("======");
//        mobileContact.printContact(mobileContact);
//        mobileContact.printContact();
        PrivateContact privateContact = new PrivateContact(1, "", "Wierzbicki", "5145145314", 27, false, 0);
        privateContact.printContactCard(privateContact);
        PrivateContact privateContact2 = new PrivateContact(1, "", "Wierzbicki", "5145145314", 27, false, 0);
        privateContact2.printContactCard(privateContact2);

//        PhoneContact tab[];
//        tab = new PhoneContact[5];

//        printContactCard(phoneContact);
//        printContact(phoneContact);
//        getContact(phoneContact);
//        getContactRaw(phoneContact);

    }

}