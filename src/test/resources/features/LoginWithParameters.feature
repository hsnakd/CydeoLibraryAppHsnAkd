Feature: Log in to Cydeo Library app feature

  Background: log in page feature
    Given users on the login page


  Scenario: Log in as a librarian
    When users type librarian username "librarian2@library"
    And users type librarian password "eb2VQKEj"
    And users click to the sign in button
    Then users should be on the dashboard

  Scenario: Log in as a student
    When users type student username "student2@library"
    And users type student password "80qynl9d"
    And users click to the sign in button
    Then users should be on the dashboard


  Scenario: Login as librarian in the same line
    When users type student username "librarian3@library" and "I6JMMwLb" then click to the sign in button
    Then users should be on the dashboard

  Scenario: Login as student in the same line
    When users type student username "student3@library" and "1f3ZGRGj" then click to the sign in button
    Then users should be on the dashboard