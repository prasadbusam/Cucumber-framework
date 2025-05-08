Feature: Login feature

  Scenario: Verify the login feature with valid credentials
    Given the user opens the Chrome browser
    And navigates to the URL "https://practice.expandtesting.com/login"
    When the user enters username "practice"
    And the user enters password "SuperSecretPassword!"
    And clicks on the login button
    Then the user should be redirected to the logout page
    And the user closes the browser

  Scenario: Verify the login feature with an invalid username
    Given the user opens the Chrome browser
    And navigates to the URL "https://practice.expandtesting.com/login"
    When the user enters username "practice1"
    And the user enters password "SuperSecretPassword!"
    And clicks on the login button
    And the user closes the browser

  Scenario: Verify the login feature with an invalid password
    Given the user opens the Chrome browser
    And navigates to the URL "https://practice.expandtesting.com/login"
    When the user enters username "practice"
    And the user enters password "SuperSecretPassword12!"
    And clicks on the login button
    And the user closes the browser

  Scenario: Verify the login feature with an invalid username and password
    Given the user opens the Chrome browser
    And navigates to the URL "https://practice.expandtesting.com/login"
    When the user enters username "practice11"
    And the user enters password "SuperSecretPassword12!"
    And clicks on the login button
    And the user closes the browser
