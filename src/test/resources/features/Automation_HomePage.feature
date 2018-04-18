Feature:Feature:Verify Scenarios on Valtech HomePage

  @Positive

  Scenario Outline:Verifying all relevant headers categories  been displayed

    Given I want to run in "headlessChrome"
    When I am on "<Page>"
    Then The page should display header:"<Header>" option
    Examples:
      | Page                     | Header      |
      | https://www.valtech.com/ | LATEST NEWS |

  @Positive

  Scenario Outline:Verifying page has been navigated to appropriate  page whilst clicking "Log In" & "Register" link

    Given I want to run in "headlessChrome"
    When I am on "<Page>"
    And I click TextLink: "<Textlink>"
    Then I am taken to "<result>"
    And The page should display header:"<Header>" option
    Examples:
      | Page                     | Textlink | result     | Header   |
      | https://www.valtech.com/ | ABOUT    | /about/    | About    |
      | https://www.valtech.com/ | WORK     | /work/     | Work     |
      | https://www.valtech.com/ | SERVICES | /services/ | Services |



