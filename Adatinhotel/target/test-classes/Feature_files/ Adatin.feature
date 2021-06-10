Feature: to Verify the Adatin hotel pages

  Scenario: User Verify the login pages
    Given user is in login page validating url
    When User checking logo,banner,app image
    And user entering username "RbnBalan" and password "9043927392"
    And user clicking login button
    Then Verfiy user enter login into Adatn Hotel Page
