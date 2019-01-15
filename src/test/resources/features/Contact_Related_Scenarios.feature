@desktop
Feature: Contact actions


   @UserA  
 Scenario: User can search a contact from the search bar
    Given UserA can see "Create Group" on "contacts.creategroup.button" location
  	  And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA can see "Semra Boyaci" on "Contact.Semra.Boyaci.text" location
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "3000" seconds

  @UserA  
 Scenario: User can view the details of a contact
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA clicks "contact.view.contact.info" 
      And UserA waits for "2000" seconds
      And UserA can see "close" on "contact.details.right.panel.close.button.text.area" location
      And UserA clicks "contact.details.right.panel.close.button"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "3000" seconds
    
    @UserA   
  Scenario: Add contact, add it to favorites, remove from favorites and remove from contacts   
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA clicks "contacts.search.button"
      And UserA enters "Baris Askin" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Baris.Askin" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Baris.Askin" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.favorite"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Baris.Askin" 
      And UserA waits for "3000" seconds
      And UserA clicks "contact.remove.from.favorite"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Baris.Askin" 
      And UserA clicks "contact.remove.contact"
      And UserA waits for "3000" seconds
  
     @UserA  
  Scenario: Add contacts, create group, delete group.
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Damla Seker" to "contacts.search.input"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Damla.Seker" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Mehmet Usanmaz" to "contacts.search.input"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Mehmet.Usanmaz" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA can see "Create Group" on "contacts.creategroup.button" location
      And UserA clicks "contacts.creategroup.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.name.input"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.new.group.name.cancel"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.name.input"
      And UserA waits for "2000" seconds
      And UserA enters "NewGroup" to "contacts.group.name.input"
      And UserA waits for "4000" seconds
      And UserA clicks "contacts.new.group.name.save"
      And UserA waits for "5000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.modify"
      And UserA waits for "2000" seconds
      And UserA clicks "Contact.Mehmet.Usanmaz.Group"
      And UserA waits for "2000" seconds
      And UserA clicks "Contact.Damla.Seker.Group"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.modify.add.contact.save"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.remove"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.delete.cancel.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.remove"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.delete.button"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Mehmet.Usanmaz" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Damla.Seker" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA exits client      
       
      
      
            
   