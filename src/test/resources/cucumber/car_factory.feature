Feature: Order a new car

  Scenario: Testing new car order
    Given I am ordering a car with the color blue
    Then I receive a car with the color blue
    And the car has a serial number