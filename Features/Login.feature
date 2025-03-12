Feature: Login feature

Scenario: Verify the login feature with valid credentials
Given Open the chrome browser
And Enter the url practice.expandtesting.comlogin
When User name as practice
And password as SuperSecretPassword!
And user clicks on the login button
Then user will be navigate to logout page
Then user close the browser

Scenario: Verify the login feature with Invalid credentials
Given Open the chrome browser
And Enter the url practice.expandtesting.comlogin
When User name as practice1
Then user close the browser

Scenario: Verify the login feature with Invalid credentials
Given Open the chrome browser
And Enter the url practice.expandtesting.comlogin
When User name as practice
And password as SuperSecretPassword12!
Then user close the browser

Scenario: Verify the login feature with Invalid credentials
Given Open the chrome browser
And Enter the url practice.expandtesting.comlogin
When User name as practice11
And password as SuperSecretPassword12!
Then user close the browser




