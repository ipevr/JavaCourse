package com.iav;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setEngine(String engine) {
        String validEngine = engine.toLowerCase();
        if (validEngine.equals("diesel") || validEngine.equals("gasoline") || validEngine.equals("electric")) {
            this.engine = engine;
        } else {
            this.engine = "Unknown";
        }
    }

    public String getEngine() {
        return this.engine;
    }

}
