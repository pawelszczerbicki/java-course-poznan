package com.sda.rental;

import java.util.Scanner;

public class FleetApp {
    public static void main(String[] args) {
        DepartmentsManager manager = new DepartmentsManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwe oddzialu: ");
        String name = sc.nextLine();

        manager.addDepartment(name);

        System.out.println("Podaj samochod ktory chcesz znalezc: ");
        String plate = sc.nextLine();
        Department departmentByPlate = manager.findDepartmentByPlate(plate);
        System.out.println(departmentByPlate.getName());
    }

    public void printNames(String ... names){
        System.out.println(names[1]);
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void test(){
        printNames();
        printNames("dsq");
        printNames("dsq", "dq");
        printNames("dsq", "dq", "freqreqw");
        printNames("dsq", "dq", "freqreqw", "", "", "");
    }


















}
