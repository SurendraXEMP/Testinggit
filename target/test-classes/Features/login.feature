Feature: Login screen

  @smoke
  Scenario: To test login form with positive case
    And user is entered the email id as "smoddipatla@xemplarinsights.com"
    And user is entered the password as "Safety@1234"
    When user is is click on the sing in button
    Then user should login into the portal
    And click on logout button
  @reg
  Scenario: To test login form with nagative case
    And user is entered the email id as "surya@example.com"
    And user is entered the password as "passwordd"
    When user is is click on the sing in button
    But user should not login into the adminportal
    And Error message should display
    
    
   #Scenario: To test login form with positive case
    #Given user is navigated to the login screen by click the website URL
    #And user is entered the email id as "<username>"
    #And user is entered the password as "<password>"
    #When user is is click on the sing in button
    #Then user should login into the portal
    #And click on logout button
   #Examples:
   #|username||password|
   #|smoddipatla@xemplarinsights.com||Safety@123|
   #|surya@example.com||safety@12|
   #|surya@exam.com||safety|
