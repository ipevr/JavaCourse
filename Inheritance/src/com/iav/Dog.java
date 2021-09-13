package com.iav;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog is chewing.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("And the animal is a dog.");
        chew();
    }

    public void walk() {
        System.out.println("Dog is walking");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog is running");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog moves legs.");
    }
}
