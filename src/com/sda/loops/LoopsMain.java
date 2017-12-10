package com.sda.loops;

public class LoopsMain {
    public static void main(String[] args) {

        //i=i+1 to samo co i++
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        for (int i = 0, j = 3; i < 100 && j < 153; i++, j = j + 3) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            if (i < 50)
                System.out.println("przed polowwa");
            else
                System.out.println("za polowa");
        }

        for (int i = 0; i < 100; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 100);
    }
}
