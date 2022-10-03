package com.example.car;

import java.util.UUID;

public class Car implements Vehicle {

    private String color;
    private final String serialNumber = UUID.randomUUID().toString();

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
