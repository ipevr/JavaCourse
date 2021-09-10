package com.iav;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car volkswagen = new Car();

        porsche.setModel("Carrera");

        System.out.println("Porsche is of model " + porsche.getModel());

        porsche.setEngine("Gasoline");

        System.out.println("Porsche has engine of " + porsche.getEngine());
    }
}
