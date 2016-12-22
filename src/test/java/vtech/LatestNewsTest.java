package vtech;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LatestNewsTest {

	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/software/browser drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://valtech.com");
	}
	
	@Test
	public void checkLatestNewsTitle(){
		String latestNews = driver.findElement(By.xpath("//div[@class='news-post__listing-header']/header/h2")).getText();
		Assert.assertEquals("LATEST NEWS", latestNews);
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
}
