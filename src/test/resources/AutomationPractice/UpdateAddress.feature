Feature: Validating My Address Functionality
  Background: Sign in to the account
    Given the user navigate to the automation practice website
    Then the user clicking sign in button
    And the user enters email in email address window
      | email        | tech222@gmail.com |

  Scenario: update an address
    Given the user click on account tab
    Then the user click addresses button
    And the user click update button
    Then the user update an address
    |address | 312 e oak|
    |city    | Chicago  |
    |state   |Illinois  |
    |zip     | 60002    |
    Then the user click save button 

