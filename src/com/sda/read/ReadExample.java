package com.sda.read;

import java.io.InputStream;
import java.util.Scanner;

public class ReadExample {
    public static void main(String[] args) {

        int[] some;

        ///pytane o rozmiar
        some = new int[10];

        InputStream keyboard = System.in;
        Scanner scanner = new Scanner(keyboard);

        System.out.println("czy umiesz jave ? [true/false]");
        String userInput = scanner.nextLine();

        char userChar = userInput.charAt(0);
        int charAmount = userInput.length();


        boolean knowsJava = scanner.nextBoolean();
        if (knowsJava)
            System.out.println("User zna jave");
        else
            System.out.println("User nie zna javy");
    }
}
