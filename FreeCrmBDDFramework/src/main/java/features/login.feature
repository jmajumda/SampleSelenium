Feature: Free CRM Login feature

Scenario: Free CRM login test scenario
Given user is on login page
When title of the page is cogmento CRM
Then user enters username and password
Then user click on login button
Then user will move to home page


Scenario: Create Contact test
When user is in contact page
Then user clicks on new button
Then user fills the contact details
Then user clicks on save button
