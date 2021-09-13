package com.iav;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private int paperNeeded;
    private boolean isDuplex;
    private int tonerPerPage;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.paperNeeded = 0;
        this.tonerPerPage = 10;
    }

    public int addToner(int amount) {
        if (amount < 0 || amount > 100) {
            return -1;
        }

        if (this.tonerLevel + amount > 100) {
            return -1;
        }

        this.tonerLevel += amount;
        System.out.println("Toner filled up to " + tonerLevel);
        return this.tonerLevel;
    }

    public int print(int numberOfPages) {
        if (tonerLevel < tonerPerPage * numberOfPages) {
            System.out.println("Too less toner! Fill up toner to print more pages");
            return -1;
        }

        this.pagesPrinted += numberOfPages;
        this.paperNeeded += this.isDuplex ? Math.ceil((double) numberOfPages / 2) : numberOfPages;
        this.tonerLevel -= this.tonerPerPage * numberOfPages;
        System.out.println("Printed page. Total amount of printed pages is " + this.pagesPrinted + ". Toner left " + this.tonerLevel);
        return this.pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getPaperNeeded() {
        return paperNeeded;
    }
}
