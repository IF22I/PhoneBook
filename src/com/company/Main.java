package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        PhoneContact phoneContact = new MobileContact(1, "", "Wierzbicki", "5145145314", 27, false, 0);

//        phoneContact.PrintInfo();
//        PhoneContact tab[];
//        tab = new PhoneContact[5];

        printContactCard(phoneContact);
        printContact(phoneContact);
        getContact(phoneContact);
        getContactRaw(phoneContact);

    }

    static void printContactCard(PhoneContact phoneContact) {
        System.out.println("ID: " + phoneContact.getId());
        System.out.println("Imię: " + phoneContact.getName());
        System.out.println("Nazwisko: " + phoneContact.getSurname());
        System.out.println("Wiek: " + phoneContact.getAge());
        System.out.println("Numer telefonu: " + phoneContact.getPhoneNumber());
    }

    static void printContact(PhoneContact phoneContact) {
        System.out.println(phoneContact.getId() + " | " + phoneContact.getName() + " | " + phoneContact.getSurname() + " | " + phoneContact.getAge() + " | " + phoneContact.getPhoneNumber());
    }

    static String getContact(PhoneContact phoneContact){
        if(Objects.equals(phoneContact.getName(), "")){
            phoneContact.setName("NIEZNANY");
        } else if(Objects.equals(phoneContact.getSurname(), "")){
            phoneContact.setSurname("NIEZNANY");
        } else if(phoneContact.getPhoneNumber().length()!=9){
            phoneContact.setPhoneNumber("000000000");
        }
        return  (phoneContact.getId() + " | " + phoneContact.getName() + " | " + phoneContact.getSurname() + " | " + phoneContact.getAge() + " | " + phoneContact.getPhoneNumber());
    }

    static String getContactRaw(PhoneContact phoneContact){
        String id = phoneContact.getId().toString();
        String age = phoneContact.getAge().toString();
        String isMobile = phoneContact.getIsMobile().toString();
        String wynik = (String.join(";",id,phoneContact.getName(), phoneContact.getSurname(),age, phoneContact.getSurname(),isMobile));
        return wynik;
    }
}