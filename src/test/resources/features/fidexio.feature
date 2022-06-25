Feature: Verrify all the emails

  @Fidexio
  Scenario Outline: Veriyf all the emails
    Given user is on the fidexio log in page
    When user enters the "<email>" and "<password>" on fidexio login  Page
    Then verfy that user launched the page
    #And logout from the page
    #And user waits for 5 seconds

    Examples:

      | email                 |  | password   |
      | posmanager10@info.com |  | posmanager |
      | posmanager11@info.com |  | posmanager |
