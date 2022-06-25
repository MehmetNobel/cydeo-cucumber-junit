@Regression
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.And
  dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background:For the scenarious in the feature file, user is expected to be on the login page.
    Given user is on the Login page

  @Employee  @Librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password.
    Then user should see the Dashboard

  @Student
  Scenario: Login as Student
    When user enters student username
    And user enters student password.
    Then user should see the Dashboard.

    @Admin
  Scenario:
    When user enters admin username
    And user enters admin password.
    Then user should see the Dashboard.

      #this is the sign to add comments in feature file.