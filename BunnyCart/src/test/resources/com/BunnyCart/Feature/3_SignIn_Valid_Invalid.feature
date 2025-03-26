Feature:
Scenario: To check Sign in with invalid data
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/" webpage to open home page
And User clicks on sign in 
And User enters invalid '<Email>' email
And User enters invalid '<Password>' password
And User click on sign in button
And User close the Browser

Scenario Outline: To check sign in with valid  data
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/" webpage to open home page
And User clicks on sign in 
And User enters valid '<Email>' email
And User enters valid '<Password>' password
And User click on sign in button
And User close the Browser

Examples:
|Email|Password|
|pagadamsathwika@gmail.com|Sathwika@123|
