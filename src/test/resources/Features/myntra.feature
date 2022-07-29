Feature: Myntra menu options test with mouse hover

  @chrome @myntra
  Scenario: Verify customers can acces the T-Shirts from Kids menu option
    Given Customer navigated to the Myntra home page
    When Customer explotes the KIDS menu options
    Then Customer should eba able to access the T-Shirts
