Feature: Is it Friday yet?

  Everybody wants to know when it's Friday

  Scenario Outline: Testing if <dayToTest> is Friday
    Given today is <dayToTest>
    When I ask whether it's Friday yet
    Then I should be told <result>

    Examples:
      | dayToTest | result |
      | Monday    | Nope   |
      | Tuesday   | Nope   |
      | Wednesday | Nope   |
      | Thursday  | Nope   |
      | Friday    | Yes    |
      | Saturday  | Nope   |
      | Sunday    | Nope   |
