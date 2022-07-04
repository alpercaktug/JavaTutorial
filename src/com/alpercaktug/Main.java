package com.alpercaktug;

import com.alpercaktug.oop.exercise1.Calculator;
import com.alpercaktug.oop.exercise1.Carpet;
import com.alpercaktug.oop.exercise1.Floor;
import com.alpercaktug.oop.exercise2.Outlander;

public class Main {

    public static void main(String[] args) {

        /*
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);

        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("Total = " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);

        System.out.println("Total = " + calculator.getTotalCost());


         */

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-30);
    }

}
