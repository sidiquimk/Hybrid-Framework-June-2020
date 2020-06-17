@Smoke
Feature: Automation Practice

Background: 
Given I login to the page
  

  
  Scenario: As a user i want to open Dresses Tab and verrify Dresses text and select different colors
    Given I am logged in and i click on Dresses Tab and I verify the Tab text as Dresses
    When I select different colors
    Then I logout from the page
    
  
    
    
    

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step
#
#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |