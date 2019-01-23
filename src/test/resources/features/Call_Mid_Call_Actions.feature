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
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "6000" seconds
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.tab"
      
            @UserA @UserB
  Scenario: Mute-Unmute during a video call on term side
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab" 
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserA can see "mic" on "calls.actions.microphone.button.icon" location
      And UserA clicks "calls.actions.microphone.button"
      And UserA waits for "7000" seconds
      And UserA can see "mic_off" on "calls.actions.microphone.button.icon" location
      And UserA clicks "calls.actions.microphone.button"
      And UserA waits for "3000" seconds
      And UserA can see "mic" on "calls.actions.microphone.button.icon" location
      And UserA waits for "3000" seconds
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.tab"
      
        @UserA @UserB
  Scenario: Mute-Unmute during a video call on orig side
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab" 
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserB can see "mic" on "calls.actions.microphone.button.icon" location
      And UserB clicks "calls.actions.microphone.button"
      And UserB waits for "7000" seconds
      And UserB can see "mic_off" on "calls.actions.microphone.button.icon" location
      And UserB clicks "calls.actions.microphone.button"
      And UserB waits for "3000" seconds
      And UserB can see "mic" on "calls.actions.microphone.button.icon" location
      And UserB waits for "3000" seconds
      And UserB clicks "calls.actions.callend.button"
      And UserB waits for "3000" seconds
      And UserB clicks "contacts.tab"
      
       @UserA @UserB
  Scenario: Dual Mute-Unmute during a video call 
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab" 
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserB can see "mic" on "calls.actions.microphone.button.icon" location
      And UserB clicks "calls.actions.microphone.button"
      And UserB waits for "7000" seconds
      And UserB can see "mic_off" on "calls.actions.microphone.button.icon" location
      And UserA waits for "5000" seconds
      And UserA can see "mic" on "calls.actions.microphone.button.icon" location
      And UserA clicks "calls.actions.microphone.button"
      And UserA waits for "7000" seconds
      And UserA can see "mic_off" on "calls.actions.microphone.button.icon" location
      And UserB waits for "5000" seconds
      And UserB clicks "calls.actions.microphone.button"
      And UserB waits for "3000" seconds
      And UserB can see "mic" on "calls.actions.microphone.button.icon" location
      And UserB waits for "3000" seconds
      And UserA clicks "calls.actions.microphone.button"
      And UserA waits for "3000" seconds
      And UserA can see "mic" on "calls.actions.microphone.button.icon" location
      And UserA waits for "3000" seconds
      And UserB clicks "calls.actions.callend.button"
      And UserB waits for "3000" seconds
      And UserB clicks "contacts.tab"
      
            @UserA @UserB
  Scenario: Camera off-On during a video call on term side
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserA can see "videocam" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.camera.button"
      And UserA waits for "3000" seconds
      And UserA can see "videocam_off" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.camera.button"
      And UserA waits for "3000" seconds
      And UserA can see "videocam" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.tab"
      
      @UserA @UserB
  Scenario: Camera off-On during a video call on orig side
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserB can see "videocam" on "calls.actions.camera.button.icon" location
      And UserB clicks "calls.actions.camera.button"
      And UserB waits for "3000" seconds
      And UserB can see "videocam_off" on "calls.actions.camera.button.icon" location
      And UserB clicks "calls.actions.camera.button"
      And UserB waits for "3000" seconds
      And UserB can see "videocam" on "calls.actions.camera.button.icon" location
      And UserB clicks "calls.actions.callend.button"
      And UserB waits for "3000" seconds
      And UserB clicks "contacts.tab"
      
       @UserA @UserB
  Scenario: Simultaneous Camera off-On during a video call
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserB can see "videocam" on "calls.actions.camera.button.icon" location
      And UserB clicks "calls.actions.camera.button"
      And UserB waits for "3000" seconds
      And UserB can see "videocam_off" on "calls.actions.camera.button.icon" location
      And UserA can see "videocam" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.camera.button"
      And UserA waits for "3000" seconds
      And UserA can see "videocam_off" on "calls.actions.camera.button.icon" location
      And UserB waits for "3000" seconds
      And UserB clicks "calls.actions.camera.button"
      And UserB waits for "3000" seconds
      And UserB can see "videocam" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.camera.button"
      And UserA waits for "3000" seconds
      And UserA can see "videocam" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.callend.button"
      And UserB waits for "3000" seconds
      And UserB clicks "contacts.tab"
      
	      @UserA @UserB
Scenario: Screen Share during a video call on term side
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserA can see "stop_screen_share" on "calls.actions.screenshare.button.icon" location
      And UserA clicks "calls.actions.screenshare.button"
      And UserA waits for "4000" seconds
      And UserA select "calls.actions.screenshare.chose_image" 
      And UserA waits for "2000" seconds
      And UserA clicks "calls.actions.screenshare.chosen_image_share"
      And UserA waits for "10000" seconds
      And UserA can see "screen_share" on "calls.actions.screenshare.button.icon" location
      And UserA clicks "calls.actions.screenshare.button"
      And UserA can see "stop_screen_share" on "calls.actions.screenshare.button.icon" location
      And UserA waits for "5000" seconds
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.tab"
      
      
      	  @UserA @UserB
Scenario: Hold-Unhold the call on term side
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB waits for "3000" seconds 
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserA can see "pause" on "calls.actions.hold.button.icon" location
      And UserA clicks "calls.actions.hold.button"
      And UserA waits for "7000" seconds
      And UserA can see "play_arrow" on "calls.actions.hold.button.icon" location
      And UserA clicks "calls.actions.hold.button"
      And UserA waits for "3000" seconds
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds   
      And UserA clicks "contacts.tab"
       
    
    
      @UserA @UserB
Scenario: Hold-Unhold the call on orig side
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
      And UserB clicks "calls.tab"
      And UserB waits for "3000" seconds 
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "3000" seconds
      And UserB can see "pause" on "calls.actions.hold.button.icon" location
      And UserB clicks "calls.actions.hold.button"
      And UserB waits for "7000" seconds
      And UserB can see "play_arrow" on "calls.actions.hold.button.icon" location
      And UserB clicks "calls.actions.hold.button"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.actions.callend.button"
      And UserB waits for "3000" seconds   
      And UserB clicks "contacts.tab"
      And UserA exits client 
      And UserB exits client 