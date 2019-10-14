@desktop
Feature: Login & Logout scenarios



  @UserA
  Scenario: Login: Use correct credentials
    Given UserA enters "userA.KBS.UCC.name" to "login.username.input"
    And UserA enters "userA.KBS.UCC.password" to "login.password.input"
    When UserA clicks "login.submit.button"

