package vtech;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactTest {

	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/software/browser drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://valtech.com");
	}
	
	@Test
	public void ContactOfficesTest(){
		WebElement clickOnGlobalIcon = driver.findElement(By.xpath("//div/i[@data-icon='earth-contact']"));
		clickOnGlobalIcon.click();
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='contactcities']/li"));
		
		for (int i =0; i < links.size(); i++){
			System.out.println(links.get(i).getText());
		}
		System.out.println("The total number of Valtech Offices: "+links.size());
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
}
