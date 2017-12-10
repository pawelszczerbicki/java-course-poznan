package com.sda.rental;

public class Department {

    private static final int MAX_CARS_AMOUNT = 100;

    private int amount = 0;
    private Car[] cars = new Car[MAX_CARS_AMOUNT];
    private String name;

    public int getAmount() {

        System.out.println(cars.length);
        return amount;
    }

    //return this;
    public Car addCar(Car car) {
        cars[amount] = car;
        amount++;
        return car;
    }

    public Car addCar(String make, String model, String plate) {
        return addCar(new Car(make, model, plate));
    }

    public Car findByPlate(String plate) {
        for (Car car : cars) {
            if (car != null && car.getPlate() == plate)
                return car;
        }
        return null;
    }

    public void removeCar(String plate) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getPlate() == plate) {
                cars[i] = null;
                amount--;
            }
        }
    }

    public String getName() {
        return name;
    }
}
