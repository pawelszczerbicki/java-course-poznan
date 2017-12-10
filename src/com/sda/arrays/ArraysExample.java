package com.sda.arrays;

import java.io.File;

public class ArraysExample {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = {1, 2, 22, 102};
        int[] otherNumber = new int[size];

        ArraysExample[] some = new ArraysExample[10];
        String[] stringArray = new String[10];
        Integer[] some2 = new Integer[10];
        File[] some3 = new File[10];

        stringArray[5] = "name";
        stringArray[4] = "name2";
        numbers[3] = 500;
        System.out.println(stringArray[4] + ", " + stringArray[5]);

        String test = "";
        test = null;

        Integer a = 3;

        for (int i = 0; i < size; i++) {
            System.out.println(otherNumber[i]);
        }
        char[] letters = {'a', 'C', '2', 'd'};

        for (int i = 0; i < letters.length; i++) {

            int firstSmallLetter = 65;
            int lastSmallLetter = 92;
            if (letters[i] >= firstSmallLetter && letters[i] <= lastSmallLetter)
                System.out.println(letters[i] + " - jest mala litera");
            else if (letters[i] >= 97 && letters[i] < 122)
                System.out.println(letters[i] + " - jest duza litera");
            else
                System.out.println("nie jest litera");
        }

        int[] number = {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int temp;

        iterateAndSwap(number);


        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }

        String[] names = {"Paweł", "Jan", "Kuba"};

        for (String name : names) {
            System.out.println(name);
        }


        for (int i = 0; i < names.length; i++) {
            String n = names[i];
            System.out.println(n);
        }


        int[] digits = {1, 2, 3, 4, 5, 5};

        String inputFromUser = "dwqewqq3";

        for (int digit : digits)
            if (digit % 2 == 0)
                System.out.println(digit);


    }

    private static void iterateAndSwap(int[] number) {
        for (int i = 0; i < number.length; i++)
            if (number[i] > number[i + 1]) {
                swap(number, i, i + 1);
                break;
            }
        printArray(number);
    }

    private static void printArray(int[] number) {

    }

    private static void swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
    }
    public static void findOtherNumberWithSameDigits(int[] number){
        int[] digits = {1, 2, 3};
        iterateAndSwap(digits);
    }



}
