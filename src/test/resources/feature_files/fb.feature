Feature: face book page cheking

  #@Excell
  Scenario Outline: login should be vaild data
    Then user enter username "<sheetname>" and <Rownumber>
    When user enter the password "<sheet>" and <row>
    And user click the login button

    Examples: 
      | sheetname | Rownumber | sheet  | row |
      | Sheet1    |         0 | Sheet1 |   3 |
