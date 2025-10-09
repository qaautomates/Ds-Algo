Feature: Array data structure 

Background: 
Given User logged in to the ds algo portal and on home page

@test
Scenario: Verify that user is able to navigate to Array datastructure page from Get Started Link 
When The user clicks the Get Started button in Array Panel
Then The user should navigate to Array Data Structure Page

Scenario: Verify that user is able to navigate to Array datastructure page from dropdown 
When The user select Array item from the drop down menu
Then The user should be directed to Array Data Structure Page

@test1
Scenario: Verify that user is able to navigate to Arrays in Python page 
Given  The user is in the Array page
When The user clicks Arrays in Python link 
Then The user should be redirected to Arrays in Python page

@test
Scenario Outline: Verify that user is able to navigate to different links in Array page 
Given The user is in the Array page
When The user clicks "<link>" link
Then The user should be redirected to "<expected_title>" page

Examples:
|       link          |      expected_title   |
|    Arrays in Python |   Arrays in Python    |
|    Arrays Using List  |  Arrays Using List   |
|   Basic Operations in Lists  |  Basic Operations in Lists |
|   Applications of Array  |  Applications of Array  |

@test
Scenario Outline: Verify that user is able to navigate to Try Editor page for different links from Array page 
Given The user is in the "<link>" page
When The user clicks Try here button
Then The user should be redirected to Assessment page

Examples:
|       link          |    
|    Arrays in Python |   
|    Arrays Using List  |  
|   Basic Operations in Lists  | 
|   Applications of Array  | 

@test
Scenario: User enters valid python code in Try Editor from Assessment page
Given The user is in Assessment page
When The user enters input from Excel sheet "pythonCode" with testcaseId "TC001" in text area 
And The user clicks Run button
Then The user should be able to see the output in the console window

@test @execute
Scenario Outline: User enters valid/invalid python code in Try Editor from Assessment page
Given The user is in Arrays in Python page
When The user enters input from Excel sheet "<sheet>" with testcaseId "testId" in text area 
And The user clicks Run button
Then The user should be able to see the expected output from excel sheet

Examples:
|   sheet     | testId |  
|  pythonCode |  TC001  |    
|  pythonCode |  TC002  |   
|  pythonCode |  TC003  |   

@test @execute
Scenario Outline: User enters valid/invalid python code in Try Editor from Assessment page
Given The user is in Arrays Using List page
When The user enters input from Excel sheet "<sheet>" with testcaseId "testId" in text area 
And The user clicks Run button
Then The user should be able to see the expected output from excel sheet

Examples:
|   sheet     | testId |  
|  pythonCode |  TC001  |    
|  pythonCode |  TC002  |   
|  pythonCode |  TC003  |   

@test @execute
Scenario Outline: User enters valid/invalid python code in Try Editor from Assessment page
Given The user is in Basic Operations in Lists page
When The user enters input from Excel sheet "<sheet>" with testcaseId "testId" in text area 
And The user clicks Run button
Then The user should be able to see the expected output from excel sheet

Examples:
|   sheet     | testId |  
|  pythonCode |  TC001  |    
|  pythonCode |  TC002  |   
|  pythonCode |  TC003  |   

@test @execute
Scenario Outline: User enters valid/invalid python code in Try Editor from Assessment page
Given The user is in Applications of Array page
When The user enters input from Excel sheet "<sheet>" with testcaseId "testId" in text area 
And The user clicks Run button
Then The user should be able to see the expected output from excel sheet

Examples:
|   sheet     | testId |  
|  pythonCode |  TC001  |    
|  pythonCode |  TC002  |   
|  pythonCode |  TC003  |   
