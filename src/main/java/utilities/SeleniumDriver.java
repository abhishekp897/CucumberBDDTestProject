package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	public static SeleniumDriver seleniumDriver;
	
	// init webdriver
	
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	
	// defining a driver 
	// whenever we are creating a object of seleniumDriver class all the time constructor will get call and i dont want that, it should not create a object of chromeDriver again and again. hence private constructor
	
	private SeleniumDriver()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/abhishekp/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	//comman keywords and methods
	
	public static void openPage(String url)
	{
		driver.get(url);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void setUpDriver()
	{
		if(seleniumDriver == null)
		{
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
}
