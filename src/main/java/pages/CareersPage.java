package pages;

import org.openqa.selenium.By;

import enums.Url;
import utils.CommonUtils;

public class CareersPage extends CommonUtils{

	private final By CAREERS_HEADER_TEXT = By.cssSelector("[class='page-header']>h1");
	private final By CLICK_ON_GLOBAL_ICON = By.xpath("//div/i[@data-icon='earth-contact']");
	
	public void navigateToCareersPage(){
		navigateToURL(Url.CAREERS_URL.getUrl());
	}
	public String getCareersHeaderText(){
		waitForElementToBeVisible(CAREERS_HEADER_TEXT);
		return getElementText(CAREERS_HEADER_TEXT);
	}
	
	public ValtechOfficesPage clickOnGlobalIcon(){
		getElement(CLICK_ON_GLOBAL_ICON);
		waitForElementToBeClickable(CLICK_ON_GLOBAL_ICON);
		click(CLICK_ON_GLOBAL_ICON);
		return new ValtechOfficesPage(); 
	}
}
