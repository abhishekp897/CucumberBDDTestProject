$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate search cars page is working",
  "description": "In order to validate that \nthe search cars page is working fine \nwe will do the acceptance testing.",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 4320641737,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate search cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the Home Page \"https://www.carsguide.com.au\" of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I move to car for sell menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 10
    },
    {
      "cells": [
        "buy + sell"
      ],
      "line": 11
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on search cars link",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select carbrand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select \"1 Series\" as car model",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select location as \"ACT - All\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select \"$1,000\" as price",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the page title should be \"Bmw 1 Series Under 1000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SearchCarsSteps.i_am_on_the_home_page_of_cars_guide_com_website(String)"
});
formatter.result({
  "duration": 5106266147,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_car_for_sell_menu(String\u003e)"
});
formatter.result({
  "duration": 1792869663,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.click_on_search_cars_link()"
});
formatter.result({
  "duration": 2557683163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_car_brand_as_from_any_make_dropdown(String)"
});
formatter.result({
  "duration": 626138344,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 8
    }
  ],
  "location": "SearchCarsSteps.select_car_model_as_from_any_model_dropdown(String)"
});
formatter.result({
  "duration": 209513655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_car_location_as_from_any_location_dropdown(String)"
});
formatter.result({
  "duration": 172253131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,000",
      "offset": 8
    }
  ],
  "location": "SearchCarsSteps.select_car_price_as_from_price_dropdown(String)"
});
formatter.result({
  "duration": 174587186,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.click_on_find_my_next_car_button()"
});
formatter.result({
  "duration": 3741919098,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 188083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 1000 for Sale ACT | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 136192028,
  "status": "passed"
});
formatter.after({
  "duration": 467403859,
  "status": "passed"
});
});