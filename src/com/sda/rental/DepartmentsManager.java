package com.sda.rental;

public class DepartmentsManager {
    public static final int MAX_DEPARTMENTS = 100;
    private int amount = 0;
    private Department[] departments = new Department[MAX_DEPARTMENTS];

    public void addDepartment(String name) {
        //TODO implement
    }

    public Car getByPlate(String plate) {
       //TODO implement
        return null;
    }

    public Department findDepartmentByPlate(String plate) {
        for (Department department : departments) {
            if(department.findByPlate(plate) != null)
                return department;
        }
        return null;
    }

    public void addCarToDepartment(String name, Car car){
        //TODO implement
    }
}
