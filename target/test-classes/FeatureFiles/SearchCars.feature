@Search-Cars
Feature: Acceptance testing to validate search cars page is working
  In order to validate that 
  the search cars page is working fine 
  we will do the acceptance testing.

  Scenario: Validate search cars page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to car for sell menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And Click on search cars link
    And select carbrand as "BMW" from AnyMake dropdown
     And select "1 Series" as car model
    And select location as "ACT - All" from SelectLocation dropdown
    And select "$1,000" as price
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for Sale ACT | carsguide"
