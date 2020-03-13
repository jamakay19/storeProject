Feature:  Authentication functionality
    Background:
      Given the user navigate to the automation practice website

    Scenario: Creating a new account
    Then the user clicking sign in button
    And the user enters email in email address window
      | email        | tech222@gmail.com |
    Then the user clicks on create an account button
    And the user create a new account entering following information

      | firstName    | Nina               |
      | lastName     | Dobrev              |
      | password     | Nina123          |
      | address      | 2100 w devon ave   |
      | city         | Des Plaines        |
      | state        | Illinois           |
      | zip          | 60018              |
      | mobileNumber | 3123123423         |
      And the user click register button and validate account created
      |validation | Nina Dobrev|

      Scenario: sign in with valid credentials
        Given the user click sign out button
        Then the user clicking sign in button
        And the user provide email and password
          | email1    | tech222@gmail.com |
          | password1 | Nina123          |
        Then the user click signing in button and validating signing in
          | validate | Nina Dobrev |

     Scenario: sign in with invalid credentials
      Given the user click Sign Out button
       Then the user clicking sign in button
      And the user provide Email and Password
        | email2    | tech@gmail.com |
        | password2 | nina123        |
       Then the user click signing in button and validate
       |validate|Authentication failed.|







