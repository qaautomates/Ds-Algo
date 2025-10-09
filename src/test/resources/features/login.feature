Feature: Login to Ds-Algo application with valid/invalid credentials 
Background: 
Given User is in NumpyNinja page
When User clicks the Get Started button
Then User is in the home page

Scenario Outline: Verify login functionality with valid credentials using Excel 
Given The user is on the login page
When The user clicks login button with valid credentials from sheet "<sheet>" with "<testcase_id>"
Then The user should navigate to Data Structure Home Page with message "<expected_message>"

Examples:
|   sheet     | testcase_id |  expected_message  |
|  loginSheet |  TC001      |  You are logged in |