package com.sda.classes;

public class ClassesMain {
    public static void main(String[] args) {
        User jan = null;
        User gosia = new User("Gosia", "Kowalska", "321432");

         jan.toString();
        jan.setAge(3);
        jan.setAge(10);
        jan.setAge(-3);

        gosia.setAge(10);

        System.out.println("Pesel jana " + jan.getPesel());

        System.out.println("Pesel gosi " + gosia.getPesel());

        MathOperations.add(1,1);
    }
}
