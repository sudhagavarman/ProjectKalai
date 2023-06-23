Feature:To validate the login page of salesforce application

  @ErrorMassage
  Scenario: To validate the error message
    Given User navigates to salesforce application
    When User enters the username "Aravinth" and password "123"
    And User clicks the login button
    Then validate the error message

  Scenario: To validate the label name
    Given User navigates to salesforce application
    Then validate the label name

  Scenario: To validate the Login functionality
    Given User navigates to salesforce application
    When User enters the username "learnmore" and password "123"
    And User clicks the login button
    Then User navigates to home page