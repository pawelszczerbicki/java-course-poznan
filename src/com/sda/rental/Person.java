package com.sda.rental;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String pesel;
    private int age;

    public Person(String pesel) {
        this.pesel = pesel;
    }

//    public boolean equals(Object o) {
//        Person p = (Person) o;
//        return name.equals(p.name) && surname.equals(p.surname)
//                && pesel.equals(p.pesel) && age == p.age;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(pesel, person.pesel);
    }
}
