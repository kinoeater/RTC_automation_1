@desktop @UserA @UserB
Feature: Verify that User A can login successfully with correct credentials.	

  Scenario: User A logins to S4B Web RTC with correct credentials and do not save the credentials
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA logs into skype with "myol@gbsolutions.work" "Lkjh1234"
     When UserA clicks "contacts.credentialssaveno"
    Given UserB logs into kandy with "011902165225323@172.28.247.41" "muratc" "3456"
      And UserB logs into skype with "muratc@gbsolutions.work" "Lkjh1234" 
     When UserB clicks "contacts.credentialssaveno" 
      