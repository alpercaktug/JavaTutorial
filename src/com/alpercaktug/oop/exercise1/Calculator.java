package com.alpercaktug.oop.exercise1;

public class Calculator {

    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double total;
        total = floor.getArea() * carpet.getCost();
        return total;
    }
}
