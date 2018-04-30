Feature: user login

@smoke
Scenario: user login with valid data.
Given MerkConnect application should be launched for "I am a Health Care Professional".
When Navigate to login page.
And Enter login username "afagava" and password "Demo@123"
Then Verify if user "afagava" is logged in successfully.

@smoke
Scenario Outline: userlogin with multiple login credentials
Given MerkConnect application should be launched.
When Navigate to login page.
And Enter login username "<username>" and password "<password>"
Then Verify if user should not login.

Examples:
|username|password|
|afagava|Demo@123|
|sumit|pas123|
|sumit|pas1234|