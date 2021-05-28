Feature: MakeMyTrip

  Scenario: MakeMyTrip
    Given I navigate to the MakemyTrip Website
    When I click on flights
    And I select One Way Trip
    And I choose <source> and <destination> location
      | source | destination |
      | Pune   | Kolkata     |
    And I choose departure date
    And I click on search button
    And I view prices of first airline
    And I click on book now button
    Then I should see the booking page being opened
