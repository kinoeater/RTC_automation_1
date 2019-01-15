@desktop @UserA @UserB
Feature: Verify that User A can login successfully with correct credentials.	

  Scenario: User A logins to S4B Web RTC with correct credentials and do not save the credentials
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA clicks "login.skypeskip"  
     When UserA clicks "contacts.credentialssaveno"
      And UserA waits for "3000" seconds
      And UserA clicks "calls.dialbutton"
      And UserA clicks "calls.dialpadinput"
      And UserA waits for "2000" seconds
      And UserA enters "3222001" to "calls.dialpadinput"
      And UserA waits for "2000" seconds
      And UserA clicks "calls.dialpadcallbutton"
      And UserA waits for "6000" seconds
       And UserA clicks "calls.callendbutton"
       And UserA waits for "3000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logoutbutton" 
      And UserA clicks "settings.popuplogout"
       And UserA waits for "3000" seconds
      And UserA exits client
      
      
      
     # And UserA test method
 
 
