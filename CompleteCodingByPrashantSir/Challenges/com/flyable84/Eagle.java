package com.flyable84;

public class Eagle extends Bird{
    @Override
    public void fly() {
        System.out.println("Now i am ready to fly");
    }

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
