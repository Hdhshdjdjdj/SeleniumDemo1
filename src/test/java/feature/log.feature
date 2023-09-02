Scenario: check the login functionality for valid data

 

Given user is on the login page of swag labs

 

When user enter <uname> & <pwd>

 

And user clicks on login button

 

Then Login should be successful

 

Examples:

|uname|pwd|

|standard_user|secret_sauce|

|problem_user|secret_sauce|