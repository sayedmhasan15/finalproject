Feature: Test For UPS external pages
  This feature will test the accessibility of external pages in UPS login page

  @chrome @smoke @s072301
  Scenario: Verify twitter external link is functional in UPS  login page
    Given Customer in UPS login page
    When Customer clicks on the Twitter link
    Then A new popup windows should be available for Twitter login navigation
