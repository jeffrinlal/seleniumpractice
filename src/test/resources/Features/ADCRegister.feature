@smoke
Feature: To validate the adactin register

  Scenario Outline: To verify the registration functionality

    Given the user login to reistration page
    When the user enters the "<username>" and "<password>" and "<confirmpassword>" and "<fname>" and "<email>"
    And user click the checkbox and submit the register button
    Then validate the user successfully created the account

    Examples:

      | username | password | confimpassword | fname      | email                    |
      | user     | pword    | confassword    | fne        | eml@gmail.com            |
      | JJJJ     | fwwfijw  |                | fwf        | oefwoek                  |
      | jeffrin  | 1234567  | 1234567        | jeffrinlal | jeffrinlal1223@gmail.com |