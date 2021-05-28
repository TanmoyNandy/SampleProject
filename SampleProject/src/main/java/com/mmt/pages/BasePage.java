package com.mmt.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mmt.support.waits.ExplicitWaitFactory;
import com.mmt.support.waits.WaitStrategy;

/*
 * This class contains wrapper functions of commonly used user actions
 * This class is inherited by all the other page object classes
 */
public class BasePage {

	protected void click(By by, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.explicitlyWaitForElement(by, waitStrategy).click();
	}

	protected void sendKeys(By by, WaitStrategy waitStrategy, String value) {
		ExplicitWaitFactory.explicitlyWaitForElement(by, waitStrategy).sendKeys(value);
	}

	protected boolean isDisplayed(By by, WaitStrategy waitStrategy) {
		return ExplicitWaitFactory.explicitlyWaitForElement(by, waitStrategy).isDisplayed();
	}

	protected List<WebElement> findElements(By by, WaitStrategy waitStrategy) {
		return ExplicitWaitFactory.explicitlyWaitForElements(by, waitStrategy);
	}
}
