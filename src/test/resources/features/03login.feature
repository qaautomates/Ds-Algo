Feature: Login to Ds-Algo application with valid/invalid credentials

  Background:
    Given User is in DsAlgo home page

  Scenario Outline: Verify login functionality with valid credentials using Excel
    Given The user is on the login page
    When The user clicks login button with valid credentials from sheet "<sheet>" with "<testcase_id>"
    Then The user should navigate to Data Structure Home Page with message "<expected_message>"

    Examples:
      | sheet      | testcase_id | expected_message  |
      | loginSheet | TC001       | You are logged in |

  Scenario Outline: Verify login functionality with invalid credentials
    Given The user is on the login page
    When The user enters the "<username>" and password as "<passWord>"
    And The user clicks the login button
    Then User should be able to see the expected message as "<message>"

    Examples:
      | username     | passWord       | message                       |
      |              |                | Please fill out this field.   |
      | Qaautomates4 |                | Please fill out this field.   |
      |              | September2025$ | Please fill out this field.   |
      | invalid      | invalid        | Invalid Username and Password |
      | invalid      | September2025  | Invalid Username and Password |
      | Qaautomates4 | invalid        | Invalid Username and Password |

  Scenario: Verify that user is able to sign out successfully
    Given User logged in to Dsalgo portal by using "UserName" and "Password" user is on home page after login
    When The user clicks Sign out link
    Then The user should be redirected to home page with message "Logged out successfully"
