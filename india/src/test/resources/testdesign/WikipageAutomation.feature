@Wiki
Feature: WikiPage Automation
  Scenario: verify the mapping of Shareholder and Shareholding values
    Given User navigates to Wiki homepage
    When User extracts the shareholder value
    And User Extracts the shareholding value
    Then Validate the mapping

