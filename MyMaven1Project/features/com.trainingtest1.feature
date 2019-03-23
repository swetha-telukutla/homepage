Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario:Has to display login error message
    Given Valid url to open the salesforce application
    Given valid username in username field
    And I didnt  provide any password value in password field
    When i click on login button
    Then error message should be displayed
    
    

 