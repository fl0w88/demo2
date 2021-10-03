package com.example.project.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.Calendar;

public class FridayTest {

    private String currentDay;
    private String askAboutDay;

    @Given("^today is (.+)")
    public void todayIs(String input) {
        currentDay = input;
    }

    @When("^I ask whether it's (.+) yet$")
    public void askFor(String input) {
        askAboutDay = input;
    }

    @Then("^I should be told (.+)$")
    public void answer(String todaysAnswer) {
        Assertions.assertEquals(todaysAnswer, currentDayAskedDay());
    }

    private String currentDayAskedDay() {
        if (currentDay.equals(askAboutDay)) {
            return "Yes";
        }
        return "Nope";
    }

}
