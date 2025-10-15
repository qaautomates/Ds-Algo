Feature: Home page functionality

Background: 
Given User is in the NumpyNinja page 

Scenario: User verifies the home page title
When User clicks the Get Started button for home page
Then User is navigated to home page from NumpyNinja page

Scenario Outline: Error message is displayed when selecting data structures modules from the dropdown list without login
Given User is on the home page
When The user selects modules "<modules>" from the dropdown
Then The user should able to see a warning message "You are not logged in"

Examples:
|modules      |
|Arrays		  |
|Linked List  |
|Stack        |
|Queue        |
|Tree         |
|Graph        |

