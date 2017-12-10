package com.sda.classes;

public class Car {
    private static final int MIN_YEAR = 1900;

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

    public Car(String make, String model, String plate, int year) {
        this(make, model, plate);
        this.year = year < MIN_YEAR ? MIN_YEAR : year;
    }

    public Car(String make, String model, String plate, int year, int mileage) {
        this(make, model, plate, year);
        this.mileage = mileage;
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
}
