Feature: Google
  In order to start searching
  As a user
  I want to open the Google home page

  Scenario: Open homepage
    Given I open the google home page
    Then the title is: Google

  Scenario: Search
    Given I open the google home page
    When I search for: Cheese!
    Then the title is: Cheese! - Sök på Google
