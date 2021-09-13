package com.iav;

public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed(new Dimension(90, 200), "yellow");
        Room bedRoom = new Room(1, 2, new Dimension(5, 4), bed);

        bedRoom.hideBed();
    }
}
