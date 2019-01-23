@desktop
Feature: Verify that User A and B can perform basic call and mid-call actions.	

	        @UserA @UserB	
  Scenario: Basic Call
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserA test method
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "6000" seconds
      And UserA test method
      And UserA waits for "6000" seconds
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.tab"
      