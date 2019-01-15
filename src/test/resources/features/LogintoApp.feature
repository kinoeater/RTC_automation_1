@desktop @UserA @UserB
Feature: Verify that User A can login successfully with correct credentials.	

  Scenario: User A logins to S4B Web RTC with correct credentials and do not save the credentials
    Given UserA is launched
 	Given UserB is launched
 	And UserA enters "011902165222512@172.28.247.41" to "login.kandyusername"
      And UserA enters "myol" to "login.kandyauthname"
      And UserA enters "3456" to "login.kandypassword" 
     When UserA clicks "login.kandysubmit"
      And UserA enters "myol@gbsolutions.work" to "login.skypeusername"
      And UserA enters "Lkjh1234" to "login.skypepassword"
     When UserA clicks "login.skypesubmit" 
     When UserA clicks "contacts.credentialssaveno" 
      And UserA can see "Contacts" on "contacts.text" location
      And UserB enters "011902165225323@172.28.247.41" to "login.kandyusername"
      And UserB enters "muratc" to "login.kandyauthname"
      And UserB enters "3456" to "login.kandypassword" 
     When UserB clicks "login.kandysubmit"
      And UserB enters "muratc@gbsolutions.work" to "login.skypeusername"
      And UserB enters "Lkjh1234" to "login.skypepassword"
     When UserB clicks "login.skypesubmit" 
     When UserB clicks "contacts.credentialssaveno" 
      And UserB can see "Contacts" on "contacts.text" location
      And UserA clicks "messages.tab"
      And UserB clicks "messages.mustafa"
      And UserB clicks "messages.new.message"
      And UserB enters "man on mars!" to "messages.newmessage"
      #And UserB clicks "messages.tab"
     # And UserB clicks "messages.mustafa"
     # And UserB clicks "messages.new.message" 
     # And UserB enters "finally" to "messages.new.message"
      
     
      
 	 
 	