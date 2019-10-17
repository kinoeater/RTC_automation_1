@desktop
Feature: Login & Logout scenarios
  User should be able to login with correct credentials
  User should be warned if enters incorrect credentals.

  @UserA
  Scenario: Login: Use correct credentials
    Given UserA enters "user.incorrect.name" to "login.username.input"
    And UserA enters "userA.auth" to "login.auth.input"
    And UserA enters "userA.password" to "login.password.input"
    When UserA clicks "login.submit.button"
    Then UserA can see "Could not login due to incorrect user credentials. Please try again." on "incorrect.login.warning" location
    And UserA exits client
