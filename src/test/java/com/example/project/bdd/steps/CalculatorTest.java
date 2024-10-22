package com.example.project.bdd.steps;

import com.example.project.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {

    private Calculator calculator;
    private double result;

    @Given("^I have a brand new calculator$")
    public void initNewCalculator() {
        // do something
    }

    @Given("^I am using my calculator$")
    public void initCalculator() {
        calculator = new Calculator();
    }

    @When("^I add (.+) and (.+)$")
    public void addNumbers(double a, double b) {
        result = calculator.add(a, b);
    }

    @Then("^I get the result (.+)$")
    public void verifyResult(double e) {
        Assertions.assertEquals(e, result);
    }

}
