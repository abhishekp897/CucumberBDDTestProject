package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utilities.SeleniumDriver;

public class CarsSearchPageActions {
	
	CarSearchPageLocators carSearchPageLocators = null;
	
	public CarsSearchPageActions()
	{
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),carSearchPageLocators);
	}
	
	public void selectCarMakeDropDown(String carBrand)
	{
		Select carMaker = new Select(carSearchPageLocators.carMakeDropDown);
		carMaker.selectByVisibleText(carBrand);
	}
	public void selectCarModelDropDown(String carModel)
	{
		Select carMaker = new Select(carSearchPageLocators.carModelDropDown);
		carMaker.selectByVisibleText(carModel);
	}
	public void selectCarLocationDropDown(String location)
	{
		Select carMaker = new Select(carSearchPageLocators.carLocationDropDown);
		carMaker.selectByVisibleText(location);
	}
	public void selectCarPriceDropDown(String carPrice)
	{
		Select carMaker = new Select(carSearchPageLocators.carPriceDropDown);
		carMaker.selectByVisibleText(carPrice);
	}
	
	public void clickOnFindMyNextCarBtn()
	{
		carSearchPageLocators.findMyCarButton.click();
	}
	
}
