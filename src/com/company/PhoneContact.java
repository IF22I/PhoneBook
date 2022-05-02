package com.company;

import java.util.Objects;

public abstract class PhoneContact {

    private Integer id = 0;
    private String name;
    private String surname;
    private String phoneNumber;
    private Integer age;
    private boolean isHidden;
    private Integer isMobile;
    private static int numsCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public Integer getIsMobile() {
        return isMobile;
    }

    public void setIsMobile(Integer isMobile) {
        this.isMobile = isMobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PhoneContact() {

    }

    public PhoneContact(String name, String surname, String phoneNumber, Integer age, boolean isHidden, Integer isMobile) {

        numsCount++;
        this.id = id+numsCount;

        if (Objects.equals(name, "")){
            this.name = "NIEZNANE";
        } else {
            this.name = name;
        }

        if (Objects.equals(surname, "")){
            this.surname = "NIEZNANE";
        } else {
            this.surname = surname;
        }

        if (phoneNumber.length() != 9){
            this.phoneNumber = "000000000";
        } else {
            this.phoneNumber = phoneNumber;
        }

        this.age = age;
        this.isHidden = isHidden;
        this.isMobile = isMobile;

    }

    public void PrintInfo(){
        System.out.printf(" NAME: %s%n SURNAME: %s%n NUMBER: %s%n AGE: %d%n ", getName(), getSurname(), getPhoneNumber(), getAge() );
    }

    public void printContactCard(PhoneContact phoneContact) {
        System.out.println("ID: " + phoneContact.getId());
        System.out.println("Imię: " + phoneContact.getName());
        System.out.println("Nazwisko: " + phoneContact.getSurname());
        System.out.println("Wiek: " + phoneContact.getAge());
        System.out.println("Numer telefonu: " + phoneContact.getPhoneNumber());
    }

    public void printContact(PhoneContact phoneContact) {
        System.out.println(phoneContact.getId() + " | " + phoneContact.getName() + " | " + phoneContact.getSurname() + " | " + phoneContact.getAge() + " | " + phoneContact.getPhoneNumber());
    }

    public String getContact(PhoneContact phoneContact){
        if(Objects.equals(phoneContact.getName(), "")){
            phoneContact.setName("NIEZNANY");
        } else if(Objects.equals(phoneContact.getSurname(), "")){
            phoneContact.setSurname("NIEZNANY");
        } else if(phoneContact.getPhoneNumber().length()!=9){
            phoneContact.setPhoneNumber("000000000");
        }
        return  (phoneContact.getId() + " | " + phoneContact.getName() + " | " + phoneContact.getSurname() + " | " + phoneContact.getAge() + " | " + phoneContact.getPhoneNumber());
    }

    public String getContactRaw(PhoneContact phoneContact){
        String id = phoneContact.getId().toString();
        String age = phoneContact.getAge().toString();
        String isMobile = phoneContact.getIsMobile().toString();
        String wynik = (String.join(";",id,phoneContact.getName(), phoneContact.getSurname(),age, phoneContact.getSurname(),isMobile));
        return wynik;
    }

    public void addContact(int id, PhoneContact phoneContact){

    }

    public void removeContact(int id){

    }


}