Feature: Product CheckOut

@Sanity
Scenario: User Checkout Product
Given User Launch Chrome Browser
When User Open URL "https://ecommerce-playground.lambdatest.io/"
And User hover mouse on element
Then User Search Register button
And User enter first name "Shubham" and last name "Sharma"
And User enter email "@gmail.com" and Phone "8178780308"
And User enter password "Test@123" and confirm password "Test@123"
And Click on Privacy Policy button
Then Click on Continue Button
And User Enter Item "Apple" in the field of Search
Then User click on Search Button
And User click on In Stock Items
Then User Hover Mouse Cursor over items
And Click on Product Image
Then User Select Size
And User Select size from Dropdown
And User click on Buy Button
And User Enter firstname "Shubham" and lastname "Sharma"
And User Enter Company name "ShubhamTestTech"
And User Enter Address "Greater Noida, Gautam Budh Nagar"
And User Enter City "Gautam Budh Nagar"
Then User Select Country
And User Select Region
And User Expand Region Again
Then User Select Term and Conditions
And Click on Continue Always button
And User Click on Confirm Order Button
