package com.alpercaktug.oop.constructor;

public class Floor {
    private double width;
    private double height;

    public Floor(double width, double height) {
        if (width < 0)
            width = 0;
        if (height < 0)
            height = 0;

        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }
}
