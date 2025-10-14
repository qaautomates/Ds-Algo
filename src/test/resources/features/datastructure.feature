Feature: Data Structures - Introduction module

  Background:
    Given User is logged in to the DS Algo portal and on home page

  Scenario: Verify that user is able to navigate to Data Structures - Introduction page from Get Started Link
    When The user clicks the Get Started button in Data Structures Panel
    Then The user should navigate to Data Structures - Introduction Page

  Scenario: Verify that user is able to navigate to Data Structures - Introduction page from dropdown
    When The user selects Data Structures - Introduction item from the drop down menu
    Then The user should be directed to Data Structures - Introduction Page

  Scenario Outline: Verify that user is able to navigate to different links in Data Structures - Introduction page
    Given The user is in the Data Structures - Introduction page
    When The user clicks "<link>" link
    Then The user should be redirected to "<expected_title>" page

    Examples:
      | link                    | expected_title           |
      | Time Complexity         | Time Complexity          |
      

  Scenario Outline: Verify that user is able to navigate to Try Editor page for different links from Data Structures - Introduction page
    Given The user is in the "<link>" page
    When The user clicks Try here button
    Then The user should be redirected to Assessment page

    Examples:
      | link            |
      | Time Complexity |


  Scenario Outline: User enters valid/invalid python code in Try Editor for Data Structures - Introduction module
    Given The user is in "<moduleLink>" in Data Structures - Introduction page
    When The user enters input from Excel sheet "<sheet>" with testcaseId "<testId>" in text area
    And The user clicks Run button
    Then The user should be able to see the expected output from excel sheet

    Examples:
      | sheet       | testId | moduleLink       |
      | pythonCode  | TC001  | Time Complexity  |
      | pythonCode  | TC002  | Time Complexity  |
      | pythonCode  | TC003  | Time Complexity  |


  Scenario: Verify that user is able to navigate to Practice Questions link from Data Structures - Introduction page
    Given The user is in the Time Complexity page
    When The user clicks Practice Questions link
    Then The user should be redirected to "Practice Questions" page for Data Structures Introduction