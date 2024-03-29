  @desktop
Feature: Login & Logout scenarios
	User should be able to login with correct credentials
	User should be warned if enters incorrect credentals.

  @UserA
  Scenario: Login: Use correct credentials
    Given UserA enters "userA.name" to "login.username.input"
    And UserA enters "userA.auth" to "login.auth.input"
    And UserA enters "userA.password" to "login.password.input"
    When UserA clicks "login.submit.button"
    And UserA waits for "5" seconds
     Then UserA can see "dialpad" on "Home_Page.dialpad.button.text_element" location
      And UserA clicks "Home_Page.avatar.button"
      And UserA clicks "avatar.logout.button"
      And UserA can see "Username" on "login.username.label" location
      And UserA exits client

  @UserA
  Scenario: Login: Use correct credentials
    Given UserA enters "user.incorrect.name" to "login.username.input"
    And UserA enters "userA.auth" to "login.auth.input"
    And UserA enters "userA.password" to "login.password.input"
    When UserA clicks "login.submit.button"
    Then UserA can see "Could not login due to incorrect user credentials. Please try again." on "incorrect.login.warning" location
    And UserA exits client



     

   
   
  
  
  