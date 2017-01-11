package utils;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public abstract class CommonUtils {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	public Actions actions;
	public Select select;
	private static int timeout = 10;
		
	public CommonUtils(){
		driver = DriverUtils.getDriver();
		
	}
	
	public void navigateToURL(String uRL){
		try{
			driver.navigate().to(uRL);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void navigateBackTo(){
		try{
			driver.navigate().back();
		}catch (Throwable e){
			System.out.println("FAILURE : COULD NOT NAVIGATE BACK TO PREVIOUS PAGE");
			e.printStackTrace();
		}
	}
	
	public WebElement getElement(By selector){
		try{
			return driver.findElement(selector);
		}catch(Exception e){
			
		}
		return null;
	}
	
	public String getElementText(By selector){
		try{
			waitUntilElementIsDisplayedOnScreen(selector);
			return StringUtils.trim(driver.findElement(selector).getText());
		}catch(Exception e){
			e.printStackTrace();
		}
			return null;
	}
	
	public void waitUntilElementIsDisplayedOnScreen(By selector){
		try{
			wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	public void click(By selector){
		WebElement element = getElement(selector);
		waitForElementToBeClickable(selector);
		try{
			element.click();
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	public void waitForElementToBeClickable(By selector) {
        try {
            wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.elementToBeClickable(selector));
        } catch (Exception e) {
        	e.printStackTrace();
            
        }
    }
	
	public void waitForElementToBeVisible(By selector){
		try{
			wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.presenceOfElementLocated(selector));
		}catch (Exception e) {
			e.printStackTrace();
            }
	}
	
	public List<WebElement> getElements(By selector){
		waitForElementToBeVisible(selector);
			try{
				return driver.findElements(selector);
			}catch (Exception e){
				e.printStackTrace();
			}
			return null;
			
	}
	
	public String getPageTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
        	e.printStackTrace();
          }
		return null;
		
    }
	
	  
		public void tearDown(){
			DriverUtils.tearDown();
		}
	
	
		
	
}
