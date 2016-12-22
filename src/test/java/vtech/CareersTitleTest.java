package vtech;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CareersTitleTest {

	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/software/browser drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://valtech.com");
	}
	
	@Test
	public void checkServicesTitle(){
		WebElement clickOnServicesLink = driver.findElement(By.linkText("Careers"));
		clickOnServicesLink.click();
		String careersHeaderText = driver.findElement(By.xpath("//div[@class='page-header']/h1")).getText();
		Assert.assertEquals("Careers", careersHeaderText);
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
}
