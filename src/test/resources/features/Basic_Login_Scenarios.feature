Feature: Login & Logout scenarios with kandy and skype users.
	User should be able to login with correct credentials
	User should be warned if enters incorrect credentals.

@UserA
  Scenario: Login: Use correct kandy and skype credentials
    Given UserA enters "011902165222512@172.28.247.41" to "login.kandyusername"
      And UserA enters "myol" to "login.kandyauthname" 
      And UserA enters "3456" to "login.kandypassword"
     When UserA clicks "login.kandysubmit"
      And UserA enters "myol@gbsolutions.work" to "login.skypeusername"
      And UserA enters "Lkjh1234" to "login.skypepassword"
     When UserA clicks "login.skypesubmit" 
     When UserA clicks "contacts.credentialssaveno" 
      And UserA waits for "3000" seconds
     Then UserA can see "Calls" on "calls.tab.text" location  
      And UserA waits for "3000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "3000" seconds
      And UserA exits client
      
@UserA
 Scenario: Login: Use S4B with only kandy, use correct credentials
    Given UserA enters "011902165222512@172.28.247.41" to "login.kandyusername"
      And UserA enters "myol" to "login.kandyauthname" 
      And UserA enters "3456" to "login.kandypassword"
     When UserA clicks "login.kandysubmit"
      And UserA clicks "login.skypeskip" 
     When UserA clicks "contacts.credentialssaveno" 
      And UserA waits for "3000" seconds
     Then UserA can see "Calls" on "calls.tab.text" location  
      And UserA waits for "3000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "3000" seconds
      And UserA exits client
      
@UserA
 Scenario: Login: Use incorrect kandy credentials
    Given UserA enters "incorrect@incorrect" to "login.kandyusername"
      And UserA enters "myol" to "login.kandyauthname" 
      And UserA enters "3456" to "login.kandypassword"
     When UserA clicks "login.kandysubmit"
      And UserA waits for "3000" seconds
     Then UserA can see "Incorrect username or password. Please try again." on "kandy.incorrect.login.warning" location  
      And UserA waits for "3000" seconds
      And UserA exits client
      
      
      
@UserA
  Scenario: Login: Use correct kandy and incorrect skype credentials
    Given UserA can see "Login" on "login.kandysubmit" location
      And UserA enters "011902165222512@172.28.247.41" to "login.kandyusername"
      And UserA enters "myol" to "login.kandyauthname" 
      And UserA enters "3456" to "login.kandypassword"
     When UserA clicks "login.kandysubmit"
      And UserA enters "myol@gbsolutions.work" to "login.skypeusername"
      And UserA enters "incorrect" to "login.skypepassword"
     When UserA clicks "login.skypesubmit" 
     Then UserA can see "Restart" on "login.skype.incorrect.restart.button" location                  
      And UserA exits client            
      
      
     

   
   
  
  
  