Feature: Calculate correctly the percentage

  @percentage
  Scenario Outline: Calculation
    Given user is on the percentage page
    When user enters the "<first number>" and "<second number>"
    And Verify that the result is "<result>"

    Examples:
      | first number |  | second number |  | result |
      | 100          |  | 5             |  | 5      |
      | 100          |  | 20            |  | 20     |

  @percentage2
  Scenario: Calculation
    Given user is on the percentage page
    When user enters the "100" and "5"
    And Verify that the result is "5"

