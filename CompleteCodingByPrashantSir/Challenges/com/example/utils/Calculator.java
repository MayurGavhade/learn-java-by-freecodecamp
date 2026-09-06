package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(10,5);
        double circleArea = Math.PI * Math.pow(circle.radius ,2);
        double rectangleArea = rectangle.height * rectangle.breadth;

        System.out.printf("Area of the circle is: %s, Area of the rectangle is: %s",circleArea,rectangleArea);
    }
}
