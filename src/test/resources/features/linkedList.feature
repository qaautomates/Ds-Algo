Feature: Linked List data structure 

Background: 
Given User logged in to the ds algo portal and on home page

Scenario: Verify that user is able to navigate to Linked List datastructure page from Get Started Link 
When The user clicks the Get Started button in Linked List Panel
Then The user should navigate to Linked List Data Structure Page

Scenario: Verify that user is able to navigate to Linked List datastructure page from dropdown 
When The user select Linked List item from the drop down menu
Then The user should navigate to Linked List Data Structure Page

Scenario Outline: Verify that user is able to navigate to different links in LinkedList page 
Given The user is in the Linked List page
When The user clicks "<moduleLink>" link for LinkedList datastructure
Then The user should be redirected to "<expected_title>" page for LinkedList datastructure

Examples:
|       moduleLink          |      expected_title     |
|       Introduction        |        Introduction     |
|    Creating Linked LIst   |      Creating Linked LIst  |
|   Types of Linked List    |      Types of Linked List  |
|   Implement Linked List in Python  |  Implement Linked List in Python  |
|       Traversal		    |      Traversal         |
| 		Insertion           |      Insertion         |
|       Deletion            |      Deletion          |

Scenario Outline: Verify that user is able to navigate to Try Editor page for different links from LinkedList page 
Given The user is in the "<moduleLink>" page for LinkedList datastructure
When The user clicks Try here button for LinkedList datastructure
Then The user should be redirected to "Assessment" page for LinkedList datastructure

Examples:
|       moduleLink          |    
|       Introduction        |   
|    Creating Linked LIst   | 
|   Types of Linked List    | 
|   Implement Linked List in Python  |
|       Traversal		    |
| 		Insertion           |
|       Deletion            |

Scenario Outline: User enters valid/invalid python code in Try Editor for different sub modules in LinkedList 
Given The user is in the "<moduleLink>" page for LinkedList datastructure
When The user enters input from Excel sheet "<sheet>" with testcaseId "<testId>" in text area for LinkedList datastructure
And The user clicks Run button for LinkedList datastructure
Then The user should be able to see the expected output from excel sheet for LinkedList datastructure

Examples:
|   sheet     | testId  |      moduleLink	    |
|  pythonCode |  TC001  |    Introduction       |
|  pythonCode |  TC002  |    Introduction       |
|  pythonCode |  TC003  |    Introduction       |

|  pythonCode |  TC001  |  Creating Linked LIst	| 
|  pythonCode |  TC002  |  Creating Linked LIst	|
|  pythonCode |  TC003  |  Creating Linked LIst	|

|  pythonCode |  TC001  |  Types of Linked List	| 
|  pythonCode |  TC002  |  Types of Linked List	|
|  pythonCode |  TC003  |  Types of Linked List	|

|  pythonCode |  TC001  |Implement Linked List in Python| 
|  pythonCode |  TC002  |Implement Linked List in Python|
|  pythonCode |  TC003  |Implement Linked List in Python|

|  pythonCode |  TC001  |    Traversal       |
|  pythonCode |  TC002  |    Traversal       |
|  pythonCode |  TC003  |    Traversal       |

|  pythonCode |  TC001  |    Insertion       |
|  pythonCode |  TC002  |    Insertion       |
|  pythonCode |  TC003  |    Insertion       |

|  pythonCode |  TC001  |    Deletion       |
|  pythonCode |  TC002  |    Deletion       |
|  pythonCode |  TC003  |    Deletion       |


Scenario Outline: Verify that user is able to navigate to Practice Questions links from LinkedList page  
Given The user is in the "<moduleLink>" page for LinkedList datastructure
When The user clicks "Practice Questions" link for LinkedList datastructure
Then The user should be redirected to "Practice Questions" page for LinkedList datastructure

Examples:
|       moduleLink          |    
|       Introduction        |   
|    Creating Linked LIst   | 
|   Types of Linked List    | 
|   Implement Linked List in Python  |
|       Traversal		    |
| 		Insertion           |
|       Deletion            |

Scenario Outline: Verify that user is able to navigate to different links of LinkedList practice questions page  
Given The user is in the "practice questions" page for LinkedList datastructure
When The user clicks "<moduleLink>" link for LinkedList datastructure
Then The user should be redirected to "<expected_Question>" url for LinkedList datastructure

Examples:
|       link          |    expected_Question  		|
|    Search the array |  		search		|
|    Max Consecutive Ones  |  findMaxConsecutiveOnes	|
|   Find Numbers with Even Number of Digits  |  findNumbers	|
|   Squares of  a Sorted Array  |  sortedSquares	|

Scenario Outline: User enters valid/invalid python code for LinkedList practice questions and verifies the output
Given The user is on the LinkedList practice question editor for "<question_link>" 
When The user write the "<Testcase_ID>" python code in Editor from excel "<sheetName>" for LinkedList
And The user clicks Run button for LinkedList datastructure
And The user clicks submit button for LinkedList datastructure
Then User should be able to verify the output from the excel sheet for LinkedList datastructure
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
		

