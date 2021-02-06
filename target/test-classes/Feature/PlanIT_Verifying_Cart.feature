  
@P12324
Feature: Plan IT application scenarios
As an end user I want open the planIT Application and validate the contact and shop pages
  Scenario: Action 2 - check the shops page and Items added to cart
  Scenario Outline: Creation of users
    Given I am on Home Page
     When I navigate to "shops" page
      And click on buy button <number of times> on <item>
      And click on the cart menu
     Then the items selected are displayed in the cart
  
    Examples: 
      | number of times | item           | 
      | 2               | "Funny Cow"    | 
      | 1               | "Fluffy Bunny" | 