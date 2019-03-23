
Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Check Remember Me
    Given valid url to open the salesforce application
    Given valid username in the username field
    And  I provide valid password also
    And select the remeber username  check box
    When I click on login button in salesforce application login page
    Then salesforce home page is displayed
    When I click on usermenu dropdown
    And select logout link
    Then username should be displayed in salesforce login page

 