
Feature: Stack data structure page

Background: 
Given User logged in to ds algo portal and is on home page for Stack

Scenario: Verify that user should be navigated to Stack datastructure page from get started link 
When User must click get started button in Stack Panel
Then User will be navigated to Stack Data Structure page

Scenario: Verify that user is able to navigate to Stack datastructure page from dropdown 
When The user select "Stack" item from the drop down menu
Then The user should be directed to Stack Data Structure Page

Scenario Outline: Verify that user is able to navigate to different links in Stack page 
Given The user is in the Stack page
When The user clicks "<link>" link of Stack
Then The user must be redirected to "<expected_title>" page of Stack

Examples:
|       link          |      expected_title   |
| Operations in Stack |  Operations in Stack  |
| Implementation      |  Implementation   	  |
| Applications        |  Applications	  |

Scenario Outline: Verify user is able to navigate to Try Editor page for different links from Stack page 
Given User is in the stack "<link>" page 
When User clicks try here button at the bottom of the page for Stack
Then User should be redirected to Assessment page for Stack

Examples:
|       link          |    
| Operations in Stack |   
| Implementation      |  
| Applications        | 

Scenario Outline: User enters valid/invalid python code in Try Editor for different sub modules in Stack 
Given The user is in "<moduleLink>" module in stack page
When The user clicks Try here button in Stack
And User enter input from Excel sheet "<sheet>" with testcaseId "<testId>" in text area for Stack
And User clicks on the Run button for Stack
Then User should be able to see the expected output from excel sheet "<sheet>" with testcaseId "<testId>" for Stack

Examples:
|   sheet     | testId |  moduleLink	|
|  pythonCode |  TC001  |   Operations in Stack	| 
|  pythonCode |  TC002  |   Operations in Stack	|
|  pythonCode |  TC003  |   Operations in Stack	|

#|  pythonCode |  TC001  |    Implementation	| 
#|  pythonCode |  TC002  |    Implementation	|
#|  pythonCode |  TC003  |    Implementation	|

#|  pythonCode |  TC001  |  Applications 	| 
#|  pythonCode |  TC002  |  Applications 	|
#|  pythonCode |  TC003  |  Applications 	|

Scenario Outline: Verify that user is able to navigate to Practice Questions links from Stack page  
Given The user is in the "<link>" link of Stack
When User clicks on Practice Questions link for Stack
Then User should be redirected to "Practice Questions" page for Stack

Examples:
|       link          |      
| Operations in Stack |  
| Implementation      |  
| Applications        |  

