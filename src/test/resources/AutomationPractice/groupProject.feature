Feature: Authentication Functionality

  Background: Automation Practice
    Given the user navigate to automation practice web page

  Scenario: Creating new Account
    When the user click sign in button
    Then  the user enter valid email address
    And the user click create account button
    And the user click male button
    And The user enter personal information
      | name     | john      |
      | lastName | malkovic  |
      | password | 1qwerty12 |
      | day      | 12        |
      | month    | 1         |
      | year     | 1992      |
    And the user add address information
      | addressName     | john             |
      | addressLastName | malkovic        |
      | address         | 2200 w devon ave |
      | city            | chicago          |
      | state           | illinois         |
      | zip             | 60632            |
      | country         | USA              |
      | phoneNumber     | 3546329876       |
      | alias           | Peter            |
    Then click Register button