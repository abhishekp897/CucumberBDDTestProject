package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utilities.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsSearchHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions  = new CarsSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_home_page_of_cars_guide_com_website(String webSiteURL) {
		SeleniumDriver.openPage(webSiteURL);
	}
	
	@When("^I move to car for sell menu$")
	public void i_move_to_car_for_sell_menu(List<String> list) {
	    
	    String menu = list.get(1);
	    System.out.println(menu);
	    carsSearchHomePageActions.moveToBuyAndSellCarsMenu();
	    
	    
	}
	@And("Click on search cars link")
	public void click_on_search_cars_link() {
		carsSearchHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_car_brand_as_from_any_make_dropdown(String carBrand) {
		carsSearchPageActions.selectCarMakeDropDown(carBrand);
	    
	}

	/*@When("^Select car brand as \"([^\"]*)\"  from AnyMake dropdown")
	public void select_car_brand_as_from_any_make_dropdown(String carBrand) {
		carsSearchPageActions.selectCarMakeDropDown(carBrand);
	   
	}*/

	@And("^select \"([^\"]*)\" as car model$")
	public void select_car_model_as_from_any_model_dropdown(String carModel) {
		carsSearchPageActions.selectCarModelDropDown(carModel);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_car_location_as_from_any_location_dropdown(String location) {
		carsSearchPageActions.selectCarLocationDropDown(location);  
	}
	
	@And("^select \"([^\"]*)\" as price$")
	public void select_car_price_as_from_price_dropdown(String carPrice) {
		carsSearchPageActions.selectCarPriceDropDown(carPrice);
	}
	/*@When("^Select car price as  \"([^\"]*)\" from price dropdown")
	public void select_car_price_as_from_price_dropdown(String carPrice) {
		carsSearchPageActions.selectCarPriceDropDown(carPrice);
	   
	}*/

	@And("^click on Find_My_Next_Car button$")
	public void click_on_find_my_next_car_button() {
		carsSearchPageActions.clickOnFindMyNextCarBtn();
	    
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	    System.out.println("cars list found");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedPageTitle) {
		String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
	    System.out.println("Actual page title-->"+ActualPageTitle);
	    System.out.println("Expected page title-->"+expectedPageTitle);
	    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	}

}
