Feature: Tree Data Structure
Background: 
Given User logged in to Dsalgo portal and on home page

Scenario: Verify the user is able to navigate to Tree Data structure page from Get Started link
When The user clicks get started button in Tree panel 
Then User should be navigated to Tree Data Structure page

Scenario: Verify the user is able to navigate to Tree Data Structure from dropdown
When User selects "Tree" item from the dropdown menu
Then  User should be redirected to Tree Data structures page

Scenario Outline: Verify that the user is able to navigate to different links in Tree page
Given The  use user is in Tree page
When  User clicks "<link>" in the tree page
Then  The useer should be redirected to corresponding "<expected_Title>" page

Examples:

|			link			|	expected_Title		|

|	Overview of Trees		|	Overview of Trees	|
|	Terminologies			|	Terminologies		|
|	Types of Trees			|	Types of Trees		|
|	Tree Traversals			|	Tree Traversals		|
|	Traversals-Illustration	|	Traversals-Illustration|
|	Binary Trees			|	Binary Trees		|
|	Types of Binary Trees	|	Types of Binary Trees	 |
|	Implementation in Python |	Implementation in Python	|
|	Binary Tree Traversals	 |	Binary Tree Traversals		|
|	Implementation of Binary Trees	|	Implementation of Binary Trees	|
|	Applications of Binary trees	|	Applications of Binary trees	|
|	Binary Search Trees		|		Binary Search Trees	|
|	Implementation Of BST	|	Implementation Of BST	|


Scenario Outline: Verify that user is able to navigate to Try Editor page for different links from Tree page 
Given The user is in the tree "<link>" page
When The user clicks Try here button  on the bottom of the page 
Then The user should be redirected to the Assessment page 

Examples:
|       link          		|   
|	Overview of Trees		|
|	Terminologies			|	
|	Types of Trees			|	
|	Tree Traversals			|	
|	Traversals-Illustration	|	
|	Binary Trees			|	
|	Types of Binary Trees	|	
|	Implementation in Python |	
|	Binary Tree Traversals	 |	
|	Implementation of Binary Trees	|	
|	Applications of Binary trees	|	
|	Binary Search Trees		|		
|	Implementation Of BST	|	


Scenario Outline: User enters valid/invalid python code in Try Editor for different sub modules in Tree 
Given The user is in "<moduleLink>" in Tree page
When The user clicks Try here button
And User enters input from Excel sheet "<sheet>" with testcaseId "<testId>" in text area 
And User clicks Run button 
Then The user should be able to see the expected output from excel sheet "<sheet>" with testcaseId "<testId>" for corresponding python code

Examples:
|	sheet		|	testId	|		moduleLink	|
|  pythonCode |  TC001  |   Overview of Trees	| 
|  pythonCode |  TC002  |   Overview of Trees	|
|  pythonCode |  TC003  |   Overview of Trees	|


|  pythonCode |  TC001  |   Types of Trees	| 
|  pythonCode |  TC002  |   Types of Trees	|
|  pythonCode |  TC003  |   Types of Trees	|

|  pythonCode |  TC001  |   Tree Traversals	| 
|  pythonCode |  TC002  |   Tree Traversals	|
|  pythonCode |  TC003  |   Tree Traversals	|


|  pythonCode |  TC001  |   Traversals-Illustration	| 
|  pythonCode |  TC002  |   Traversals-Illustration	|
|  pythonCode |  TC003  |   Traversals-Illustration	|

|  pythonCode |  TC001  |   Binary Trees	| 
|  pythonCode |  TC002  |   Binary Trees	|
|  pythonCode |  TC003  |   Binary Trees	|

|  pythonCode |  TC001  |   Types of Binary Trees	| 
|  pythonCode |  TC002  |   Types of Binary Trees	|
|  pythonCode |  TC003  |   Types of Binary Trees	|

|  pythonCode |  TC001  |   Implementation in Python	| 
|  pythonCode |  TC002  |   Implementation in Python	|
|  pythonCode |  TC003  |   Implementation in Python	|

|  pythonCode |  TC001  |   Binary Tree Traversals	| 
|  pythonCode |  TC002  |   Binary Tree Traversals	|
|  pythonCode |  TC003  |   Binary Tree Traversals	|


|  pythonCode |  TC001  |   Implementation of Binary Trees	| 
|  pythonCode |  TC002  |   Implementation of Binary Trees	|
|  pythonCode |  TC003  |   Implementation of Binary Trees	|

|  pythonCode |  TC001  |   Applications of Binary trees	| 
|  pythonCode |  TC002  |   Applications of Binary trees	|
|  pythonCode |  TC003  |   Applications of Binary trees	|

|  pythonCode |  TC001  |   Binary Search Trees	| 
|  pythonCode |  TC002  |   Binary Search Trees	|
|  pythonCode |  TC003  |   Binary Search Trees	|

|  pythonCode |  TC001  |   Implementation Of BST	| 
|  pythonCode |  TC002  |   Implementation Of BST	|
|  pythonCode |  TC003  |   Implementation Of BST	|

