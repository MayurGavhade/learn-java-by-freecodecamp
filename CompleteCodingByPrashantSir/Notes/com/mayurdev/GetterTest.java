package com.mayurdev;

import com.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Black","BMW",
                3,8000);
        System.out.printf("%s %s",car.getColor(),car.getModel());
        car.setColor("Red");
        System.out.println(car);
    }
}
