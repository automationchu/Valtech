package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonUtils;

public class ValtechOfficesPage extends CommonUtils {

	private final By VALTECH_OFFICES = By.xpath("//ul[@class='contactcities']/li");
	
		public void getGetValtechOffices(){
			int loopcount = 0;
			
			List<WebElement> getValtechOffices = getElements(VALTECH_OFFICES); 
			waitUntilElementIsDisplayedOnScreen(VALTECH_OFFICES);
			for(int i = 0; i < getValtechOffices.size(); i++){
				System.out.println(getValtechOffices.get(i).getText());
				loopcount++;
				
			}
			System.out.println("The total number of Valtech Offices worldwide: "+loopcount);
		}
}
