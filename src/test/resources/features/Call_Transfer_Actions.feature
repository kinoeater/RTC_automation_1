Feature: Verify that User A, B nd C can perform transfer

	        @UserA @UserB @UserC	
  Scenario: Blind Transfer
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
    Given UserC can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserC clicks "calls.tab"
      And UserA clicks "calls.dialbutton"
      And UserA clicks "calls.dialpadinput"
      And UserA waits for "2000" seconds
      And UserA enters "011902165225323@172.28.247.41" to "calls.dialpadinput"
      And UserA waits for "3000" seconds
      And UserA clicks "calls.dialpadcall.button"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.answer.button"
      And UserA waits for "5000" seconds
      And UserA clicks "calls.actions.transfer.button"
      And UserA waits for "2000" seconds
      And UserA clicks "calls.actions.transfer.transfercall.button"
      And UserA waits for "2000" seconds
      And UserA enters "011902165225287@172.28.247.41" to "calls.actions.transfer.number.search.bar"
      And UserA waits for "2000" seconds
      And UserA clicks "calls.actions.transfer.number.ok.button"
      And UserA waits for "3000" seconds
      And UserC clicks "calls.answer.button"
      And UserA waits for "10000" seconds
      And UserB clicks "calls.callendbutton"
      And UserA clicks "contacts.tab"
      And UserB clicks "contacts.tab"
      And UserC waits for "3000" seconds
      And UserC clicks "contacts.tab"
      
   
     @UserA @UserB @UserC	
Scenario: Consultative Transfer 
      Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
    Given UserC can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserC clicks "calls.tab"
      And UserA clicks "calls.dialbutton"
      And UserA clicks "calls.dialpadinput"
      And UserA waits for "2000" seconds
      And UserA enters "011902165225323@172.28.247.41" to "calls.dialpadinput"
      And UserA waits for "3000" seconds
      And UserA clicks "calls.dialpadcall.button"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.answer.button"
      And UserA waits for "5000" seconds
      And UserA clicks "calls.fullscreen.exit.button"
      And UserA waits for "1000" seconds
      And UserA clicks "calls.dialbutton"
      And UserA clicks "calls.dialpadinput" 
      And UserA waits for "1000" seconds
      And UserA enters "011902165225287@172.28.247.41" to "calls.dialpadinput"
      And UserA waits for "3000" seconds
      And UserA clicks "calls.dialpadcall.button"
      And UserC waits for "3000" seconds
      And UserC clicks "calls.answer.button"
      And UserA waits for "5000" seconds
      And UserA clicks "calls.actions.transfer.button"
      And UserA waits for "2000" seconds
      And UserA clicks "calls.actions.transfer.transfercall.button"
      And UserA waits for "2000" seconds
      And UserA clicks "calls.actions.transfer.consultavive.UserC.number"
      And UserA waits for "10000" seconds
      And UserB clicks "calls.callendbutton"
      And UserA exits client 
      And UserB exits client 
      And UserC exits client 
      