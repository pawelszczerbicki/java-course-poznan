package com.sda.classes;

import static com.sda.classes.Status.DISABLED;

public class User {

    public String name;
    private String surname;
    private static String pesel;
    private int age;
    private Status state =  DISABLED;

    public User(String pesel, Status state){
        this.pesel = pesel;
        this.state = state;
    }

    public User(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
