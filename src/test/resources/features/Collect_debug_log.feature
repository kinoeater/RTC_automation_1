@desktop @UserA
Feature: Verify User A can coolect debug logs

  Scenario: Debug log collecting
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA logs into skype with "myol@gbsolutions.work" "Lkjh1234"
     When UserA clicks "contacts.credentialssaveno"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.debuglog.button"
      And UserA waits for "3000" seconds
      And UserA saves debug log       
      And UserA waits for "4000" seconds
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "2000" seconds
      And UserA exits client 
  
