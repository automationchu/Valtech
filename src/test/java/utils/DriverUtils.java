package utils;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {

	public static WebDriver driver;
	
	@BeforeClass
	public static WebDriver getDriver() {
		try{
			if ( driver == null) {
	        	System.setProperty("webdriver.gecko.driver", "C:/software/browser drivers/geckodriver.exe");
	        	driver = new FirefoxDriver();
	        	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
			}
		}catch (Exception e){
				
			System.out.println("Failure to load WebDriver \n"  +e);
		}
		return driver;
        
        
	}
	
	@AfterClass
	public static void tearDown(){
		driver.close();
		driver.quit();
	}
}
