package com.iav;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(true);

        printer.print(5);
        printer.print(6);

        printer.addToner(200);
        printer.print(2);
        System.out.println("Paper needed: " + printer.getPaperNeeded());
        printer.print(1);
        System.out.println("Paper needed: " + printer.getPaperNeeded());
    }
}
