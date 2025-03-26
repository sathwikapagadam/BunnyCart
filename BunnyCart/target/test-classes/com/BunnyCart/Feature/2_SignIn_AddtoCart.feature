Feature:
Scenario: To check Sign in and serch for product and Add to cart
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/" webpage to open home page
And User clicks on sign in 
And User enter '<Email>' the email
And User enters '<Password>' the password
And User clicks on sign in button
And User clicks on into mark
When User Search for a product "Dwarf hairgrass" in search textbox
And User select product from the search results
And User click type of the product
And User click on Add to cart
And User verify that the product is added to the cart message
And User closes the Browser

Examples:
|Email|Password|
|pagadamsathwika@gmail|Sathwika@123|




