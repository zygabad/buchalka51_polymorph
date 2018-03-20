package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Merol extends Car {

    public Merol() {
        super("From Merol");
        System.out.println("Merol default constructor");
    }

    public Merol(String name) {
        //super("Merol: " + name);
        System.out.println("This is name: " + name);
    }

    public Merol(String name, String value) {
        super("Merol: " + name + ", value: " + value);
    }
}
