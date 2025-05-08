
Feature: Login2 feature
  Scenario Outline: Verify the login feature with valid credentials
    Given Open chrome
    Given User navigates the url "https://practice.expandtesting.com/login"
    When User enter valid username "<username>" 
    When User enter valid password "<password>"
    And user clicks on login
    Then user should be redirect to logout page
    Then close the browser
    Examples: 
    |username|password|
    | practice1 | SuperSecretPassword!1|
    | practice | SuperSecretPassword!|
    | practice2| SuperSecretPassword!2|
    
    
    

  