package com.cybertek.test;

import com.github.javafaker.Faker;

public class firstClass {
    public static void main(String[] args) {
        System.out.println("hello word");

     Faker faker =new Faker();

        System.out.println(faker.harryPotter().character());
        System.out.println(faker.name().fullName());




    }
}
