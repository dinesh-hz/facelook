Feature: facebook login page

  Scenario: login to valid data
    When user enter the username and password
    And cuser click the login button

  Scenario: crate account
    And user click the  createnewaccount butto

  Scenario Outline: login to invalid data
    Given user open the Browser and go to url
    When user enter the "<username>" and password "<password>"
  Then user close the browser

    Examples: 
      | username | password |
      | dinesh   |    12345 |
      | murugan  |    67890 |
      | dinu     | 22031997 |
