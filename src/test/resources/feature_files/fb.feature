#Feature: face book page cheking
#
  #Scenario Outline: login should be vaild data
    #Given user open lanchu the browser
    #Then user enter  "<useenrame>"
    #When user enter the "<password>"
    #And user click the login button
    #When close the browserr
#
    #Examples: 
      #| useenrame | password  |
      #| dinesh    | 12345@jbd |
      #| kumer     | dinehs@45 |
      #| murugan   | jbbj255@  |
#
  #Scenario Outline: login should be invaild data
    #Given user open lanchu the browser
    #Then user enter the user  "<usernamsess>"
    #When user enter the pass "<passhav>"
    #And user click the login button
    #When close the browserr
#
    #Examples: 
      #| usernamsess | passhav   |
      #| dinu        | 12345@jbd |
      #| meij        | dinehs@45 |
      #| muru        | jbbj255@  |
