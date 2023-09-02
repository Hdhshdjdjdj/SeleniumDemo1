@login
Feature: validate Login functionality swag Lab application 
Background:
Given user is on the login page of swag lag
@log2
Scenario: check the login functionality for valid data
#Given user is on the login page of swag lag
When User enter <username> & <password>
And user clicks on login button
Then Login should be successful
|username|password|
|standard_user|secret_sauce|

@log2A
Scenario: check the login functionality for Invalid data
#Given user is on the login page of swag lag
When User enter <Inusername> & <Inpassword>
And user clicks on login button
Then should give a err mgs