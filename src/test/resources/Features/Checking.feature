Feature: Checking our Browser
@chrome
  Scenario: Too see our browser is working
    Given user at eBay homepage
    And click on category
    And select electronic
    Then close the browser