Feature: Graph data structure 

Background: 
Given User logged in to the ds-algo portal and is on home page
Scenario: Verify that user is able to navigate to Graph datastructure page from Get Started Link 
When The user clicks the Get Started button in Graph Panel
Then The user should navigate to Graph Data Structure Page

Scenario: Verify that user is able to navigate to Graph datastructure page from dropdown 
When User select Graph item from the drop down menu
Then The user should be directed to Graph Data Structure Page

Scenario Outline: Verify that user is able to navigate to different links in Graph page 
Given The user is in the Graph page
When The user clicks on "<link>" link
Then The user should be redirected to "<expected_title>" page

Examples:
|       link               |      expected_title    |
|    Graph 			       |  Graph    		        |
|    Graph Representations |  Graph Representations |

Scenario Outline: Verify that user is able to navigate to Try Editor page for different links from Graph page 
Given The user is in the "<link>" page 
When The user clicks on Try here button
Then The user is redirected to Assessment page

Examples:
|       link              |    
|  Graph 				  |   
|  Graph Representations  |  

Scenario Outline: User enters valid/invalid python code in Try Editor for different sub modules in Graph 
Given The user is in "<moduleLink>" in graph 
When The user enters input from the Excel sheet "<sheet>" with the testcaseId "<testId>" in text area 
And The user clicks on Run button
Then The user should be able to see expected output from excel sheet

Examples:
|   sheet     | testId  |  moduleLink  |
|  pythonCode |  TC001  |   Graph	   | 
|  pythonCode |  TC002  |   Graph	   |
|  pythonCode |  TC003  |   Graph	   |

|  pythonCode |  TC001  |    Graph Representations	| 
|  pythonCode |  TC002  |    Graph Representations	|
|  pythonCode |  TC003  |    Graph Representations	|


Scenario Outline: Verify that user is able to navigate to Practice Questions links from Graph page  
Given The user is in the "<link>" link
When The user clicks on Practice Questions link
Then The user should be redirected to the "Practice Questions" page

Examples:
|       link              |      
|   Graph			      |  
|   Graph Representations |  


