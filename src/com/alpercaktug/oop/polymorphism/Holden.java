package com.alpercaktug.oop.polymorphism;

public class Holden extends Car{

    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden.startEngine()");
    }

    @Override
    public void brake() {
        System.out.println("Holden.brake()");
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    public void accelerate(int x) {
        System.out.println("Holden.accelerate() --> " + x);
    }


}
