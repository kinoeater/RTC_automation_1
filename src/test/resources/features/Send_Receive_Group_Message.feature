@desktop @UserA @UserB
Feature: Verify that User A sends Message to User B, and User B receives it.	

  Scenario: Messaging between A and B.
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA logs into skype with "myol@gbsolutions.work" "Lkjh1234"
     When UserA clicks "contacts.credentialssaveno"
    Given UserB logs into kandy with "011902165225323@172.28.247.41" "muratc" "3456"
      And UserB logs into skype with "muratc@gbsolutions.work" "Lkjh1234"
     When UserB clicks "contacts.credentialssaveno"
      And UserB waits for "3000" seconds 
      And UserA choose "Murat Cinar" to send message 
      And UserA waits for "3000" seconds 
      And UserA enters "hello" to "messages.newmessage"
      And UserA waits for "2000" seconds 
      And UserA clicks "messages.sendkey"
      And UserA waits for "3000" seconds 
      And UserB checks if the message from "Mustafa Yol" received is "hello"   
      And UserA waits for "3000" seconds
      And UserB choose "Mustafa Yol" to send message 
      And UserB waits for "3000" seconds 
      And UserB enters "merhaba" to "messages.newmessage"
      And UserB waits for "2000" seconds 
      And UserB clicks "messages.sendkey"
      And UserB waits for "3000" seconds 
      And UserA checks if the message from "Murat Cinar" received is "merhaba"   
      And UserB waits for "3000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "3000" seconds
      And UserA exits client
      And UserB clicks "settings.tab"
      And UserB clicks "settings.tab"
      And UserB clicks "settings.logout.button" 
      And UserB clicks "settings.popuplogout"
      And UserB waits for "3000" seconds
      And UserB exits client
     
      
     