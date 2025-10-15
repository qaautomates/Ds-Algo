Feature: Data Structures Introduction Module

Background: 
Given User logged in to the ds algo portal and on home page

Scenario: Verify that user is able to navigate to Data Structures Introduction page from Get Started Link 
When The user clicks the Get Started button in Data Structure intro Panel
Then The user should navigate to Data Structures Introduction Page

Scenario: Verify user can access Data Structures Introduction page from the dropdown menu
When The user chooses the Data Structures Introduction option from the module dropdown
Then The Data Structures Introduction Overview page should be displayed to the user

Scenario Outline: Verify user can navigate to specific link in the Data Structures Introduction page
Given The user is currently on the Data Structures Introduction Overview page
When The user selects the "<link>" link specific to the Introduction module
Then The "<expected_title>" page for Data Structures Introduction should be displayed

    Examples:
      | link             | expected_title   |
      | Time Complexity  | Time Complexity  |

 
Scenario Outline: Verify user can open the Try Editor page from links within the Data Structures Introduction page
Given The user is viewing the "<link>" section under the Data Structures Introduction module
When The user clicks on the Try Here button below
Then The system should navigate the user to the Try Editor page for Data Structures Introduction

    Examples:
      | link            |
      | Time Complexity |

  
 Scenario Outline: Validate user’s ability to execute python code in Try Editor for Data Structures Introduction topics
 Given The user is in the "<topic>" section of the Data Structures Introduction page
 When The user enters the python code from Excel sheet "<sheet>" with testcaseId "<testId>" in Data Structures intro
 And The user clicks the Run button within the Try Editor of Data Structures Introduction
 Then The output displayed should match the expected result in the Excel data for Data Structure intro

    Examples:
      | sheet       | testId | topic           |
      | pythonCode  | TC001  | Time Complexity |
      | pythonCode  | TC002  | Time Complexity |
      | pythonCode  | TC003  | Time Complexity |


Scenario: Verify user can open Practice Questions from Data Structures Introduction topic page
Given The user is on the Time Complexity topic page in Data Structures Introduction
When The user clicks the Practice Questions link within the Data Structures Introduction module
Then The Practice Questions page for Data Structures Introduction should be displayed