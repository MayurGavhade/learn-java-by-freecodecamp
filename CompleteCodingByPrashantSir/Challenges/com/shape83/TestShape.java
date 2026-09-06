package com.shape83;

public class TestShape {
    public static void main(String[] args) {
        Square sqr = new Square(5,10);
        Circle cir = new Circle(5);

        System.out.printf("The area of square is %s and area of circle is %s",sqr.calculateArea(),cir.calculateArea());
    }
}
