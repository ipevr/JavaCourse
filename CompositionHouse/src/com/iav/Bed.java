package com.iav;

public class Bed {

    private Dimension dimension;
    private String Color;

    public Bed(Dimension dimension, String color) {
        this.dimension = dimension;
        Color = color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return Color;
    }
}
