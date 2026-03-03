Feature: User validate the Learnmore Home page
  @lmti01
  Scenario: User validates Learnmore Login Page
    Given User navigates to Learnmore login Page
    When User enter email "abc@dfg.com" and password "qwerty"
    And User click the Login button of learnmore
Then User navigates to homepage of Learnmore application
@lmti02
  Scenario: validation of error message
    Given User navigates to Learnmore login Page
    When User enter email "Learnmore" and password "122345"
    And User click the Login button of learnmore
    Then User validates the error message
