#Author: Masood
@signup
Feature: Signup feature



#@Smoke
 Scenario: Signup
 	Given I am in the Automation Practice Page and verify YourLogo
 	And i click on Sign in button
 	And i enter "masoodsdq2@gmail.com" as create email address
 	And i click on Create an Account button
 	And i click on Mr. radio button
 	And i enter "Masood" as first name
 	And i enter "Sidiqui" as last name
 	And i enter "masoodsdq2@gmail.com" as email
 	And i enter "Masood1010" as password
 	And i select "24" from date dropdown
 	And i select "6" from month dropdown
 	And i select "1986" from year dropdown
 	And i check the newsletter checkbox
 	And i enter "Masood" as first name in the address
 	And i enter "Sidiqui" as last name in the address
 	And i enter "5001 Seminary Road" as address
 	And i enter "Alexandria" as City
 	And i select "Virginia" from State dropdown
 	And i enter "22311" as Zip Code
 	And i select "21" from Country dropdown
 	And i enter "8049682222" as Mobile Phone
 	When i click on Register button
 	Then i verify name as Masood Sidiqui
 	
 	
 	


#@Smoke
# Scenario Outline: Invalid login
#   When I enter "<username>" and "<password>"
#   And I click on login button
#   Then I see error message "<errorMessage>"
#
#   Examples:
#     | username | password  | errorMessage             |
#     | Admin    | Monkey123 | Invalid credentials      |
#     | Monkey   | admin123  | Invalid credentials      |
#     | Monkey   | Monkey123 | Invalid credentials      |
#     |          | admin123  | Username cannot b empty |
#     | Admin    |           | Password cannot b empty |