Feature: Find and verify the capital cities

  @capital
  Scenario Outline: Verify the capital cities
    Given user is on the GoogleSearch page
    When user types the capital of "<country>"
    Then user verifes the capital city as "<capitalCity>"

    Examples:
      | country |  | capitalCity |
      | Turkey  |  | Ankara      |
      | Germany |  | Berlin      |