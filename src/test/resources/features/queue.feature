Feature: Queue data structure

  Background:
    Given User logged in to the DS Algo portal and on home page

  Scenario: Verify that user is able to navigate to Queue Data Structure page from Get Started Link
    When The user clicks the Get Started button for Queue 
    Then The user should navigate to Queue Data Structure Page

  Scenario: Verify that user is able to navigate to Queue Data Structure page from dropdown
    When The user selects Queue item from the drop down menu "Queue"
    Then The user should be directed to Queue Data Structure Page

  Scenario Outline: Verify navigation to various links within the Queue module
  Given The user has opened the Queue module page
  When The user selects the "<link>" option under Queue
  Then The user should see the "<expected_title>" page displayed for Queue

    Examples:
      | link                       | expected_title              |
      | Implementation of Queue in Python | Implementation of Queue in Python |
      | Implementation using collections.deque | Implementation using collections.deque |
      | Implementation using array | Implementation using array  |
      | Queue Operations           | Queue Operations            |


  Scenario Outline: Verify Try Editor page access for Queue submodules
  Given The user has opened the "<link>" page within Queue module
  When The user clicks the Try here button on the Queue page
  Then The user should be redirected to the Try Editor page for Queue


    Examples:
      | link                                   |
      | Implementation of Queue in Python      |
      | Implementation using collections.deque |
      | Implementation using array             |
      | Queue Operations                       |


    Scenario Outline: User enters valid/invalid python code in Try Editor for different submodules in Queue
    Given The user is in the "<moduleLink>" page in Queue
    When The user clicks Try here button in Queue
    And The user enters input from Excel sheet "<sheet>" with testcaseId "<testId>" in text area in Queue
    And The user clicks Run button in Queue
    Then The user should be able to see the expected output from Excel sheet "<sheet>" with testcaseId "<testId>" in Queue
    
  Examples:
    | sheet      | testId | moduleLink                       |
    | pythonCode | TC001  | Implementation of Queue in Python |
    | pythonCode | TC002  | Implementation of Queue in Python |
    | pythonCode | TC003  | Implementation of Queue in Python |
    
    | pythonCode | TC001  | Implementation using array        |
    | pythonCode | TC002  | Implementation using array        |
    | pythonCode | TC003  | Implementation using array        |
    
    | pythonCode | TC001  | Queue Operations                  |
    | pythonCode | TC002  | Queue Operations                  |
    | pythonCode | TC003  | Queue Operations                  |

  Scenario Outline: Verify Practice Questions navigation from Queue submodules
  Given The user has opened the "<link>" page in Queue module
  When The user clicks the Practice Questions link on the Queue page
  Then The user should be redirected to the "Practice Questions" page for Queue

  Examples:
    | link                                |
    | Implementation of Queue in Python   |
    | Implementation using collections.deque |
    | Implementation using array          |
    | Queue Operations                    |