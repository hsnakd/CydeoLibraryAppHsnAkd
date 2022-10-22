@searchResults
Feature: Log in to Cydeo Library app feature
  Background: log in page feature
    Given users on the login page

  Scenario: Log in as a librarian
    When users type librarian username
    And users type librarian password
    And users click to the sign in button
    And users click to the users button
    Then users should should have following columns

      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
