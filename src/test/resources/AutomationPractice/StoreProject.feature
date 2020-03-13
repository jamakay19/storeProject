Feature:  Authentication functionality
    Background:
      Given the user navigate to the automation practice website

    Scenario: Creating a new account
    Then the user clicking sign in button
    And the user enters email "<email>" in email address window
      | email        | tech2020@gmail.com |
    Then the user clicks on create an account button
    And the user create a new account entering first name "<firstName>" last name "<lastName>" password "<password>" address "<address>"city "<city>" state "<state>"zip "<zip>" and mobile number"<mobileNumber>"

      | firstName    | Nick               |
      | lastName     | Jonas              |
      | password     | nickJonas          |
      | address      | 2200 w devon ave   |
      | city         | Des Plaines        |
      | state        | IL                 |
      | zip          | 60018              |
      | mobileNumber | 3123123123         |




