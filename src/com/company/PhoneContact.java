package com.company;

import java.util.Objects;

public abstract class PhoneContact {

    private Integer id;
    private String name;
    private String surname;
    private String phoneNumber;
    private Integer age;
    private boolean isHidden;
    private Integer isMobile;

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

    public PhoneContact() {

    }

    public PhoneContact(Integer id, String name, String surname, String phoneNumber, Integer age, boolean isHidden, Integer isMobile) {
        this.id = id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}