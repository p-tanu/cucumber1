Feature: Test the skillary app
1)Valid Case
2)Invalid Case

# given is common in all the scenarios
Background: 
Given I should open the browser skillary

#@PositiveTesting
#Scenario: To test the Login with user credentials

#passing the values fron Gebrish language only
#When Enter name "user" 
#And Enter password "user"
#And click on login button
#Then I should see the username as "Harry Den"

#Scenario: To test the Login with admin credentials


#When Enter name "admin"
#And Enter password "admin"
#And click on login button
#Then I should see the username "SkillRary Admin"


@PositiveTesting
Scenario Outline: To Test Login with all positive data
When Enter name "<user>" 
And Enter password "<pwd>"
And click on login button
Then I should see the username as "<name>"

Examples:
|user|pwd|name|
|user|user|Harry Den|
|user|user|Harry Den|
|admin|admin|SkillRary Admin|

#@ stands for a tag
@NegativeTesting
Scenario: To test the Login with invalid credentials
When Enter name "tanvi"
And Enter password "tanvi"
And click on login button
Then I should navigate to the page "Register"
  