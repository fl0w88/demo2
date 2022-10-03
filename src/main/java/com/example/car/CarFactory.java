package com.example.car;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.UUID;

public class CarFactory {

    private static final Logger LOGGER = LogManager.getLogger(CarFactory.class);

    public static Car getCar(String color) {
        String serialNumber = UUID.randomUUID().toString();
        Car car = new Car(serialNumber);
        LOGGER.debug("New car created with serial number: {}.", car.getSerialNumber());
        car.setColor(color);
        LOGGER.debug("Painting car in color: {}.", car.getColor());
        return car;


    }

}
