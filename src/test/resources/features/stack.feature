
Feature: Stack data structure page

Background: 
Given User logged in to ds algo portal and is on home page
Scenario: Verify that user is able to navigate to Stack datastructure page from Get Started Link 
When The user clicks the Get Started button in Stack Panel
Then The user should navigate to Stack Data Structure Page

Scenario: Verify that user is able to navigate to Stack datastructure page from dropdown 
When The user select Stack item from the drop down menu
Then The user should be directed to Stack Data Structure Page

Scenario Outline: Verify that user is able to navigate to different links in Stack page 
Given The user is in the Stack page
When The user clicks "<link>" link of Stack
Then The user should be redirected to "<expected_title>" page of Stack

Examples:
|       link          |      expected_title   |
| Operations in Stack |  Operations in Stack  |
| Implementation      |  Implementation   	  |
| Applications        |  stack-applications	  |

Scenario Outline: Verify user is able to navigate to Try Editor page for different links from Stack page 
Given User is in the stack "<link>" page 
When The user clicks Try here button at the bottom of the page 
Then User should be redirected to Assessment page 

Examples:
|       link          |    
| Operations in Stack |   
| Implementation      |  
| Applications        | 

Scenario Outline: User enters valid/invalid python code in Try Editor for different sub modules in Stack 
Given The user is in "<moduleLink>" in stack page
When User enters the input from Excel sheet "<sheet>" with testcaseId "<testId>" in text area 
And User clicks on the Run button
Then User should be able to see the expected output from excel sheet

Examples:
|   sheet     | testId |  moduleLink	|
|  pythonCode |  TC001  |   Operations in Stack	| 
|  pythonCode |  TC002  |   Operations in Stack	|
|  pythonCode |  TC003  |   Operations in Stack	|

|  pythonCode |  TC001  |    Implementation	| 
|  pythonCode |  TC002  |    Implementation	|
|  pythonCode |  TC003  |    Implementation	|

|  pythonCode |  TC001  |  Applications 	| 
|  pythonCode |  TC002  |  Applications 	|
|  pythonCode |  TC003  |  Applications 	|

Scenario Outline: Verify that user is able to navigate to Practice Questions links from Stack page  
Given The user is in the "<link>" of Stack
When User clicks on Practice Questions link 
Then User should be redirected to "Practice Questions" page

Examples:
|       link          |      
| Operations in Stack |  
| Implementation      |  
| Applications        |  


# blank page


#Scenario: Verify that user is able to navigate to Practice Questions Page for Stack
#Given The user is on the Stack page 
#When The user clicks Practice Questions link
#Then The user should be redirected to Practice page

