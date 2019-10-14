@desktop
Feature: Verify that User A and B can perform basic video call.

  @UserA  @UserB
  Scenario: Login: Use correct credentials
    Given UserA enters "userA.name" to "login.username.input"
    And UserA enters "userA.password" to "login.password.input"
    When UserA clicks "login.submit.button"
    And UserA waits for "2" seconds
    Then UserA can see "dialpad" on "Home_Page.dialpad.button.text_element" location
    Given UserB enters "userB.name" to "login.username.input"
    And UserB enters "userB.password" to "login.password.input"
    When UserB clicks "login.submit.button"
    And UserB waits for "2" seconds
    Then UserB can see "dialpad" on "Home_Page.dialpad.button.text_element" location
    And UserA clicks "Home_Page.dialpad.button"
    And UserA enters "userB.name" to "Call_Page.keyboard.input"
    And UserA clicks "Call_Page.call.button"
    And UserB clicks "in_app_call_notification_answer.button"
    And UserA waits for "5" seconds
    And UserB waits for "5" seconds
    And UserA can see "call_end" on "Active_Call.call.end.button.text_element" location
    And UserB can see "call_end" on "Active_Call.call.end.button.text_element" location
    And UserA can see "pause" on "Active_Call.call.hold.button.text_element" location
    And UserB can see "pause" on "Active_Call.call.hold.button.text_element" location
    And UserA can see "mic" on "Active_Call.call.mic.button.text_element" location
    And UserB can see "mic" on "Active_Call.call.mic.button.text_element" location
    And UserA can see "videocam" on "Active_Call.camera.button.text_element" location
    And UserB can see "videocam" on "Active_Call.camera.button.text_element" location
    And UserA can see "dialpad" on "Active_Call.dialpad.button.text_element" location
    And UserB can see "dialpad" on "Active_Call.dialpad.button.text_element" location
    And UserA can see "more_vert" on "Active_Call.more.button" location
    And UserB can see "more_vert" on "Active_Call.more.button" location
    And UserA clicks "Active_Call.more.button"
    And UserB clicks "Active_Call.more.button"
    And UserA can see "arrow_back" on "Active_Call.back.button" location
    And UserB can see "arrow_back" on "Active_Call.back.button" location
    And UserA clicks "Active_Call.back.button"
    And UserB clicks "Active_Call.back.button"
    And UserA can see "more_vert" on "Active_Call.more.button" location
    And UserB can see "more_vert" on "Active_Call.more.button" location
    And UserA clicks "Active_Call.more.button"
    And UserB clicks "Active_Call.more.button"
    And UserA can see "arrow_back" on "Active_Call.back.button" location
    And UserB can see "arrow_back" on "Active_Call.back.button" location
######### For below active call buttons: settings and call , transfer and merge have the same ID, they need to be changed by MikeR############
#    And UserA can see "settings" on "Active_Call.settings.button.text_element" location
#    And UserB can see "settings" on "Active_Call.settings.button.text_element" location
#    And UserA can see "call" on "Active_Call.call.button.text_element" location
#    And UserB can see "call" on "Active_Call.call.button.text_element" location
#    And UserA can see "settings" on "Active_Call.call.transfer.button.text_element" location
#    And UserB can see "settings" on "Active_Call.call.transfer.button.text_element" location
#    And UserA can see "call" on "Active_Call.call.merge.button.text_element" location
#    And UserB can see "call" on "Active_Call.call.merge.button.text_element" location
    ##################################################################################
    And UserA can see "timer" on "Active_call.call.duration.text_element" location
    And UserB can see "pause" on "Active_call.call.duration.text_element" location
    And UserA can see "Mehmet Sirin USANMAZ" on "Active_call.participant.name" location
    And UserB can see "Semra BOYAC" on "Active_call.participant.name" location
    And UserA clicks "Active_Call.call.end.button"
    And UserA waits for "3" seconds
    Then UserA can see "dialpad" on "Home_Page.dialpad.button.text_element" location
    And UserA clicks "Home_Page.avatar.button"
    And UserA clicks "avatar.logout.button"
    And UserA can see "Username" on "login.username.label" location
    And UserA exits client
    And UserB waits for "3" seconds
    Then UserB can see "dialpad" on "Home_Page.dialpad.button.text_element" location
    And UserB clicks "Home_Page.avatar.button"
    And UserB clicks "avatar.logout.button"
    And UserB can see "Username" on "login.username.label" location
    And UserB exits client
