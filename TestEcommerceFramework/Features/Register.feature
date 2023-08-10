Feature: Register

@Sanity
Scenario: Register User
Given User Launch Chrome Browser
When User Open URL "https://ecommerce-playground.lambdatest.io/"
And User hover mouse on element
Then User Search Register button
And User enter first name "Shubham" and last name "Sharma"
And User enter email "@gmail.com" and Phone "8178780308"
And User enter password "Test@123" and confirm password "Test@123"
And Click on Privacy Policy button
Then Click on Continue Button