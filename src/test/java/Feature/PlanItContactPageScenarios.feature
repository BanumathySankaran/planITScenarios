Feature: Plan IT application scenarios
As an end user I want open the planIT Application and validate the contact and shop pages

  Background: User is Logged In
    Given I am on Home Page
     When I navigate to "contact" page
  
  @P12321
  Scenario: Action 1 - check For errors
  
      And click on submit button
     And validate the errors
      Then populate Mandatory fields
      And resolve the errors
  
  @P12322
  Scenario: Action 2 - Successful Submission
  
      And Fill up all the mandatory fields with the correct details
      And Submit the details
     Then a valid message successful submission message is displayed
  
  @P12323
  Scenario: Action 2 - check the mandatory fields with invalid data
      And fill up the contacts page with invalid data
     Then error messages should be seen