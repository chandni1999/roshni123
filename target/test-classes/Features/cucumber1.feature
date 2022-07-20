Feature: To verify the login functionality
Scenario: Checking the functionality for valid data.
Given User on the webpage "https://www.saucedemo.com/"
And User passes the '<username>'
And User enters the '<password>'
When Click on the loginButton
Then User is navigate to product baclog page.
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|