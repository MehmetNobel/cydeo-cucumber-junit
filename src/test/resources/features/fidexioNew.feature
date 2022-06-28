Feature: Login feature for pos manager and sales manager

  @FIDEX-357 @Fidexio
  Scenario: Verify that pos manager enters the login page with valid credentials.
    Given user is on the fidexiologin page
    When user enters the "posmanager10@info.com" and password "posmanager"
    Then user is on the homepage

  @FIDEX-358 @Fidexio
  Scenario: Verify that sales manager enters the login page with valid credentials.
    Given user is on the fidexiologin page
    When user enters the "salesmanager10@info.com" and password "salesmanager"
    Then user is on the homepage