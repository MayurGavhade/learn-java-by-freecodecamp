package com.shape83;

public class Square extends Shape{
    private double height;
    private double breadth;

    public Square(double height, double breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return height * breadth;
    }
}
