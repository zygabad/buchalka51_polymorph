package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Car {

    protected String name;

    public Car() {
        System.out.println("Car default constructor");
        this.name = "noname";
    }

    public Car(String name) {
        System.out.println("Car constructor for name: " + name);
        this.name = name;
    }

    public Car(boolean isGas) {

    }


    public String getName() {
        return name;
    }
}
