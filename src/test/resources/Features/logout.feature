  Feature: test logout

    Background: open page
      | loginPage |

    Scenario Outline: check logout

      Given user is on 10 page
      When user enters username and password
      Then user is navigated to <foo> a

      Examples:
      | foo |
      | a11 |