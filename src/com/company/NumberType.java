package com.company;

public enum NumberType {
    HOME("Domowy"),
    MOBI("Komórkowy"),
    WORK("Służbowy");


    String numberName;

    NumberType(String numberName){
        this.numberName = numberName;
    }

    public String getNumberName(){
        return numberName;
    }

}
