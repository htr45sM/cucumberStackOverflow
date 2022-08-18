
Feature: Login to the stackoverflow website2
  I want to use this template to validate the credential of the existing user

  Scenario: Login to the stackoverflow website with valid credential2
    Given User navigates to the Stackoverflow website2
    And User click on Login button2
    And User enters valid username2
    And User enters valid password2
    When User clicks on Submit2 
    Then User is taken to home page successfully2
    

