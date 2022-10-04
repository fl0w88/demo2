Feature: Is my calculator working

  Scenario Outline: I want to test the addition of <nr1> and <nr2>
    Given I am using my calculator
    When I add <nr1> and <nr2>
    And I subtract <nr3>
    Then I get the result <result>

    Examples:
      | nr1 | nr2 | nr3 | result |
      | 1   | 2   | 1   | 2      |
      | 2   | 2   | 2   | 2      |
      | 3   | 0   | 0   | 3      |
      | 1   | 5   | 0   | 6      |
      | 1   | 6   | 0   | 7      |



