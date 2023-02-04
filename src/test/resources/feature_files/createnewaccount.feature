Feature: it is check the creatnew account fp webpage

  Scenario: check the craet new account page
    Given user lanuch the browser with url login page
    Then user click the  createnewaccount button
    Then user full the firstname  and lastename
    When user enter the phonenumber or emailid
    When then user enter the password
    Then user full the data of brith of brith
    And user select the Gender
    Then user click the sign up button
