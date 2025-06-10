Feature: Login screen

  Scenario: To test login form with positive case
    Given user is entered the email id as "smoddipatla@xemplarinsights.com"
    And user is entered the password as "Safety@123"
    When user clicks on the sign in button
    Then user should login into the portal
