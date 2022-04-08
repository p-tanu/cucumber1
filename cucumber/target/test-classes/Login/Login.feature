Feature: OrangeHRM
Scenario: Validate Login
Given I should be in the login page of orangeHRM
When Enter name
And Enter password
And Click on LoginButton
Then Login successful 

#Scenario: Logout
#Given I should be in the welcome menu of orangeHRM
#When enter Login
