package com.mmt.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.mmt.drivers.DriverManager;
import com.mmt.support.waits.ExplicitWaitFactory;
import com.mmt.support.waits.WaitStrategy;

public class ReviewBookingPage extends BasePage {

	private final By TXT_REVIEWBOOKING = By.xpath("//h4[text()='Review your booking']");
	
	
	public String reviewBookingTextPresent() {
		ArrayList<String> windows = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(windows.get(1));
		return ExplicitWaitFactory.explicitlyWaitForElement(TXT_REVIEWBOOKING, WaitStrategy.VISIBLE).getText();
	}
}
