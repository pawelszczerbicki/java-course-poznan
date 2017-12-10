package com.sda.read;

import java.util.Scanner;

public class ReadContinuouslyExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exitCommand = "exit";
        String input;
        char fromUser;

        do {
            System.out.println("Podaj litere");
            input = sc.next();
            fromUser = input.charAt(0);

            if (fromUser >= 'a' && fromUser <= 'z')
                System.out.println("mala litera");
            else
                System.out.println("nie mala litera");

        } while (!input.equalsIgnoreCase(exitCommand));

        System.out.println("Good bye!");
    }
}
