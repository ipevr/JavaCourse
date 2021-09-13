package com.iav;


class Dog {

    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");

        rex.printName();
        fluffy.printName();
    }

}
