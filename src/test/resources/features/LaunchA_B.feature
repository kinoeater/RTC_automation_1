Feature: User A and User B logs in

  @UserA  @UserB
  Scenario: Login: Use correct credentials
    Given UserA enters "userA.KBS.UCC.name" to "login.username.input"
    And UserA enters "userA.KBS.UCC.password" to "login.password.input"
    When UserA clicks "login.submit.button"
    And UserA waits for "2" seconds
    Then UserA can see "dialpad" on "Home_Page.dialpad.button.text_element" location
    Given UserB enters "userB.KBS.UCC.name" to "login.username.input"
    And UserB enters "userB.KBS.UCC.password" to "login.password.input"
    When UserB clicks "login.submit.button"
    And UserB waits for "2" seconds
    Then UserB can see "dialpad" on "Home_Page.dialpad.button.text_element" location