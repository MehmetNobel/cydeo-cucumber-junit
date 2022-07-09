Feature: Wiki search functionality
  Agile Story:As a user, when I am on the Wiki search page
  I should be able to search whatever I want and see relevant information.

  @saucelab
  Scenario: Search page title verification
    Given user is on the Wiki page
    When  user is searches for "Atatürk"
    Then user should see title contains "Atatürk"

  Scenario: Search page title verification
    Given user is on the Wiki page
    When  user is searches for Steve Jobs
    Then user should see title contains Steve Jobs


  Scenario: Search page title verification
    Given user is on the Wiki page
    When  user is searches for Steve Jobs
    Then user should see the header text as Steve Jobs


  Scenario: Search page title verification
    Given user is on the Wiki page
    When  user is searches for Steve Jobs
    Then user should see the pictureHeader text as Steve Jobs

  @scenariOutline
  Scenario Outline: Search page title verification
    Given user is on the Wiki page
    When  user is searches for "<searchValue>"
    And user waits for 2 seconds
    Then user should see title contains "<Title>"
    And user waits for 2 seconds
    Then user should see the pictureHeader text as "<pictureHeader>"
    And user waits for 2 seconds



    Examples:
      | searchValue  | Title        | pictureHeader |
      | Tarkan       | Tarkan       | Tarkan        |
      | Bill Clinton | Bill Clinton | Bill Clinton  |
      | Joe Biden    | Joe Biden    | Joe Biden     |








