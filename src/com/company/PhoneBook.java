package com.company;

import java.util.HashMap;

public class PhoneBook extends PhoneContact {

    HashMap<Integer, PhoneContact> ContactsMap = new HashMap<>();

    @Override
    public void addContact(int id, PhoneContact phoneContact){

        ContactsMap.put(id, phoneContact);

    }

    @Override
    public void removeContact(int id){

        ContactsMap.remove(id);

    }

}
