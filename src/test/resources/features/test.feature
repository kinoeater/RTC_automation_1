@desktop
Feature: Verify User A can search and view the details of a contact.

  Scenario: View the details of a contact
    Given UserB logs into kandy with "011902165225323@172.28.247.41" "muratc" "3456"
      And UserB logs into skype with "muratc@gbsolutions.work" "Lkjh1234"
     When UserB clicks "contacts.credentialssaveno"
      And UserB waits for "3000" seconds
      And UserB clicks "contacts.search.button"
      And UserB enters "Semra Boyaci" to "contacts.search.input"
      And UserB waits for "3000" seconds
      And UserB right clicks on "Contact.Semra.Boyaci" 
      And UserB clicks "contact.view.contact.info" 
      And UserB waits for "2000" seconds
      And UserB can see "close" on "contact.details.right.panel.close.button.text.area" location
      And UserB clicks "contact.details.right.panel.close.button"
      And UserB right clicks on "Contact.Semra.Boyaci" 
      And UserB waits for "2000" seconds
      And UserB clicks "contact.add.contact" 
      And UserB waits for "2000" seconds
      And UserB clicks "contacts.search.close.button"
      And UserB waits for "2000" seconds
      And UserB right clicks on "Contact.Semra.Boyaci" 
      And UserB waits for "2000" seconds
      And UserB clicks "contact.remove.contact"
      
      