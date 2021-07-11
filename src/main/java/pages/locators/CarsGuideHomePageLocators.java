package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	@FindBy(how = How.LINK_TEXT, using="buy + sell")
	public WebElement buyAndSellLink;
	
	@FindBy(how = How.LINK_TEXT, using="Sell my car")
	public WebElement sellMyCarLink;
	
	@FindBy(how = How.LINK_TEXT, using="reviews")
	public WebElement carReviewsLink;
	
	@FindBy(how = How.LINK_TEXT, using="Search Cars")
	public WebElement searchCarsLink;
	
	@FindBy(how = How.LINK_TEXT, using="Used")
	public WebElement usedCarsLink;
}
