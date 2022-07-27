  Feature: test login
    Background:
      Given login
      And open page
      | google |

    @SmokeTest
    Scenario Outline: check login with valid credentials
      Given user is on <num> page
      When user enters username and password
      And clicks on login button
      Then user is navigated to <bar> a
      And user is checked for being logged in
      Examples:
      | num | bar |
      | 10 | g44 |

    Scenario Outline: check login 2
      Given user is on num
      | 20 |
      When user enters username and password
      Then user is navigated to <foo> a
      Examples:
      | foo |
      | f22 |
      | e33 |