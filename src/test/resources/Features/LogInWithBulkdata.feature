Feature: To validate the log in function
 Scenario Outline: To verify the login function

Given user launch the browser and hit the url
When user enters "<username>" and "<password>"
And user clicks the login button
Then  verify the user logged in the application successfully


Examples:

|username|password|
|divya2829|drithi@2608|
|fsjfs|fsfsefs|
|1233555|drithi@2608|
|||

