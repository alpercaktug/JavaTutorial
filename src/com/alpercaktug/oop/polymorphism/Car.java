package com.alpercaktug.oop.polymorphism;

public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("Car.startEngine()");
    }

    public void brake(){
        System.out.println("Car.brake()");
    }

    public void accelerate(){
        System.out.println("Car.accelerate()");
    }

    public void move(){
        System.out.println(getClass().getSimpleName() + ".move()");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
