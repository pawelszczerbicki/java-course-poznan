package com.sda.polimorohism;

public class PoliMain {
    public static void main(String[] args) {
        Car c = new Car();
        Truck t = new Truck();
        Vehicle c2 = new Car();

        c.accelerate();
        c.stop();
        t.accelerate();
        t.stop();

        c.getTrunkSize();
//        c2.getTrunkSize();


        printSpeed(c);
        printSpeed(t);
        printSpeed(c2);
    }

    public static void printSpeed(Vehicle c) {
        if (c instanceof Car) {
            Car otherCar = (Car) c;
            System.out.println("bagaznik: " + otherCar.getTrunkSize() );
        }
        System.out.println(c.getSpeed());

    }
}
