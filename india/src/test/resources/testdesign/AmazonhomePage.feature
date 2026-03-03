Feature: Functional Validation of Amazon home page
  @amazon02
  Scenario: User validation of Search functionality
    Given user navigates to amazon home page
    When User enter the product name "laptop"
    And User click the search button
    Then user verify the title page

    @amazon01
    Scenario: User validation of Search functionality
      Given user navigates to amazon home page
      When User select value from dropdown