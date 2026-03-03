Feature: Functional Validation of Salesforce Login Page
  @sc01
  Scenario: validation of Login Functionality
    Given User navigates to salesforce login page
    When User enters the username"LMTI" and Password"12345"
    And User click the login button
    Then User navigates to homepage of salesforce application
@sc02
    Scenario: validation of error message
      Given User navigates to salesforce login page
      When User enters the username"Learnmore" and Password"xyz"
      And User click the login button
      Then User validates the errormessage

