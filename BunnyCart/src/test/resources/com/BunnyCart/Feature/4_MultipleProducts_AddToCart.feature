Feature:
Scenario: Add Multiple Products to cart
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/" webpage to open home page
And User clicks on sign in
And User enters valid '<Email>' email
And User enters valid '<Password>' password
And User click on sign in button
When User Search for a product1 "Dwarf hairgrass" in search textbox
And User select product1 from the search results
And User click type of the product1
And User click on Add to cart for product1
When User Search for product2 "Money Plant" in search textbox
And User click type of the product2
And User click on Add to cart for product2
And User closes the Browser

Examples:
|Email|Password|
|pagadamsathwika@gmail.com|Sathwika@123|