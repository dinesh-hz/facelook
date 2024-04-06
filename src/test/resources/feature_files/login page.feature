Feature: facebook login page

  Scenario: login to valid data
    When user enter the username and password
    And cuser click the login button

  Scenario: crate account
    And user click the  createnewaccount butto
    Then user close is browserrssd

  Scenario Outline: login to invalid data
    Given user open the Browser and go to url
    When user enter the "<username>" and password "<password>"

    Examples: 
      | username | password |
      | dinesh   |    12345 |
      | murugan  |    67890 |
      | dinu     | 22031997 |
