package testcases;

import org.junit.Assert;
import org.junit.Test;

import enums.Url;
import pages.CareersPage;
import pages.HomePage;
import pages.ValtechOfficesPage;

public class ValtechTest{

	HomePage homePage = new HomePage();
	CareersPage careersPage = new CareersPage();
	ValtechOfficesPage valtechOfficesPage = new ValtechOfficesPage();
	
	 
	@Test
	public void CheckLatestNewsTitleTest(){ 
	homePage.navigateToURL(Url.BASE_URL.getUrl());
	Assert.assertEquals("LATEST NEWS", homePage.getLatestNewsText());
	}
	
	@Test
	public void TitleHeaderCareersTest(){
		careersPage.navigateToCareersPage();
		Assert.assertEquals("Careers", careersPage.getCareersHeaderText());
	}
	 
	@Test
	public void GetNumberOfValtechOfficesTest(){ 
		careersPage.clickOnGlobalIcon();
		valtechOfficesPage.getGetValtechOffices();
	}
	
	
}
