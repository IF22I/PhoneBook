package com.company;

import java.util.HashMap;

public class PhoneBook extends PhoneContact {

    HashMap<Integer, PhoneContact> Map = new HashMap<>();

    @Override
    public void addContact(int id, PhoneContact phoneContact){

        Map.put(id, phoneContact);

    }

    @Override
    public void removeContact(int id){

        Map.remove(id);

    }

}
