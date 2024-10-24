Feature: Is my calculator working

  Background:
    Given I have a brand new calculator

  Scenario Outline: I want to test the addition of <nr1> and <nr2>
    Given I am using my calculator
    When I add <nr1> and <nr2>
    Then I get the result <result>

    Examples:
      | nr1 | nr2 |  result |
      | 1   | 2   |  3      |
      | 5   | 4   |  9      |
