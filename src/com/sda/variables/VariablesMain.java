package com.sda.variables;

import java.time.LocalDateTime;

public class VariablesMain {

    public static void main(String[] args) {
        int a = 1000;
        short d = 1;
        double e = 1.0312321;
        float f = 1.0312321f;
        char some = 's';
        char other = 1000;

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.minusDays(100));

        boolean someBoolean = false;
        boolean otherBoolean = 2 == 3 && (8 > 7 || 8 < 12) && 2 > 3;
        String name = "dwqewq";

        System.out.println(!otherBoolean);
        int some2 = 'a';

        System.out.println(other);

        long b = 1;
        Integer c = 1;

        System.out.println("hello world \t");
    }


}

