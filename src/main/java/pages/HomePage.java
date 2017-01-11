package pages;

import org.openqa.selenium.By;

import enums.Url;
import utils.CommonUtils;


public class HomePage extends CommonUtils{
	private final By LATEST_NEWS_TITLE = By.xpath("//div[@class='news-post__listing-header']/header/h2");
	public final By INVESTORS_LINK = By.cssSelector("a[title='Financial']");
	//private final By INDUSTRY_LINKS = By.xpath("//*[@class='offerlist__item']");
	private final By CLICK_ON_CAREERS_LINK = By.linkText("Careers");
	
		
	public void navigateToHomePage(){
		navigateToURL(Url.BASE_URL.getUrl());
	}
	
	public CareersPage gotoCareersPage(){
		getElement(CLICK_ON_CAREERS_LINK);
		click(CLICK_ON_CAREERS_LINK);
		return new CareersPage();
	}
	
	public String getLatestNewsText(){
		waitUntilElementIsDisplayedOnScreen(LATEST_NEWS_TITLE);
		return getElementText(LATEST_NEWS_TITLE);
	}
	
	
	
		
	public void clickOnFinancial(){
		waitUntilElementIsDisplayedOnScreen(INVESTORS_LINK);
		click(INVESTORS_LINK);
	}
		
}
