Feature: UPS Tracking Package Feature
  This feature will cover the testing of UPS tracking packages.

  Background: 
    Given Customer in UPS tracking page

  @chrome @smoke @s071601
  Scenario: Verify customer would get an error message if invalid tracking number is provided for a package
    When Customer gives an invalid tacking number "abcd1234" input
    And Customer clicks on the track button
    Then Customer should receive an error message "Please provide a tracking number."

  @firefox @smoke @regression @s071601
  Scenario Outline: Verify customer would get a delivered message for a valid tracking number when package is delivered
    When Customer gives a valid tracking number "<tacking_number>" input
    And Customer clicks on the track button
    Then Delivered "<message>" should be available for successful package delivery

    Examples: 
      | tacking_number | message   |
      |       13123123 | Delivered |
      |       13123124 | Delivered |
      |       13123125 | Delivered |
      
      
   
