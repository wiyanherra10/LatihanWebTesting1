@login
Feature: login
  As a user
  I want to see my home page
  So that I can update my profile

  @userA
  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter valid username
    And I enter valid password
    And I click login button
    Then I am on the home page

  Scenario: Incorrect username when attempting to login
    Given I am an the login page
    When I enter an incorrect username
    And I input valid password
    And I click the login button
    Then I will get the Epic sadface error

  Scenario: Begin checkout process
    Given I am an the home page
    When I add items to cart
    And I click the cart button
    And I click the checkout button
    Then I should be directed to the checkout-complete page for confirmation