package com.openclassrooms.store;

public class Screen extends Item {

    public String resolution;

    public Screen(Brand brand, double price, String resolution) {
        super(brand, price);
        setResolution(resolution);
    }

    public String getResolution() {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Screen {%s, resolution= %s} ".formatted(super.toString(), getResolution());
    }
}
