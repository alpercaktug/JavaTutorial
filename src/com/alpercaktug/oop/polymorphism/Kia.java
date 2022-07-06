package com.alpercaktug.oop.polymorphism;

public class Kia extends Car{

    public Kia(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Kia.startEngine()");
    }

    @Override
    public void brake() {
        System.out.println("Kia.brake()");
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Vınnn");
    }
}
