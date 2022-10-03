package com.example.car;

public class Car implements Vehicle {

    private final String serialNumber;
    private String color;

    public Car(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }
}
