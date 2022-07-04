package com.alpercaktug;

import com.alpercaktug.oop.exercise1.Calculator;
import com.alpercaktug.oop.exercise1.Carpet;
import com.alpercaktug.oop.exercise1.Floor;
import com.alpercaktug.oop.exercise2.Outlander;
import com.alpercaktug.oop.exercise3.*;

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

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-30);

         */

        Case theCase = new Case("200", "Dell", "240", new Dimensions(20, 50, 100));
        Monitor monitor = new Monitor("300", "HP", 15, new Resolution(10, 10));
        Motherboard motherboard = new Motherboard("400","Asus",2,4,"AsusBios");
        PC thePC = new PC(theCase,monitor,motherboard);

        thePC.getTheCase().pressPowerButton();
        thePC.getMotherboard().loadProgram("Windows");
        thePC.getMonitor().drawPixelAt(5,4,"White");
    }

}
