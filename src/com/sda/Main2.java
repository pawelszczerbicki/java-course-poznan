package com.sda;

public class Main2 {

    public static final int DIRECTORY_VAR_INDEX = 0;

    public static void main(String[] args) {
        String directoryToListen = args[DIRECTORY_VAR_INDEX];

        String[] names = new String[]{"ania", "deqw", "rferw2"};
        StringBuilder builder = new StringBuilder();
        for (String name : names) {
            builder.append(name).append(", ");
        }

//        System.out.println(builder.toString());

        Integer a = 128;
        Integer b = 128;

        if (a.equals(b))
            System.out.println("tak");
        else System.out.println("nie");
    }
}
