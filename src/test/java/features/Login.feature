Feature: login functionality

  Scenario: scenario login

    Given user on "https://automationexercise.com/"

    When User click login - sign button

    And user login with the following credentials

      | username | atezgider@gmail.com |
      | password | ahmet123            |

    Then login should be successful



