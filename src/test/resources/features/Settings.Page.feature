@desktop @UserA
Feature: Verify User A can checks the buttons in the settings page

  Scenario: Buttons in the settings page
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA can see "settings" on "settings.tab.text" location
      And UserA clicks "settings.tab"
     When UserA waits for "3000" seconds
     Then UserA clicks "settings.show.contact.status.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.show.contact.status.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.play.sound.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.play.sound.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.play.sound.messages.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.play.sound.messages.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.taskbar.notifications.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.taskbar.notifications.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.startup.automatically.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.startup.automatically.button"
      And UserA waits for "1000" seconds
      And UserA clicks "settings.ews.on.off.button"
      And UserA waits for "2000" seconds
      And UserA clicks "settings.ews.cancel"
      And UserA waits for "2000" seconds
      And UserA exits client 
   
  
