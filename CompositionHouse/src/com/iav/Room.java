package com.iav;

public class Room {

    private int doors;
    private int windows;
    private Dimension dimension;
    private Bed bed;

    public Room(int doors, int windows, Dimension dimension, Bed bed) {
        this.doors = doors;
        this.windows = windows;
        this.dimension = dimension;
        this.bed = bed;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void hideBed() {
        System.out.println("Bed hidden");
    }
}
