Feature: Register User

  @TestCase01
  Scenario: Test Case 1: Register User

    Given user on "https://automationexercise.com/"

    When Verify that home page is visible successfully

    And User click login - sign button

    And Verify New User Signup! is visible

    And Enter name and email address

    And Click Signup button

    And Verify that ENTER ACCOUNT INFORMATION is visible

    And Fill details: Title, Name, Email, Password, Date of birth

    And Select checkbox Sign up for our newsletter!

    And Select checkbox Receive special offers from our partners!

    And Fill details: First name, Last name, Company, Address, AddressTwo, Country, State, City, Zipcode, Mobile Number

    And Click Create Account button

    And Verify that ACCOUNT CREATED! is visible

    And Click Continue button

    And Verify that Logged in as username is visible

    And Click Delete Account button

    And Verify that ACCOUNT DELETED! is visible and click Continue button


