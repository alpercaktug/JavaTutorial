package com.alpercaktug;

import com.alpercaktug.oop.inheritance.Animal;
import com.alpercaktug.oop.inheritance.Dog;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Cat", 1, 12, 13);


        Dog dog = new Dog("Golden", 1,2,4,1,"long");
        dog.eat();
        //dog.move();

    }

}
