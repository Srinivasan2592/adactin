Feature: Verifiy	 Facbook login page

  Scenario: To verify facebook login page
    Given User is in login page
    When User should enter username and password
    And Now User should click the login button
    Then User suceessfully entered in facebook login page
    Then user click the creat new button
    When user select month
