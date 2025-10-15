Feature: User registration

Background: 
Given User clicks on getstarted button and user is in the home page
Scenario: User navigates to register page
When The user clicks register link
Then User should be redirected to registration page

Scenario: User verifies the error messsage displayed without entering username
Given User is on registration page
When User clicks Register button
Then User should be able to get the message "Please fill out this filed." for username field

Scenario: User verifies the error message displayed without entering password
Given User is on registration page
When The user enters username and without entering password 
And User clicks Register button
Then User should be able to get the error message "Please fill out this filed." for password field

Scenario: User verifies the error message dispalyed without entering the password confirmation
Given User is on registration page
When The user enters username, opassword and without entering confirmation password
And User clicks Register button
Then  User should be able to get the error message "Please fill out this filed." for password confirmation field

Scenario: Verify Registration functionality with valid/invalid credential 
Given User is on registration page
When The user enters the username as "<username>", password as "<passWord>" and password confirmation as "<password_confirmation>"
And User clicks Register button
Then User should be able to see the expected message "<expected message>"

Examples:
|	username		|	passWord	|	password_confirmation	|				message				|
|	243434 $%		| September2025$ |	September2025$		| password_mismatch:The two password fields didn’t match.	|
|	TestQA			|	123$		 |		123$			| password_mismatch:The two password fields didn’t match.	|
|	TestQA			| Sep2025		 |		Sep2025			| password_mismatch:The two password fields didn’t match.	|
|	TestQA			|September2025$ 	|	Oct2025			| password_mismatch:The two password fields didn’t match.	|
|	TestQA			|September2025$ 	|	September2025$	| New Account Created. You're logged in as TestQA	|

