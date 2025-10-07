Feature: Login to Ds-Algo application with valid/invalid credentials 
Background: 
Given User is in NumpyNinja page
When User clicks the Get Started button
Then User is in the home page
Scenario: Verify that user navigates to Home page after entering valid Username and Password
Given The user is on the login page
When The user clicks login button after entering valid username as "qaautomates4" and valid password as "September2025$"
Then The user should navigate to Data Structure Home Page with message "You are logged in"