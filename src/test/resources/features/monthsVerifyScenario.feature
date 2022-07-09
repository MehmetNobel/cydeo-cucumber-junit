Feature: Verify that all months are visible

    @wipMonths @saucelab
  Scenario: All the months are visible or not
    Given User goes to the cydeoPracticePage
    And user clicks the dropdown button
    And user clicks the months button
    Then user should see all the months

      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |



