package com.learn.java.lession2;
//1)it must be unique
//2)it is your domain name in reverse order

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
// public means any package can see this class

    @Test
    public void helloWorld(){
Person dog = new Person();
assertEquals("Hello World", dog.helloWorld());
    }

}