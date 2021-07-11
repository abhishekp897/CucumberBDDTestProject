package pages.actions;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators = null;
	
	public CarsGuideHomePageActions()
	{
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	
	public void moveToBuyAndSellCarsMenu()
	{
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyAndSellLink).perform();;
		
	}
	public void clickOnSearchCarsMenu()
	{
		carsGuideHomePageLocators.searchCarsLink.click();
	}
	
	public void clickOnUsedCarsMenu()
	{
		moveToBuyAndSellCarsMenu();
		carsGuideHomePageLocators.usedCarsLink.click();
	}
	
	public void clickOnSellMyCarsMenu()
	{
		
		moveToBuyAndSellCarsMenu();
		carsGuideHomePageLocators.sellMyCarLink.click();
	}
}
