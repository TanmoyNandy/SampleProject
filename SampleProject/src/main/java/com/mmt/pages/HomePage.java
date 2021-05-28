package com.mmt.pages;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.mmt.support.waits.WaitStrategy;
import com.mmt.testdata.excel.pojo.HomePageData;

public class HomePage extends BasePage {
	
	private final By BODY = By.xpath("//body");
	private final By LNK_FLIGHTS = By.xpath("//span[text()='Flights']");
	private final By RADIO_ONEWAY = By.xpath("//li[@data-cy='oneWayTrip']");
	private final By TXT_FROMCITY = By.xpath("//label[@for='fromCity']/descendant::input");
	//private final By TXT_TOCITY = By.xpath("//label[@for='toCity']/descendant::input");
	private final By DT_DEPARTURE = By.xpath("//div[@class='DayPicker-Day']");
	private final By BTN_SEARCH = By.xpath("//a[text()='Search']");
	
	private String srcCityName = "//p[text()='%s, India']";
	private String destCityName = "//p[text()='%s, India']";
	
	
	
	public void selectFlight() {
		click(BODY, WaitStrategy.NONE);
		click(LNK_FLIGHTS, WaitStrategy.CLICKABLE);
	}
	
	
	public void selectOneWayTrip() {
		click(RADIO_ONEWAY, WaitStrategy.CLICKABLE);
	}
	
	
	public void chooseSourceAndDestinationCities(String source, String destination) {
		click(TXT_FROMCITY, WaitStrategy.CLICKABLE);
				
		srcCityName = String.format(srcCityName, source);
		click(By.xpath(srcCityName), WaitStrategy.CLICKABLE);
		
		destCityName = String.format(destCityName, destination);
		click(By.xpath(destCityName), WaitStrategy.CLICKABLE);		
	}
	
	
	public void choosedate(HashMap<String, String> data) {	
		
		HomePageData hp = new HomePageData(data);		
		List<WebElement> dates = findElements(DT_DEPARTURE, WaitStrategy.PRESENT);		
		for(WebElement date:dates) {
			if(date.getAttribute("aria-label").contains(hp.getDepartureDate())) {
				date.click();
				break;
			}
		}
	}
	
	
	public void clickOnSearch() {
		click(BODY, WaitStrategy.NONE);
		click(BTN_SEARCH, WaitStrategy.CLICKABLE);		
	}
}
