package com.alpercaktug.oop.polymorphism;

public class Ford extends Car{

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford.startEngine()");
    }

    @Override
    public void brake() {
        System.out.println("Ford.brake()");
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }
}
