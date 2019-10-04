package com.gyumin.thisisjava;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire2 tire2 = snowTire;

        snowTire.run();
        tire2.run();
    }
}
