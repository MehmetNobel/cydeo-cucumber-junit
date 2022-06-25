Feature: verify that user is on the given page

  Scenario: user lands the homepage
    Given user is on the login page
    And user enters the username "Test"
    And user enters the password "Tester"
    And user clicks the submit button
    Then user lands the homepage


  Scenario: user lands the homepage
    Given user is on the login page
    And user enters the username "Test" password "Tester" and submit the button
    Then user lands the homepage


  Scenario: user lands the homepage
    Given user is on the login page
    And user enters the username "Test" password "Tester" and submit the button
    Then user lands the homepage

  @cydeoLogin
  Scenario: user lands the homepage
    Given user is on the login page
    And user enters the username "Test" password "Tester" and submit the button
    And user clicks the order button
    And user enters the essential data in make order page
    Then user should see the order in the order list.

  @cydeoLoginParameter
  Scenario: user lands the homepage
    Given user is on the login page
    And user enters the username "Test" password "Tester" and submit the button
    And user clicks the order button
    And user clicks the nameBox "Nobel"
    And user clicks the streetBox "ahmet sk"
    And user clicks the cityBox "istanbul"
    And user clicks the stateBox "Germany"
    And user clicks the zipBox "34160"
    And user clicks the RadioButton "MasterCard"
    And user clicks the cardNoBox "1111222233334444"
    And user clicks the cardExpiryDateBox "02/24"
    And user waits for 2 seconds
    And user clicks the processOrderButton;
    Then user should see the "Nobel" order in the order list.


  @cydeoLoginWithScenarioOutline
  Scenario Outline: user lands the homepage
    Given user is on the login page
    And user enters the username "Test" password "Tester" and submit the button
    And user clicks the order button
    And user clicks the nameBox "<name>"
    And user clicks the streetBox "<street>"
    And user clicks the cityBox "<city>"
    And user clicks the stateBox "<state>"
    And user clicks the zipBox "<zip>"
    And user clicks the RadioButton "<cardType>"
    And user clicks the cardNoBox "<cardNumber>"
    And user clicks the cardExpiryDateBox "<expiryDate>"
    And user waits for 2 seconds
    And user clicks the processOrderButton;
    Then user should see the "<name2>" order in the order list.
    Examples:
      | name   | street   |  | city     |  | state  |  | zip   |  | cardType   |  | cardNumber       |  | expiryDate |  | name2   |
      | mehmet | ahmet sk |  | istanbul |  | turkey |  | 34160 |  | MasterCard |  | 1111222233334444 |  | 02/24      |  | mehmet |
      | semih  | semih sk |  | istanbul |  | turkey |  | 34160 |  | Visa       |  | 1111222233334444 |  | 02/24      |  | semih  |




