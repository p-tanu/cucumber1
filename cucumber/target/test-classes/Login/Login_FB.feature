Feature: Facebook
Scenario: Validate Login
Given I should be in the login page of Facebook
When Enter Email
And Enter Password
And Click on Login
Then Login Done