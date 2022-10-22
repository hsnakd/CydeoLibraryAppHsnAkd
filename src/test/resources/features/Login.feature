Feature: Log in to Cydeo Library app feature

  Background: log in page feature
    Given users on the login page

  Scenario: Log in as a librarian
    When users type librarian username
    And users type librarian password
    And users click to the sign in button
    Then users should be on the dashboard

  Scenario: Log in as a student
    When users type student username
    And users type student password
    And users click to the sign in button
    Then users should be on the dashboard