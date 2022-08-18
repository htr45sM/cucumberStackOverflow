
Feature: Login to the stackoverflow website
  I want to use this template to validate the credential of the existing user

  Scenario: Login to the stackoverflow website with valid credential
    Given User navigates to the Stackoverflow website
    And User click on Login button
    And User enters valid username
    And User enters valid password
    When User clicks on Submit 
    Then User is taken to home page successfully
    

