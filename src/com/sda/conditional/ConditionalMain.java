package com.sda.conditional;

public class ConditionalMain {
    private static int TWO = 2;
    public static void main(String[] args) {
        boolean twoGreaterThanTree = 2 > 3;

        if (twoGreaterThanTree && 3 > 2)
            System.out.println("dwa wieksze niz 3");
        else
            System.out.println("dwa jest mnjiejsze niz 3");

        if (2 > 3)
            System.out.println("dew");
        else if (2 > 4)
            System.out.println("fdewew");
        else
            System.out.println("fewrew");


        if(10>11)
            System.out.println("fdwer");


        int two = 2;
        int tree= 3;

        System.out.println(two > tree ? "wieksze" : "mniejsze");

    }
}
