package com.example.car;

import com.example.project.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarFactory {

    private static final Logger LOGGER = LogManager.getLogger(CarFactory.class);

    public static Car getCar(String color) {
        Car car = new Car();
        car.setColor(color);
        LOGGER.debug("New car created with serial number: {}.", car.getSerialNumber());
        return car;
    }

}
