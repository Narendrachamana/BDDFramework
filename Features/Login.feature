Feature: Login Feature


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
Scenario Outline: Login Test Scenario

Given user is already on Login Page
When title of login page 
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser

Examples: 

   | username|password|
   |run2narendrakumar@gmail.com|Narendra@566|
   |narendra.chamana66@gmail.com|Nani@566|
   
   
# #with Examples Keyword
#Scenario Outline: Login Test Scenario
#
#Given user is already on Login Page
#When title of login page 
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user is on home page
#Then Close the browser
   
   
   
   
   
   

