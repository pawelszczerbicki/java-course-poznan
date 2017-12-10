package com.sda.rental;

public class Car {
    private String make;
    private String model;
    private String plate;
    private int year;
    private int mileage;

    public Car(String make, String model, String plate) {
        this.make = make;
        this.model = model;
        this.plate = plate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public boolean equals(Object object) {
        Car car = (Car) object;
        return car.plate.equals(this.plate);
    }
}
