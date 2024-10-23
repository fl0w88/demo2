package com.example.project.bdd.steps;

import com.example.car.Car;
import com.example.car.CarFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CarTest {

    private Car orderedCar;

    @Given("^I am ordering a car with the color (.+)")
    public void orderingCar(String color) {
        orderedCar = CarFactory.getCar(color);
    }

    @Then("^I receive a car with the color (.+)$")
    public void checkColor(String abc) {
        Assertions.assertEquals(abc, orderedCar.getColor());
    }

    @And("^the car has a serial number$")
    public void checkSerialNumber() {
        Assertions.assertNotNull(orderedCar.getSerialNumber());
    }


}
