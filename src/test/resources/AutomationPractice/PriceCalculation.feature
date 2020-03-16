Feature: Validating total price in a cart

  Scenario Outline: Login to created account using valid credentials
    Given the user navigate to automation practice web page
    When the user click sign in button
    And the user enter valid email address "<email>"
    And the user enter valid password "<password>"
    Then the user click the sign in button
    Then the user validate the title of the account page "My account - My Store"
    Examples:
      |email             |password  |
      |BYtkPkpF@mail.com |1qwerty12 |


    Scenario: Verifying the total price of the chosen items
      Given the user enters a search item "summer dress"
      And chooses five items and saves them in the cart
      Then verify the total price of the items
