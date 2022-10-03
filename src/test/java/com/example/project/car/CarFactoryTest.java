package com.example.project.car;

import com.example.car.Car;
import com.example.car.CarFactory;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CarFactoryTest {

    @Test
    @DisplayName("Car factory test")
    public void testCarFactory() {
        Car blueCar = CarFactory.getCar("blue");
        Assertions.assertEquals("blue", blueCar.getColor());
        Assertions.assertNotNull(blueCar.getSerialNumber());
    }

}
