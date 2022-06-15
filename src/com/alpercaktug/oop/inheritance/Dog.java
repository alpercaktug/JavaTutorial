package com.alpercaktug.oop.inheritance;

public class Dog extends Animal{

    private int legs;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight, int legs, int tail, String coat) {
        super(name, 1, size, weight);
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("dog.eat() called");
        chew();
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(20);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(40);
    }

    private void moveLegs(int speed){
        System.out.println("dog.moveLegs() called");
    }

}
