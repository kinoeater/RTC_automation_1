@desktop @UserA
Feature: Verify User A can checks the buttons in the settings page

  Scenario: Buttons in the settings page
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA can see "settings" on "settings.tab.text" location
      And UserA clicks "settings.tab"
      And UserA waits for "3000" seconds
      And UserA test method
      And UserA clicks "settings.microphone1"
      And UserA waits for "3000" seconds
      And UserA clicks "Internal.Microphone"
      
    And UserA test method