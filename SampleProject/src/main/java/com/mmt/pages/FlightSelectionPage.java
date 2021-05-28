package com.mmt.pages;

import org.openqa.selenium.By;

import com.mmt.support.waits.WaitStrategy;

public class FlightSelectionPage extends BasePage {

	private final By BTN_OKAYGOTIT = By.xpath("//button[text()='OKAY, GOT IT!']");
	private final By BTN_VIEWPRICES = By.xpath("(//span[text()='View Prices'])[position()=1]");
	private final By BTN_FIRSTBOOKNOW = By.xpath("(//button[text()='Book Now'])[position()=1]");
	
	
	
	public void viewPriceOfFirstFlight() {
		if(isDisplayed(BTN_OKAYGOTIT, WaitStrategy.CLICKABLE)) {
			click(BTN_OKAYGOTIT, WaitStrategy.NONE);
		}
		click(BTN_VIEWPRICES, WaitStrategy.CLICKABLE);
	}
	
	
	
	public void bookTheFlight() {
		click(BTN_FIRSTBOOKNOW, WaitStrategy.CLICKABLE);
	}
}
