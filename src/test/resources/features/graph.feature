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
When The user clicks on "<link>" link for Graph
Then The user should be redirected to "<expected_title>" page for Graph

Examples:
|       link               |      expected_title    |
|    Graph 			       |  Graph    		        |
|    Graph Representations |  Graph Representations |

Scenario Outline: Verify that user is able to navigate to Try Editor page for different links from Graph page 
Given The user is in the "<link>" page for Graph
When The user click try here button for Graph
Then The user must be redirected to Assessment page for Graph

Examples:
|       link              |    
|  Graph 				  |   
|  Graph Representations  |  

Scenario Outline: User enters valid/invalid python code in Try Editor for different sub modules in Graph 
Given The user is in "<moduleLink>" in graph 
When User enter input from the Excel sheet "<sheet>" with the testcaseId "<testId>" in text area for Graph
And The user clicks Run button for Graph
Then The user should be able to see expected output from excel sheet for Graph

Examples:
|   sheet     | testId  |  moduleLink  |
|  pythonCode |  TC001  |   Graph	   | 
|  pythonCode |  TC002  |   Graph	   |
|  pythonCode |  TC003  |   Graph	   |

|  pythonCode |  TC001  |    Graph Representations	| 
|  pythonCode |  TC002  |    Graph Representations	|
|  pythonCode |  TC003  |    Graph Representations	|


Scenario Outline: Verify that user is able to navigate to Practice Questions links from Graph page  
Given The user is in the "<link>" link for Graph
When The user click Practice Questions link for Graph
Then The user should be redirected to the "Practice Questions" page for Graph

Examples:
|       link              |      
|   Graph			      |  
|   Graph Representations |  


