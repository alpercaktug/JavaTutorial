package com.alpercaktug.oop.inheritance;

/*
    Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
    The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
 */
public class Animal {

    private String name;
    private int body;
    private int size;
    private int weight;

    public void eat(){
        System.out.println("animal.eat() called");
    }

    public void move(int speed){
        System.out.println("animal.move() called.  Animal is moving at " + speed);
    }

    public Animal(String name, int body, int size, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
