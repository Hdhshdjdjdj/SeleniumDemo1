Feature: Validate Login Functionality for swag labs application

 

Scenario: check the login functionality for valid data
Given user is on the login page of swag labs
When user enter uname & password
|username| |password|
|standard_user| |secret_sauce|
And user clicks on login button
Then Login should be successful