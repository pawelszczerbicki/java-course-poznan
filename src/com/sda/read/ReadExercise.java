package com.sda.read;

import java.util.Scanner;

public class ReadExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilosc liczb");
        int size = scanner.nextInt();
        char[] letters = new char[size];


//        String fromUser;
//        char fromUserAsChar;
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj litere: ");
//            fromUserAsChar = fromUser.charAt(0);
//            letters[i] = fromUserAsChar;
            letters[i] = scanner.next().charAt(0);
        }

        for (char letter : letters) {
            if (isSmallLetter(letter))
                System.out.println(letter + " mala litera");
            else
                System.out.println(letter + " to nie jest mala litera");
        }

    }

    private static boolean isSmallLetter(char letter) {
        return letter >= 'a' && letter <= 'z';
    }
}
