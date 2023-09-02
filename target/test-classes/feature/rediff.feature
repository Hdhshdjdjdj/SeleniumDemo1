Feature: search Functionality

Scenario: check the search functionality
Given user is on home page
When user gives keyword in search field
|manipur|
|modi|
And user clicks on search icon
Then search data should be displayed

