Feature: Automation Task feature
          automation practice

  Scenario: Validate user registration and products number
    Given Customer navigates to the homepage
    When I click on the link button "Sign in"
    And I enter email address to Create an account box
    Then I click on "Create an account" button
    #Authentication page
    Then I select Title "Mr."
    And I enter customers first name "Dragutin"
    And I enter customers last name "Misiraca"
    And I verify that email address is prepopulated with email choosen on Create an account page
    And I enter password "TestPassword!"
    And I select date of birth "6.1.1991"
    Then I enter first name "Dragutin"
    And I enter last name "Misiraca"
    And I enter address "Address 123"
    And I enter City "Chicago"
    And I select State "Alabama"
    And I enter postal code "60064"
    And I select Country "United States"
    And I enter home phone number "004564789"
    And I enter mobile phone number "001654321"
    And I enter Assign an address alias for future reference "Address 123"
    And I click on Register button
    And I verify that user is logged in successfully
    And I click on best sellers link

    #Product page
    Then I verify that best sellers category has 7 products
    And I enter "Printed dresses" into the search field
    And I save results to txt file


  Scenario: Enter invalid first name and validate error form
    Given Customer navigates to the homepage
    When I click on the link button "Sign in"
    And I enter email address to Create an account box
    Then I click on "Create an account" button
    #Authentication page
    Then I select Title "Mr."
    And I enter customers first name "Dragutin123"
    And I get the error that input is wrong


  Scenario Outline: Enter invalid first name and validate error form
    Given Customer navigates to the homepage
    When I click on the link button "Sign in"
    And I enter email address to Create an account box
    Then I click on "Create an account" button
    #Authentication page
    Then I select Title "Mr."
    And I enter customers first name "<firstName>"
    And I get the error that input is wrong

    Examples:
    |firstName|
    |Dragutin123|
    |Dragutin*/*-/|