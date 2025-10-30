Feature: User registration

Background: 
Given User clicks on getstarted button and user is in the home page
Scenario: User navigates to register page
When The user clicks " Register " link
Then User should be redirected to registration page

Scenario: User verifies the error messsage displayed without entering username
Given User clicked on " Register " link
And User is on registration page
When User clicks Register button
Then User should be able to get the message "Please fill out this field." for username field

Scenario: User verifies the error message displayed without entering password
Given User clicked on " Register " link
And User is on registration page
When The user enters username and without entering password 
And User clicks Register button
Then User should be able to get the error message "Please fill out this field." for password field

Scenario: User verifies the error message dispalyed without entering the password confirmation
Given User clicked on " Register " link
And User is on registration page
When The user enters username, opassword and without entering confirmation password
And User clicks Register button
Then  User should be able to get the error message "Please fill out this field." for password confirmation field

Scenario: Verify Registration functionality with invalid credentials 
Given User clicked on " Register " link
When The user enters the username as "<username>", password as "<passWord>" and password confirmation as "<password_confirmation>"
And User clicks Register button
Then User should be able to see the expected message "<expected_message>"

Examples:
|	username		|	passWord	|	password_confirmation	|				expected_message				|

|	2434342 			| September2025$ |	September2025$		|  	UserName cannot be entirely numberic	|
|	TestQA			|	123$		 |		123$			| Your password must contain at least 8 characters	|
|	TestQA			|	test		 |		test			| Your password can’t be a commonly used password	|
|	TestQA			|	123		 	 |		123				| Your password can’t be entirely numeric.			|
|	TestQA			|September2025$ 	|	Oct2025			| password_mismatch:The two password fields didn’t match.|

@testValid
Scenario: Verify Registration functionality with valid credentials 
Given User clicked on " Register " link
When The user enters the valid username, password as "September2025$" and password confirmation as "September2025$" 
And User clicks Register button
Then User should be able to see the successful message "New Account Created. You are logged in as "
