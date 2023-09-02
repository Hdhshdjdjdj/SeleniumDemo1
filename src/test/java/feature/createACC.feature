Feature: Create rediff account Functionality

 Scenario: To check account will be created for user
Given user is on create account page
When user give the credential to create ACCOUNT
| Full Name | paresh patil|
| Choose Rediffmail ID | paresh0012 |
|  Password | paresh123 |
| Alternate Email Address | pareshrajput824@gmail.com |
And user clicks on create account
Then display the account created