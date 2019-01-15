@desktop @UserA @UserB
Feature: Verify that User A can login successfully with correct credentials.	

  Scenario: User A logins to S4B Web RTC with correct credentials and do not save the credentials
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA clicks "login.skypeskip"  
     When UserA clicks "contacts.credentialssaveno"
     Given UserB logs into kandy with "011902165225323@172.28.247.41" "muratc" "3456"
      And UserB clicks "login.skypeskip"  
     When UserB clicks "contacts.credentialssaveno"
      And UserB waits for "3000" seconds  
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds 
      And UserB clicks "calls.dialpadcallbutton"
      And UserA clicks "calls.answerbutton"
      And UserA waits for "10000" seconds
      And UserA clicks "calls.actions.callend.button"
      And UserA clicks "settings.tab"
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logoutbutton" 
      And UserA clicks "settings.popuplogout"
      And UserA exits client
      And UserB clicks "settings.tab"
      And UserB clicks "settings.tab"
      And UserB clicks "settings.logoutbutton" 
      And UserB clicks "settings.popuplogout"
      And UserB exits client
     
      
     