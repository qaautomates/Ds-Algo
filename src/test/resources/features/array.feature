Feature: Array data structure 

Background: 
Given User logged in to the ds algo portal and on home page
Scenario: Verify that user is able to navigate to Array datastructure page from Get Started Link 
When The user clicks the Get Started button in Array Panel
Then The user should navigate to Array Data Structure Page

Scenario: Verify that user is able to navigate to Array datastructure page from dropdown 
When The user select Array item from the drop down menu
Then The user should be directed to Array Data Structure Page

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


Scenario Outline: User enters valid/invalid python code in Try Editor for different sub modules in Array 
Given The user is in the "<moduleLink>" page
When The user enters input from Excel sheet "<sheet>" with testcaseId "<testId>" in text area 
And The user clicks Run button
Then The user should be able to see the expected output from excel sheet

Examples:
|   sheet     | testId |  moduleLink	|
|  pythonCode |  TC001  |   Arrays in Python	| 
|  pythonCode |  TC002  |   Arrays in Python	|
|  pythonCode |  TC003  |   Arrays in Python	|

|  pythonCode |  TC001  |    Arrays Using List	| 
|  pythonCode |  TC002  |    Arrays Using List	|
|  pythonCode |  TC003  |    Arrays Using List	|

|  pythonCode |  TC001  |   Basic Operations in Lists	| 
|  pythonCode |  TC002  |   Basic Operations in Lists	|
|  pythonCode |  TC003  |   Basic Operations in Lists	|

|  pythonCode |  TC001  |  Applications of Array	| 
|  pythonCode |  TC002  |  Applications of Array	|
|  pythonCode |  TC003  |  Applications of Array	|


Scenario Outline: Verify that user is able to navigate to Practice Questions links from Arrays page  
Given The user is in the "<link>"
When The user clicks Practice Questions link
Then The user should be redirected to "Practice Questions" page

Examples:
|       link          |      
|    Arrays in Python |  
|    Arrays Using List  |  
|   Basic Operations in Lists  |  
|   Applications of Array  |  

Scenario Outline: Verify that user is able to navigate to different links of practice questions page  
Given The user is in practice questions page
When The user clicks "<link>" link
Then The user should be redirected to "<expected_Question>" url

Examples:
|       link          |    expected_Question  		|
|    Search the array |  		search		|
|    Max Consecutive Ones  |  findMaxConsecutiveOnes	|
|   Find Numbers with Even Number of Digits  |  findNumbers	|
|   Squares of  a Sorted Array  |  sortedSquares	|

Scenario Outline: User enters valid/invalid python code for practice questions and verifies the output
Given The user is on the practice question editor for "<question_link>" 
When The user write the "<Testcase_ID>" python code in Editor from excel "<sheetName>"
And The user clicks Run button
And The user clicks submit button
Then User should be able to verify the output from the excel sheet 
Examples:
|question_link 		|		sheetName       |		Testcase_ID	|			
|Search the array	|	practice qns		|	TC001	|	
|Search the array	|	practice qns		|	TC002	|	
|Max Consecutive Ones 	|	practice qns		|	TC001	|	
|Max Consecutive Ones 	|	practice qns		|	TC002	|	
|Find Numbers with Even Number of Digits   	|	practice qns		|	TC001	|	
|Find Numbers with Even Number of Digits   	|	practice qns		|	TC002	|
| Squares of  a Sorted Array   	|	practice qns		|	TC001	|	
| Squares of  a Sorted Array   	|	practice qns		|	TC002	|
		

