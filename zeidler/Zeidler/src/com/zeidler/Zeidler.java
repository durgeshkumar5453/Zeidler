package com.zeidler;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zeidler {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium_WebDriver/Zeidler/Chrome/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "/home/mobileware12/Documents/workspace/MerchantPortalBackend/Firefox/geckodriver");
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void loginTimber() throws InterruptedException {
		driver.get("https://demo.bigtreecms.org/admin/login/");
		Thread.sleep(3000);
		driver.findElement(By.id("user")).sendKeys("demo@bigtreecms.org");
		driver.findElement(By.id("password")).sendKeys("demo");
		driver.findElement(By.className("blue")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	public void clickOnFiles() throws InterruptedException {

		driver.findElement(By.linkText("Files")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Test(priority = 3)
	public void clickOnAddImages() throws InterruptedException {

		driver.findElement(By.linkText("Add Images")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Test(priority = 4)
	public void uploadFile() throws InterruptedException, AWTException {

		WebElement upload = driver.findElement(By.id("file_manager_dropzone"));
		upload.click();
		Thread.sleep(2000);
		StringSelection ss = new StringSelection("C:\\Users\\Durgesh\\.VirtualBox\\Desktop\\zeidler\\Zeidler\\ram.PNG");
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		driver.findElement(By.className("js-continue-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("blue")).click();
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(7000);
		driver.findElement(By.className("blue")).click();
		Thread.sleep(7000);
		driver.findElement(By.className("blue")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("blue")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("blue")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("blue")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("blue")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("blue")).click();
		Thread.sleep(8000);

	}

	@Test(priority = 5)
	public void editImages() throws InterruptedException {
		driver.findElement(By.linkText("Files")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("view_action")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 6)
	public void deleteImages() throws InterruptedException {
		driver.findElement(By.linkText("Files")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("icon_delete")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(3000);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();

	}

}
