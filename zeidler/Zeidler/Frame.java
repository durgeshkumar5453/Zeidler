import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame {
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E://Selenium_WebDriver//Amazon//Chrome//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "/home/mobileware12/Documents/workspace/MerchantPortalBackend/Firefox/geckodriver");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();	
	}
	
	
	@Test
	public void goToHomePage()
	{
		Driver.get("http://demo.guru99.com/test/guru99home/");
		
	}
}
